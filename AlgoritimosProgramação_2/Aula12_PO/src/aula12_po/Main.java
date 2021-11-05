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
        
        Fracao f1 = new Fracao(3, 4);
        Fracao f2 = new Fracao(3, 2);
        Fracao soma = f1.soma(f2);

        f1.apresentar();
        f2.apresentar();
        soma.apresentar();
  
        
        //System.out.println(f1.getNumerador() + "/" + f1.getDenominador());
        
        //System.out.println(f2.getNumerador() + "/" + f2.getDenominador());
        

        //System.out.println(soma.getNumerador() + "/" + soma.getDenominador());
        
        
    } 
}
