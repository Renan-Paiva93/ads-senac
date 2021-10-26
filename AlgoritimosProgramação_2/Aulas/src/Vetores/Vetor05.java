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
public class Vetor05 {
    public static void main(String[] args) {
        int v[] = new int[500];
        Arrays.fill(v, 2);
        for (int valor: v) {
            System.out.println(valor + " ");
        }
    }
    
}
