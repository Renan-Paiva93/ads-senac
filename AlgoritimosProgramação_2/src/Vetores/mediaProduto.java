
package Vetores;

import entities.Product;
import java.util.Scanner;

/**
 *
 * @author renan.paiva
 */
public class mediaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
       
        // indicar vetor tipo do vetor com N Elementos
        Product[] vect = new Product[n];
        
        // percorrer posições do vetor
        //for (int i = 0; i < n; i++)
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); 
            String name = sc.nextLine();
            double price = sc.nextDouble();
            //estanciar para novo produto e apontar para os objetos 
            vect[i] = new Product(name, price);
        }
        
        // média dos preços
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
           soma += vect[i].getPrice();
        }
        // média
        double avg = soma / vect.length;
        
        System.out.printf("average price = %.2f%n", avg );
        
    }
    
}
