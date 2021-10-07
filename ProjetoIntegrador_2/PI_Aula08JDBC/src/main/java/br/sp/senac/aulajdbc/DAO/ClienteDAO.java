
package br.sp.senac.aulajdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author renan.paiva
 */
public class ClienteDAO {
    
    public static String  url="jdbc:mysql://localhost:3307/exemplojdbc" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login="root";
    public static String senha="";
    
public static boolean salvar(String nome, String CPF){

    boolean retorno = false;
    Connection conexao = null;

    try {
      //Passo 1 - informar qual o driver vamos utilizar
      Class.forName("com.mysql.cj.jdbc.Driver");
     
      //Passo 2 - Utilizar o DriverManager para criar um objeto de conexão
      conexao = DriverManager.getConnection(url,login,senha);
     
      //Passo 3 - Criar um objeto Statement
      Statement instrucaoSQL = conexao.createStatement();

      //Passo 4 - Executar o comando SQL
      int linhasAfetadas = instrucaoSQL.executeUpdate("INSERT INTO cliente (nome,cpf) values('" 
                                                        + nome 
                                                        + "','" 
                                                        + CPF + "')");
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
}
    