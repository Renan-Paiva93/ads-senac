/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author renan.paiva
 */
public class mediaAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        //[]indica 
        double[] vect = new double[n];
        
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;
        
        System.out.printf("A médida dos numeros são: %.2f%n", media);
    }
    
}
