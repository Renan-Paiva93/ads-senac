/*

4) A INTERCALAÇÃO é o processo utilizado para construir uma vetor ordenado
crescentemente, de tamanho n+m, a partir de dois vetores já ordenados de tamanhos
n e m. Por exemplo, a partir das sequências abaixo:

Exemplo:
A[] = { 1, 3, 6, 7} e B[] = {2, 4, 5}, o novo vetor C é feito a partir de A[] e B[]:
C = { 1, 2, 3, 4, 5, 6, 7}

Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua
função calcula e retorna o resultado da INTERCALAÇÃO, ou seja, o vetor C[].

 */
package aula10_mergesort;

import java.util.Arrays;

/**
 *
 * @author renan.paiva
 */
public class Exer04_Lista {
    
    public static void main(String[] args) {
        int[] a = {1,3,6,7};
        int[] b = {2,4,5};
        int[] c = intercalar(a,b);
        System.out.println("VETOR C: " + Arrays.toString(c));
    }
    //criar função interlacar
    public static int[] intercalar(int[]a, int[]b){
        //construir o tamanho do vetor A e B
        int[]c = new int[a.length + b.length];
        int i = 0; //percorrer vetor a
        int j = 0; //percorrer vetor b
        int k = 0; //percorrer vetor c
        
        //laço de repetição
        while(i  < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = b[j];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }
}
