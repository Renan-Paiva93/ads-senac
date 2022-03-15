
package Aulas;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo_SelSort_01 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in,"latin1");
            
        System.out.println("Programa: Exemplo_SelSort_01.class\n");
        
        String nomes[][] = new String[6][1];
        int i;
        for(i=0;i<6;i++){
            nomes[i][0] = ler.next();
        }
        
        ssort(nomes, 6);
        
        for(i=0;i<6;i++){
            System.out.println(Arrays.toString(nomes[i]));
        }
            
        
    }
    
    static void ssort(String [][]v, int tam){
        int i, min, j;
        String k[];
        for(i=0;i<(tam-1);i++){
            min = i;
            for(j=(i+1);j<tam;j++){
                if(Arrays.toString(v[j]).compareToIgnoreCase(Arrays.toString(v[min]))<0){
                    min=j;
                }
            }
            if(i!=min){
                k = v[i];
                v[i] = v[min];
                v[min] = k;
            }
        }
    }


        
    }
    

