/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.aulajdbc.DAO;

import java.sql.DriverManager;

/**
 *
 * @author renan.paiva
 */
public class ClienteDAO {
    
    public String url="jdbc:mysql://localhost:3307";
    public String login="root";
    public String senha="";
    
     public static void salvar(String nome, String CPF) {
        try{
            //Passo 1 - informar qual o driver que vamos utilizar
            Class.forName("com.mysql.jdbc.Driver");
            
            //Passo 2 - Utilizar o DriverManager para criar um objeto de conexão
            //Criar uma classa
            //DriverManager.getConnection(url,login,senha);
                    
                    
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro" + ex.getMessage());
        }
    }
}
