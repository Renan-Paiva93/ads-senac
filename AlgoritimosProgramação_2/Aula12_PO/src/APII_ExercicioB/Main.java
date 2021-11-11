/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APII_ExercicioB;

/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(3, 5);
        Ponto p2 = new Ponto(6, 1);
        Ponto p3 = new Ponto(3, 4);
        System.out.println("Igual = " + p1.igual(p2));
        System.out.println("Igual = " + p1.igual(p3));
        System.out.printf("Distancia = %.3f\n ", p1.distancia(p2));
        System.out.printf("Distancia = %.3f\n ", p1.distancia(p3));
        System.out.printf("Distancia = %.3f\n ", p2.distancia(p3));
    }
    
}
