/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.aulajdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class ClienteDAO {
    
    public String url="jdbc:mysql://localhost:3306/exemplojdbc" + "?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public String login="";
    public String senha="";
    
    public static void salvar(String nome, String CPF) throws SQLException{
        
        Connection conexao = null;
        
        try {
      //Passo 1 - informar qual o driver vamos utilizar
      Class.forName("com.mysql.cj.jdbc.Driver");

      //Passo 2 - Utilizar o DriverManager para criar um objeto de conexão
      conexao = DriverManager.getConnection(url,login,senha);
     
      //Passo 3 - Criar um objeto Statement
      Statement instrucaoSQL = conexao.createStatement();

      //Passo 4 - Executar o comando SQL
      //int linhasAfetadas = instrucaoSQL.executeUpdate("INSERT INTO cliente (nome,cpf) values('" 
                //      + nome 
                //      + "','" 
                //     + CPF + "')");
      
      PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (nome,cpf) values (?,?) ");

      comandoSQL.setString(1, nome);

      comandoSQL.setString(2,CPF);

       

      int linhasAfetadas = comandoSQL.executeUpdate();
   
      
    } catch (ClassNotFoundException ex) {
      System.out.println("Erro:" + ex.getMessage());
        
        }   
    }
    
    private static ArrayList<Cliente> listarClientes(){
       
        Connection conexao = null;
        
        try{
            Class.forName("    ");
            conexao =  DriverManager.getConnection(url, login, senha);
            
            PreparedStatement sql = conexao.prepareStatement("Select * FROM cliente");
            
        } cath(Exception e){
        
    }
    }
}