/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author gabriel.poliveira18
 */
public class Composite implements Component {
    private  ArrayList<Component> lista = new ArrayList<>();
    private String nome;
    
    
    public Composite(){}
    
    public Composite(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        double total = 0;
        for (Component c:lista) {
            total+= c.getPreco();
        }
        return total;
    }
    public void adicionar (Component component) {
        lista.add(component);
    }
        public void remover (Component component) {
        lista.remove(component);
    }

    public String toString() {
        return "Composite{" + "lista=" + lista + ", nome=" + nome + '}';
    } 
}
