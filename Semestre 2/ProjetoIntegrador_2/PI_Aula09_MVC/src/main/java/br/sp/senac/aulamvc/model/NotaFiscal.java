/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sp.senac.aulamvc.model;

/**
 *
 * Definir as estruturas da classes
 * criar atributos, compotentes da nota fiscla
 * 
 */
public class NotaFiscal {
    

    private int idNota;
    private int numeroNota;
    private double valorNota;
    
    public NotaFiscal(){
        //Todo: Definir comportamento padrão
    }
    

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }
    
    
}
