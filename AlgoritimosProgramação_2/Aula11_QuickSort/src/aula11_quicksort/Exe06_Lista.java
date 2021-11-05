/* Escreva uma função que recebe um vetor como parâmetro, a sua função seleciona o
primeiro elemento de um vetor e rearranja o vetor de forma que todos elementos
menores ou iguais ao primeiro elemento fiquem a sua esquerda e os maiores a sua
direita.
No vetor {5, 6, 2, 7, 9, 1, 8, 3, 7} após ser rearranjado teríamos
{1, 3, 2, 5, 9, 7, 8, 6, 7}.
*/
package aula11_quicksort;

import java.util.Arrays;


public class Exe06_Lista {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int[]v = {5,6,2,7,9,1,8,3};
        int p = particao(v);
        System.out.println("Posição: " + p);
        System.out.println(Arrays.toString(v));

    }
    
    public static int particao(int[] v){
        int pivo = v[0];
        int i = 1;
        int j = v.length - 1;
        while(i <= j){
            if(v[i] <= pivo){
                i++; //sobe o i
            }
            else if(v[j] > pivo){
                j--; //desce o j
            }
            else{
                int t = v[i];
                v[i] = v[j];
                v[j] = t;
                i++;
                j--;
            }
        }
        v[0] = v[j];
        v[j] = pivo;
        return j;
    }
}
