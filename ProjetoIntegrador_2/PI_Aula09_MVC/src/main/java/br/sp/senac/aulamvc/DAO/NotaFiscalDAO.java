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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A DAO conversa com BANCO DE DADOS
 */
public class NotaFiscalDAO {
    
    public static String url="jdbc:mysql://localhost:3306/basenotafiscal?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login="root";
    public static String senha="admin";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";
   
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
    
    public static ArrayList<NotaFiscal> consultar() {
        
        ArrayList<NotaFiscal> listaRetorno = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null; // retorna obj que consulta no banco
        
        try {
            //ETAPA 1 - Carregadr o driver
                Class.forName("com.mysql.cj.jdbc.Driver");
          
          //ETAPA 2  - Abrir conexao (banco de dados)
          conexao = DriverManager.getConnection(url, login, senha);
          
          //ETAPA 3 - Executar um comando SQL
         instrucaoSQL = conexao.prepareStatement("SELECT * FROM NotaFiscal");
         
        rs = instrucaoSQL.executeQuery();
        
        while(rs.next()){
            
            NotaFiscal obj = new NotaFiscal();
            obj.setIdNota(rs.getInt("idNota"));
            obj.setNumeroNota(rs.getInt("numeroNota"));
            obj.setValorNota(rs.getDouble("valorNota"));
            
            listaRetorno.add(obj);
            
        }
            
            
        } catch (Exception e) {
            
            listaRetorno = null;
            
        } finally {
            
            if(conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NotaFiscalDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        return listaRetorno;
        
    }
    
    public static boolean excluir(int ID){
        
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        
        
        //PreparedStament instrucaoSQL = null;
        
        
        try {
            //ETAPA 1 - Carregadr o driver
                Class.forName("com.mysql.cj.jdbc.Driver");
          
          //ETAPA 2  - Abrir conexao (banco de dados)
          conexao = DriverManager.getConnection(url, login, senha);
          
          instrucaoSQL = conexao.prepareStatement("DELETE FROM NotaFiscal WHERE idNota = ?");
          
          instrucaoSQL.setInt(1, ID);

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
