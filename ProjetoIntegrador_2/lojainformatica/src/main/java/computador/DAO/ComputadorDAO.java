/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.DAO;

import computador.Model.Computador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author renan.paiva
 */
public class ComputadorDAO {
    
    public static String  url="jdbc:mysql://localhost:3307/lojainformatica" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login="root";
    public static String senha="";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static boolean salvar(String processador, String hd){

    boolean retorno = false;
    Connection conexao = null;

    try {
      //Passo 1 - informar qual o driver vamos utilizar
      Class.forName(DRIVER);
     
      //Passo 2 - Utilizar o DriverManager para criar um objeto de conexão
      conexao = DriverManager.getConnection(url,login,senha);
    
    PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO computador (processador,hd) values (?,?) ");

      comandoSQL.setString(1, processador);
      comandoSQL.setString(2,hd);

      int linhasAfetadas = comandoSQL.executeUpdate();
  
      if(linhasAfetadas>0){
        retorno = true;

      }else{
        retorno = false;
        throw new Exception("Não foi possível inserir o computador");
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

public static ArrayList<Computador> listarComputadores(){
    
    Connection conexao = null;
    ArrayList<Computador> listaRetorno = new ArrayList<Computador>();

    ResultSet rs = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexao = DriverManager.getConnection(url,login,senha);

      PreparedStatement sql = conexao.prepareStatement("Select * FROM computador");
      rs = sql.executeQuery();

      while(rs.next()){
          
          
          //cliente
          
        //Lendo uma linha do resultset...
        Computador objComputador = new Computador();

        objComputador.setProcessador(rs.getString("processador"));;
        objComputador.setHd(rs.getString("hd"));
 
        listaRetorno.add(objComputador);
      }

    } catch (Exception e) {
      System.out.println("erro ao listar peças");
      
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

    public static boolean excluir(int CodPeca){
   
    Connection conexao = null;
    boolean retorno = false;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexao = DriverManager.getConnection(url,login,senha);

      PreparedStatement sql = conexao.prepareStatement("DELETE FROM computador WHERE CodPeca=?");
      sql.setInt(1, CodPeca);

     int linhasAfetadas =  sql.executeUpdate();
     
     if(linhasAfetadas>0){
         retorno =true;
     }else{
         retorno = false;
     }

    } catch (Exception e) {
      System.out.println("erro ao exckuir peças");
      
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
