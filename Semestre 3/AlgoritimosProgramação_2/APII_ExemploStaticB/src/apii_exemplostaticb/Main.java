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
public class Main {
    public static void main(String[] args) {
        ExemploStatic e1 = new ExemploStatic();
        ExemploStatic e2 = new ExemploStatic();
        ExemploStatic e3 = new ExemploStatic();
        System.out.println(e1.getNumero());
        System.out.println(e2.getNumero());
        System.out.println(e3.getNumero());
        System.out.println(ExemploStatic.proximoNumero());

        
       // e1.numero = 10;
       // e1.sequencia = 2;
       // System.out.println(e2.sequencia);
    }
    
}
