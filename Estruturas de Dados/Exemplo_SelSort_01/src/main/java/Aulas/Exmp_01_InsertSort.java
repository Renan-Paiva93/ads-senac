/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

import java.util.Random;

/**
 *
 * @author Dell
 */
public class Exmp_01_InsertSort {
    
    final static int TAM=10; // Declara o tamanho do vetor;
    
    public static void main(String[] args) {
        
        int vVetor[] = new int[TAM];
        int vAux;
        
        Random random = new Random();
        
        System.out.println("\n Números sorteados\n");
        
        for (vAux=0; vAux < TAM; vAux ++) {
            vVetor[vAux] = random.nextInt(100); // Preenche o vetor com valores aleatórios;
            System.out.println(vVetor[vAux]);
        }
        
        System.out.println("\nNúmeros ordenados!\n");
        
        fInsertion_Sort(vVetor); // Chama a função de Ordenação;
        
        for (vAux=0; vAux < TAM; vAux++) {
            System.out.println(vVetor[vAux]);
        } 
    }
    
    private static void fInsertion_Sort(int[] pVetor) {
        int vAux;
        int vTemp;
        int vTroca;
        
        for (vAux=1; vAux < TAM; vAux++) { // vAux começa na posição 1 do vetor e vai até a ultima posição;
            vTemp = vAux;  // vTemp recebe a posição que está passando no "for";
            
            while(pVetor[vTemp] < pVetor[vTemp-1]){ // Enquanto o valor /que está passando na posição "vTemp" for menor que a
                                                    //posição "vTemp" menos 1, ocorre a troca;
                vTroca = pVetor[vTemp];
                pVetor[vTemp] = pVetor[vTemp-1];
                pVetor[vTemp-1] = vTroca;
                vTemp--; // vTemp decrementa 1;
                
                if(vTemp == 0) // Quando "vTemp" chegar na posição 0,
                              //primeira posição do vetor, o laço while para;
                break;
                  
            }
        }
        
    }
   
}
