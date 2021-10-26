
package Vetores;

import entities.Rent;
import java.util.Scanner;


public class Programa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Rent[] vect = new Rent[10];
        
        System.out.println("Quantos quartos você precisa? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ";");
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Quarto> ");
            int quarto = sc.nextInt();
            vect[quarto] = new Rent (name, email);
        }
        
        System.out.println("");
        System.out.println("quarto ocupado: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
            
        }
    }
    
}
