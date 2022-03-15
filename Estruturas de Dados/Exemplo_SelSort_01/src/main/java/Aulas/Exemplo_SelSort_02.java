

package Aulas;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Exemplo_SelSort_02 {
   
    public static void main(String[] args) {
        
        int quantidade = 5000;
        int[] vetor = new int[quantidade];
        for(int i=0;i<vetor.length;i++){
            vetor[i] = (int) (Math.random()*quantidade);
        }
        long tempoInicial = System.currentTimeMillis();
        
        selectionSort(vetor);
        
        long tempoFinal = System.currentTimeMillis();
        
        System.out.println("Executando em = " + (tempoFinal - tempoInicial) + "ms");
        
    }
    
    public static void selectionSort(int[] array){
        for(int fixo = 0;fixo<array.length - 1;fixo++){
            int menor= fixo;
            for(int i = menor + 1; i< array.length;i++){
                if(array[i]<array[menor]){
                    menor = i;
                }
            }
            if(menor!=fixo){
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
        
        System.out.println(Arrays.toString(array));
    }
    
}




