/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores;

import java.util.Arrays;

/**
 *
 * @author renan.paiva
 */
public class Vetor03 {
    public static void main(String[] args) {
        
        double v[] ={2,5,2.75,9, -4.5,8,3};
        
        Arrays.sort(v); // colocando vetor em ordem
        for(double valor: v){
            System.out.print(valor + " ");
        }
        
    }
    
}
