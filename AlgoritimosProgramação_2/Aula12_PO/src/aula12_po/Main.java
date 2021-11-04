/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_po;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fracao f = new Fracao();
        f.numerador = 10;
        f.denominador = 2;
        System.out.println(f.numerador + "/" + f.denominador);
        
        
    } 
}
