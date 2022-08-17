/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Scanner;

/**
 *
 * @author Dell
 * 
 * Como escrever uma função na linguagem java
 */
public class SistaxeFuncoes {
    public static void main(String[] args) {
        
       /* double y = 25;
        double x = Math.sqrt(y); // chamada da função
        
        System.out.println(x); 
        */
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int higher = max(a, b, c); // função MAX, encontrar o maior dentro os nuemros inteiros
        
        showResult(higher);

    }
    
    public static int max(int x, int y, int z) {
        int aux; 
        if (x > y && x > z){
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else {
            aux =z;
        }
        return aux;
    }
    
    public static void showResult(int valeu){
        System.out.println("Higher =" + valeu);
    } 
    
}
