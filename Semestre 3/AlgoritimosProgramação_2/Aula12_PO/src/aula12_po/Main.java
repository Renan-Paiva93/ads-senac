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
        Fracao multiplicacao = f1.multiplicacao(f2);
        Fracao divisao = f1.divisao(f2);
        
        f1.apresentar();
        f2.apresentar();
        System.out.println("Soma = " + soma);
        //soma.apresentar();
        
        multiplicacao.apresentar();
        divisao.apresentar();
        
        System.out.println("Igual = " + f1.igualdade(f2));
        Fracao f3 = new Fracao(6, 4);
        System.out.println("Igual = " + f2.igualdade(f3));
        
        System.out.println(f3);
  
        
        //System.out.println(f1.getNumerador() + "/" + f1.getDenominador());
        //System.out.println(f2.getNumerador() + "/" + f2.getDenominador());
        //System.out.println(soma.getNumerador() + "/" + soma.getDenominador());
        
    } 
}
