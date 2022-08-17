
package com.mycompany.prova.grafos_prova;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Vertice<TIPO> {
    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestaEntrada;
    private ArrayList<Aresta<TIPO>> arestaSaida;
    
    public Vertice(TIPO valor){
        this.dado = valor;
        this.arestaEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestaSaida = new ArrayList<Aresta<TIPO>>();
    }

    /**
     * @return the dado
     */
    public TIPO getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(TIPO dado) {
        this.dado = dado;
    }
    
    public void adicionarArestaEntrada(Aresta<TIPO> aresta) {
        this.arestaEntrada.add(aresta);
    }
    
    public void adicionarArestaSaida(Aresta<TIPO> aresta) {
        this.arestaSaida.add(aresta);
    }

    public ArrayList<Aresta<TIPO>> getArestaEntrada() {
        return arestaEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestaSaida() {
        return arestaSaida;
    }
    
    
}
