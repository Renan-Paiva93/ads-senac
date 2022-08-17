
package com.mycompany.pi_aula02;


public class Geladeira {
    //Atributos -  O que construir
    private double temperadura;
    private String cor;
    private double capacidade = 20.0;
    private int voltagem;
   
   public double getCapacidade(){
       return this.capacidade;
   }
   
   public void setCapacidade(double novoValor){
       this.capacidade =  novoValor;
   }
    
    //Construtor 1
    public Geladeira(){
        cor = "roxa";
    }
    
     public Geladeira(String pCor){
        this.cor = pCor;
    }
    
    
    
     //Construtor 2 - Como vou construir - Instruções adicionais
    public Geladeira(int pVoltagem){
        cor = "roxa";
        this.voltagem = pVoltagem;//especificar a propriedade da classe atual
    }
    
    //Métodos acessores
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }

    public double getTemperadura() {
        return temperadura;
    }

    public void setTemperadura(double temperadura) {
        this.temperadura = temperadura;
    }

    //Açoes - Metodos
    public void ligar(){
        this.temperadura = 8.0;
    }
    
    public void desligar(){}
    
    public void gelar(){}
    
    //metodos normais
    public void aumentarTemperatura(){
       this.temperadura += 1;
    }
    
    public void aumentarTemperatura(double novaTemp){
        this.temperadura = novaTemp;
    }

}
