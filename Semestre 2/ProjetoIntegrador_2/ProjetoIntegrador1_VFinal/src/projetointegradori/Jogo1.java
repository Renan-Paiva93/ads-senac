/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegradori;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class Jogo1 {

    //variavel contadora para controle de pontuação
    int cont = 0;

    Perguntas1 pergunta = new Perguntas1();
    Respostas1 resposta = new Respostas1();
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    //metodo responsavel por popular vetor de perguntas na ordem "aleatoria"
    public void ordenarPerguntas() {
        int ordem = rand.nextInt(4) + 1;
        pergunta.popularPerguntas(ordem);
        resposta.popularRespostas(ordem);
    }

    //metodo responsável por executar as ações do jogo
    public void jogar() {

        
        String resp;
        ordenarPerguntas();
                
        for (int i = 0; i < 7; i++) {
            if (cont == 3) {
                System.out.println("\nVOCÊ CHEGOU NO BOSS\n");
                boss();
                break;
            } else if (cont == -3) {
                System.out.println("\nVOCÊ FOI ELIMINADO\n");
                cont = 0;
                break;
            } else if (i == 6 && cont < 3 && cont > -3) {
                System.out.println("Tente novamente, vou te dar uma colher de chá...");
                ordenarPerguntas();
                i = 0;
                cont = 0;
            }

            System.out.println(pergunta.perguntas[i]);
            resp = scan.next().toUpperCase();

            if (resp.equals(resposta.respostas[i])) {
                System.out.println("Hm... pensou rápido!! Está correto.");
                cont++;
            } else {
                System.out.println("Não foi dessa vez, meu caro... HEHEHEHEHE");
                cont--;
            }
        }
    }

    public void boss() {
        int scoreBoss = 0;
        String respUser;
        for(int i = 0; i<pergunta.perguntasBoss.length; i++){
            System.out.println(pergunta.getPerguntasPopuladas()[i]);
            respUser = scan.next().toUpperCase();
            
             if (respUser.equals(resposta.getRespostasPopuladas()[i])) {
                System.out.println("Ora ora... você está pronto para combater o crime em Arkham City, você salvou o Batman!!");
                scoreBoss++;
            } else {
                System.out.println("\nVOCÊ FOI ELIMINADO\n");
                cont = 0;
                break;
            }
        }
    }
}
