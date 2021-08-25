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
public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3,7,6,1,9,4,2};
        for (int v:vet) {
            System.out.print(v);
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 4);
        System.out.println("Encontrei o valor na posição " + p);
    }
    
}
