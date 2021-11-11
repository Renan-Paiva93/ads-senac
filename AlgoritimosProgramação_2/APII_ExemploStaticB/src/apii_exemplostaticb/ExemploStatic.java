/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apii_exemplostaticb;

/**
 *
 * @author Dell
 */
public class ExemploStatic {
   //atributo static
    private static int sequencia = 0;
    
    
    // atributo não static
   private int numero;
   
   public ExemploStatic() {
       sequencia = sequencia +1;
       numero = sequencia;
   }
   
   // metodo não static
   public int getNumero() {
       return numero;
   }
   
   // método static = so pode acessar atributos statico
   public static int proximoNumero() {
       return sequencia + 1;
   }
    
}
