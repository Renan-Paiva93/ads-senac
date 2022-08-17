/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author Dell
 */
public class Exer_07 {
     public static void main (String [] args) {
        int v[] = {2,4,5,3};
            System.out.println(produto(1,0,v));

    }
            public static int produto(int produto, int posicao, int[] v) {
                if(posicao <v.length) {
                    produto = produto * v[posicao];
                    return produto (produto, posicao+1, v);
                }
                else {
                    return produto;
                }
    
}
}
