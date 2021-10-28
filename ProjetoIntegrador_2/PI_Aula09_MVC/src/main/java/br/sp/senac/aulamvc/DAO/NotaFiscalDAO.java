/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.aulamvc.DAO;

import br.sp.senac.aulamvc.model.NotaFiscal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A DAO conversa com BANCO DE DADOS
 */
public class NotaFiscalDAO {
    
    public static String url="jdbc:mysql://localhost:3306/basenotafiscal?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login="root";
    public static String senha="";
    
   
    public static boolean salvar(NotaFiscal obj){
        
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        
        
        //PreparedStament instrucaoSQL = null;
        
        
        try {
            //ETAPA 1 - Carregadr o driver
                Class.forName("com.mysql.cj.jdbc.Driver");
          
          //ETAPA 2  - Abrir conexao (banco de dados)
          conexao = DriverManager.getConnection(url, login, senha);
          
          instrucaoSQL = conexao.prepareStatement("INERT INTO NotaFiscal(numeroNota, valorNota) VALUES (?,?");
          
          instrucaoSQL.setInt(1,obj.getIdNota());
          instrucaoSQL.setDouble(2,obj.getValorNota());
          
          int LinhasAfetadas = instrucaoSQL.executeUpdate();
          
          if(LinhasAfetadas > 0){
              
          }else{
             retorno = true; 
          }
            retorno = false;
            
        } catch (Exception e) {
            retorno = false;
        } finally {
           if(conexao != null) {
               try {
                   conexao.close(); //liberar a conexação com banco
               } catch (SQLException ex) {
                   Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
               }
           } 
        }
        return retorno;
    }
    
}
