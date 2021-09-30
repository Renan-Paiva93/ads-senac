package com.mycompany.pi_aula02;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Criei o objeto chamando o construtor vazio
        Geladeira novaGeladeira = new Geladeira();
        //System.out.println(novaGeladeira.getCor());
        
        double capacidade = novaGeladeira.getCapacidade();
        System.out.println(String.valueOf(capacidade));
        
        novaGeladeira.setCapacidade(40.0);
        System.out.println(String.valueOf(novaGeladeira.getCapacidade()));
        
        //Geladeira outraGeladeira = new Geladeira("prata");
        //System.out.println(outraGeladeira.getCor());
        
        //Adicionar o metodo - aumentar a temperadura sem parametro
        //novaGeladeira.aumentarTemperatura();
        //novaGeladeira.aumentarTemperatura();
        //novaGeladeira.aumentarTemperatura(4);
        
        //System.out.println(String.valueOf(novaGeladeira.getTemperadura()));
        
        
    }
    
}
