/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

/**
 *
 * @author Dell
 */
public class Aula07_OperacaoMatematica {
    
    public static void main(String[] args) {
        Matematica.mostrarCalculo(new Soma() 5, 5);
        Matematica.mostrarCalculo(new Subtracao(), 5,2);

    }
    
    public static void mostrarCalculo
            (OperacaoMatematica operacao, double x, double y) {
                System.out.println("O resultado é: " + operacao.calcular(x, y));

            }

}
