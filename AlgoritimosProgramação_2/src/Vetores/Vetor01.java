/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores;

/**
 *
 * @author renan.paiva
 */
public class Vetor01 {
    public static void main(String[] args) {
        // tamanho do vetor é 5 (0 a 5)
        int n[] = {3,2,8,7,5,4};
        // n.length = significa comprimento/Tamanha dele, terá que mostra 6 casas.
        System.out.println("Total de casas de N " + n.length);
        //contador 
        // mesma coisa que for (int c = 0; c <= 5; c++) ou numero 5 ilustra a quantidade de vetores
        for (int c = 0; c <= n.length - 1; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
    }
    
}
