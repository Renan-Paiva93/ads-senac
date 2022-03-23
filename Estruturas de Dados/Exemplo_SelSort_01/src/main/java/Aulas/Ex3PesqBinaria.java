/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas;

/**
 *
 * @author Dell
 */
public class Ex3PesqBinaria {
    
    public static void main(String[] args) {
        
       Ex3PesqBinaria pesquisarNomes = new Ex3PesqBinaria();
       
       Pessoa ana = new Pessoa("Ana", 18);
       Pessoa carla = new Pessoa("Carla", 20);
       Pessoa felipe = new Pessoa("Felipe", 24);
       Pessoa patricia = new Pessoa("Patricia", 23);
       Pessoa rafael = new Pessoa("Rafael", 20);
       
       Pessoa[] pessoas = {ana, carla, felipe, patricia, rafael};
       
      int inicio = pesquisarNomes.pesquisar('A', pessoas);
      int fim = pesquisarNomes.pesquisar('F', pessoas);
      
      /* Imprime os nomes encontrados. */
      while(inicio >= 0 && inicio <= fim) {
          System.out.println(pessoas[inicio].getNome());
          inicio++;
      }
    }
    
    public int pesquisar(char letra, Pessoa[] pessoas) {
        int inicio = 0; //Posição inicial do vetor.
        int meio = 0; //Posição do meio do vetor.
        int fim = pessoas.length - 1; //Posição final do vetor.
        
        /* Enquanto a posição do inicio for menor ou igual a posição
        do fim, procura o valor de x dentro do vetor. */
        while(inicio <= fim) {
            meio = (fim + inicio) / 2; //Encontra o meio do vetor.
            
            /* Se a primeira letra do nome da pessoa que está no meio
            do vetor for igual a letra procurada, retorna o valor da
            posição do meio do vetor e para de pesquisar. */
            if(pessoas[meio].getNome().charAt(0) == letra) {
                return meio;
            }
            /* Este if serve para diminuir o tamanho do vetor pela métade. */
                /* Se a primeira letra do nome da pessoa que está no meio
                do vetor for menor que o valor da letra procurada, então o
                inicio do vetor será igual a posição do meio + 1. */
                if(pessoas[meio].getNome().charAt(0) < letra) {
                    inicio = meio + 1;
                } else {
                    /* Se a primeira letra do nome da pessoa que está no meio
                    do vetor for maior que o valor da letra procurada, então
                    o fim do vetor será igual a posição do meio - 1. */
                    fim = meio - 1;
                }
        }
        /* Se não encontrou nenhuma pessoa que tenha a primeira letra
        do nome igual a letra que está sendo procurada, então retorna a
        posição do vetor que possui a letra mais proxima. */
        
        return fim;
    }
    
}
