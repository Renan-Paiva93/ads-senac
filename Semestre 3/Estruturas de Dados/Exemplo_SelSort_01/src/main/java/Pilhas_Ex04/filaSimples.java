/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilhas_Ex04;

/**
 *
 * @author Dell
 */
public class filaSimples {
    
    private String[] elements;
    
    private int size;
    
    public filaSimples(int capacity) {
        
        elements = new String[Math.abs(capacity)];
        size = 0;
    }
    
    public String push(String element) {
        if(element == null)
            throw new IllegalArgumentException("O elemento não pode sernulo!");
        
    if(sif(size == elements.length)
            return null;
        size++;
        elements[getTopPosition()] = element;
        
        return element;

    }


    
}
