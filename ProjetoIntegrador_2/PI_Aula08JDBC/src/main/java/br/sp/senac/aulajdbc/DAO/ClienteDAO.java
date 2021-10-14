
package br.sp.senac.aulajdbc.DAO;

import br.sp.senac.jdbc.MODEL.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author renan.paiva
 */
public class ClienteDAO {
    
    public static String  url="jdbc:mysql://localhost:3307/exemplojdbc" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login="root";
    public static String senha="";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";
    
public static boolean salvar(String nome, String CPF){

    boolean retorno = false;
    Connection conexao = null;

    try {
      //Passo 1 - informar qual o driver vamos utilizar
      Class.forName(DRIVER);
     
      //Passo 2 - Utilizar o DriverManager para criar um objeto de conexão
      conexao = DriverManager.getConnection(url,login,senha);
     
      //Passo 3 - Criar um objeto Statement
//      Statement instrucaoSQL = conexao.createStatement();

      //Passo 4 - Executar o comando SQL
//      int linhasAfetadas = instrucaoSQL.executeUpdate("INSERT INTO cliente (nome,cpf) values('" 
//                                                        + nome 
//                                                        + "','" 
//                                                        + CPF + "')");

    PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,cpf) values (?,?) ");

      comandoSQL.setString(1, nome);
      comandoSQL.setString(2,CPF);

      int linhasAfetadas = comandoSQL.executeUpdate();
  
      if(linhasAfetadas>0){
        retorno = true;

      }else{
        retorno = false;
        throw new Exception("Não foi possível inserir o cliente");
      }
   
    } catch (ClassNotFoundException ex) {
      System.out.println("Erro:" + ex.getMessage());
      retorno = false;

    } catch(Exception ex){
      System.out.println("Erro:" + ex.getMessage());
      retorno = false;
    }
    return retorno;
  }

public static ArrayList<Cliente> listarClientes(){
    
    Connection conexao = null;
    ArrayList<Cliente> listaRetorno = new ArrayList<Cliente>();

    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexao = DriverManager.getConnection(url,login,senha);

      PreparedStatement sql = conexao.prepareStatement("Select * FROM cliente");
      rs = sql.executeQuery();

      while(rs.next()){
          
        //Lendo uma linha do resultset...
        Cliente objCliente = new Cliente();

        objCliente.setIdCliente(rs.getInt("idCliente"));
        objCliente.setCpf(rs.getString("cpf"));
        objCliente.setNome(rs.getString("nome"));
 
        listaRetorno.add(objCliente);
      }

    } catch (Exception e) {
      System.out.println("erro ao listar clientes");
      
    }finally{
        
      try {
        if(rs!=null){
            rs.close();
        }
        if(conexao!=null){
          conexao.close();
        }
      } catch (Exception e) {
      }
    }
    
    return listaRetorno;
  }

    public static boolean excluir(int idCliente){
    
    Connection conexao = null;
    boolean retorno = false;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexao = DriverManager.getConnection(url,login,senha);

      PreparedStatement sql = conexao.prepareStatement("DELETE FROM cliente WHERE idCliente=?");
      sql.setInt(1, idCliente);

     int linhasAfetadas =  sql.executeUpdate();
     
     if(linhasAfetadas>0){
         retorno =true;
     }else{
         retorno = false;
     }

    } catch (Exception e) {
      System.out.println("erro ao exckuir clientes");
      
    }finally{
        
      try {
        if(conexao!=null){
          conexao.close();
        }
      } catch (Exception e) {
      }
    }
    
    return retorno;
  }

}
    