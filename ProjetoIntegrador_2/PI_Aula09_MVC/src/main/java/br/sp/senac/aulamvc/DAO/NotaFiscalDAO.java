/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.aulamvc.DAO;

import br.sp.senac.aulamvc.model.NotaFiscal;
import java.sql.DriverManager;

/**
 *
 * @author Dell
 */
public class NotaFiscalDAO {
    
    public static String url="jdbc:mysql://localhost:3306/basenotafiscal?useTimezone=true&serverTimezone=UTC&useSSL=false";
    public static String login="root";
    public static String senha="";
    
    
    
    public static boolean salvar(NotaFiscal obj){
        
        Connection conexao = null;
        PreparedStamente instrucaoSQL = null;
        
        try {
            //Carregadr o driver
                Class.forName("com.mysql.cj.jdbc.Driver");
          
          //2º passo - abrir conexao

          conexao = DriverManager.getConnection(url, login, senha);
          
          instrucaoSQL = conexao.prepareStatement("INSERT INTO NotaFiscal VALUES (?,?)");
          instrucaoSQL.setInt(1,obj.getNumeroNota());
          instrucaoSQL.setDouble(2, obj.getValorNota());


          instrucaoSQL
            
            
        } catch (Exception e) {
            
        }
        
        //TODO: Fazer o insert no banco de dados...
        
        return false;
        
    }
    
}
