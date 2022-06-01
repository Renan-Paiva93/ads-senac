/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Ex1PesqSequencial {
    
    public static void main(String[] args) {
        
        int vetor_tst[]={8,4,0,8,3,4,6,5};
        int fun, x;
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Informe o valor a ser encontrado: ");
        x = in.nextInt();
        fun = buscaSequencial(8, vetor_tst,x);
        
        if(fun==-1){
            System.out.println("O valor não foi encontrado");
        }else {
            System.out.println("\n" + "valor encontrado do índice: " + fun);
        }
    }
    
    static int buscaSequencial(int tamanho, int vetor[], int p){
        int i;
        for(i=0;i<tamanho;i++) {
            if(vetor[i]==p){
                return i;
            }
        }
        return -1;
    }
    
}
