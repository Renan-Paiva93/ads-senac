
package com.mycompany.prova.grafos_prova;


class Aresta<TIPO> {
    private Double peso;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;
    
    public Aresta(Double peso, Vertice<TIPO> inicio,Vertice<TIPO> fim ) {
        this.peso = peso;
        this.inicio = inicio;
        this.fim = fim;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the inicio
     */
    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fim
     */
    public Vertice<TIPO> getFim() {
        return fim;
    }

    /**
     * @param fim the fim to set
     */
    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
    
    
}
