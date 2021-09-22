
package com.mycompany.renanpaivaado1;


public class Raposa {
    
    //Atributos
     String nome;
     String cor;
     String sexo;
     boolean movimento;
     
    
    //construtor vazio
    public Raposa(){
      cor = "laranja";
    }
    
    
    
    //Métodos - Ações (o que ele pode fazer)
     void movimentar(){
        if (this.movimento == true){
            System.out.println("Não pode se movimentar");
        } else
            System.out.println("Estou andando");
    }
    
    public void andar(){
       this.movimento = true;
    }
    
    public void parar(){
        this.movimento = false;
    }

    public Raposa(String sexo, int velocidade) {
        this.sexo = sexo;
        this.movimento = movimento;
    }

   

    //Metodos - Acessores
    public void setMovimento(boolean movimento) {
        this.movimento = movimento;
    }

    public String getNome() {
        
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getSexo() {
        return sexo;
    }
    
  
}
