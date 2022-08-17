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
 */
/*
Exemplo - Calculadora Simples
Operações
    1) adiçãp
    2) Subtração
    3) Divisão
    4) Multiplicação
Funcções
    1) entradaDados()
    2) Menu
*/

public class CalculadoraSimples {
    
    // Scanner é global
    static Scanner input = new Scanner(System.in);
    
    static float entradaDados() {
        float n; // declando n como variável local
        System.out.println("*-- Entrada de Dados --*");
        System.out.println("Numero: ");
        n = input.nextFloat();
        return n;
    }
    
    static int menu() {
        int op;
        
        do {
            System.out.println("*-- Menu --*");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("Opção ");
            op = input.nextInt();
        }while (op < 1 || op > 4);
        
        return op;
    }
    
    static float adicao(float n1, float n2){
        System.out.println("*-- Adição --*");
        float resultado;
        resultado = n1 + n2;
        return resultado;
    }
    
       static float subtracao(float n1, float n2){
        System.out.println("*-- Subtração --*");
        float resultado;
        resultado = n1 - n2;
        return resultado;
    }
    
       static float divisao(float n1, float n2){
        System.out.println("*-- Divisão --*");
        float resultado;
        resultado = n1 / n2;
        return resultado;
    }
       
       static float multiplicacao(float n1, float n2){
        System.out.println("*-- Multiplicação --*");
        float resultado;
        resultado = n1 * n2;
        return resultado;
    }  
    
    static void imprimirResultado(float result, float n1, float n2, int op){
        System.out.println("*-- Imprimir --*");
        System.out.println("Resultado: " + result);
        System.out.printf("Resultado de \n %.2f %d %.2f é \n igual a %.2f \n", n1, op, n2, result);
        // inteiro %d
        // char %c
        // String %s
        // float %2.3f onde o número 2 significa o tamanho do número e o 3 casa decimais
    }
    
    static float controlador(int op, float n1, float n2){
        System.out.println("*-- Controlador --*");
        float resultado;
        switch (op){
            case 1:
                // chama a função de adição
                resultado = adicao(n1, n2);
                break;
            case 2:
                // chama a função de subtração
                resultado = subtracao(n1, n2);
                break;
            case 3:
                // chama a função de divisão
                resultado = divisao(n1, n2);
                break;
            case 4:
                // chama a função de multiplicação
                resultado = multiplicacao(n1, n2);
                break;
            default:
                resultado = 0;
        }
        return resultado;
    }
    
    public static void main(String[] args) { // forma de conectar todo munto
        int op = menu(); // função 
        float n1 = entradaDados();
        float n2 = entradaDados();
        float result = controlador(op, n1, n2); // operação que usuario escolher, 1° numero e 2°2 numero
        imprimirResultado(result, n1, n2, op); // 
    }
    

}
