/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilhas_Ex04;

/**
 *
 * @author Dell
 */
public class Ex_Pilha_04 {
    
    public static void main(String[] args) {
        
        
        String[] names = {
            "Mark", "Berg", "John", "Beni", "Jebb", "June",
            "Mary", "Karl", "Fred", "Hall", "Troy", "Joan"
        }
                filaSimples stack = new filaSimples(10);
                
                System.out.println("Pilha de " + stack.getCapacity() + " posições criada: " + stack);
        
        System.out.println();
        
        System.out.println("Preenchendo a pilha");
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("\tInserindo o nome \"" + names[i] + "\":\t");
            
            if(stack.push(names[i] == null)) 
                System.out.println("PILHA CHEIA!!!" impossível inserir);
                else
                System.out.println(stack + ". " + (stack.getCapacity() - stack.getSize()) +" posições restantes.");
        }
        
        System.out.println("");
        System.out.println("Removendo 5 elementos da pilha");
        
        for (int i = 1; i < = 5; i++) {
            System.out.println("\t" + i + "a. remoção: \"" + stack.pop() + "\".");
            System.out.println(" A pilha agora esta assim: " + stack);
        }
        System.out.println("");
        
        System.out.println("O atual nome no topo da pilha é \"" + stack.peek() + "\".\n");
        
        System.out.println(stack);
        
        System.out.println();
        
        stack.clear();
        
        System.out.println("Limpando a pilha: " + stack);
        
        System.out.println("");
        
        System.out.println("Consigo tirar mais algo da pilha? ");
        
        System.out.println(stack.pop() == null ? "Não consigo..." : "Consigo sim!");
    }
    
}
