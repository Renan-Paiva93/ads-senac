package Funcoes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Funcoes {
    
    static int minimo(int a, int b){ //a e b são parâmetros da função
        int min = 0; // variável local da função
        if(a < b){
            min = a;
        }
        else
        {
            min = b;
        }
        return min; // retonar o valor inteiro
    }
    
    static void imprime(int min){
        System.out.println("Menor: " + min);
    }
    
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int c = minimo(x, y);
        imprime(c);
    }
    
}
