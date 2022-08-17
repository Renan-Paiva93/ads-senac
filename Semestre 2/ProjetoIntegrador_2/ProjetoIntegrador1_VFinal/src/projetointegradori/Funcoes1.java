/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegradori;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Funcoes1 {

    Scanner scan = new Scanner(System.in);
    String nome;
    Jogo1 jogo = new Jogo1();
    Creditos1 creditos = new Creditos1();
    Instrucoes1 instrucoes = new Instrucoes1();
        
    
    //método responsável por exibir mensagem de boas-vindas e identificar usuário
    public void inicio(){
        System.out.print("Digite seu nome: ");
        nome = scan.next();
        System.out.println("Olá, " + nome + "! Bem-vindo ao Arkhan Quiz!!! \n");
        System.out.println("O Batman foi capturado tentando salvar você!\n"
                + "Na tentativa do seu escape o Charada te concede duas opções:\n"
                + " - 'Você pode acertar minhas perguntas ou você pode deixar o Batman morrer.. o que você escolhe? hahAHAHA'\n");
    }
    
    //método responsável por realizar as operações do menu
    public String menu() {
        
        System.out.println(nome + ", para começar, insira:");
        String opcao;

        do {
            System.out.println("\nA para jogar");
            System.out.println("B para instruções");
            System.out.println("C para créditos");
            System.out.println("D para sair");
            System.out.println("Digite uma opção entre A e D: ");

            opcao = scan.next();

            switch (opcao.toUpperCase()) {
                case "A":
                    System.out.println("Opção Jogar selecionada");
                    jogo.jogar();
                    break;
                case "B":
                    System.out.println("Opção Instruções selecionada");
                    System.out.println(instrucoes.instrucoes());
                    break;
                case "C":
                    System.out.println("Opção Créditos selecionada");
                    System.out.println(creditos.getCreditos());
                    break;
                case "D":
                    System.out.println("Você saiu");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (!"D".equals(opcao.toUpperCase()));
        return opcao.toUpperCase();
    }
    
    

}
