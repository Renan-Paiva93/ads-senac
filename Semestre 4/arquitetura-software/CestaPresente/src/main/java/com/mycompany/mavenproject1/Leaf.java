/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author gabriel.poliveira18
 */
public class Leaf implements Component {
    private double preco;
    private String nome;
    
    
    public Leaf(){}
    
    public Leaf(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
}
