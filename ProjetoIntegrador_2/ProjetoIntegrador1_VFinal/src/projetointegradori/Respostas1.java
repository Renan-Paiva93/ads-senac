/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetointegradori;

/**
 *
 * @author Arthur
 */
public class Respostas1 {
    
    String resposta1 = "F";
    String resposta2 = "V";
    String resposta3 = "F";
    String resposta4 = "V";
    String resposta5 = "F";
    String resposta6 = "F";
    String resposta7 = "V";
    
    //vetor de perguntas de 7 posições
    public String[] respostas = new String[7];   
    
    //vetor de respostas Boss
    public String[] respostasBoss = new String[3];
    
    //metodo responsavel por popular a o vetor na ordem recebida por parametro
    public void popularRespostas(int ordem){
        
        if(ordem == 1){
            this.respostas[0] = resposta1;
            this.respostas[1] = resposta2;
            this.respostas[2] = resposta3;
            this.respostas[3] = resposta4;
            this.respostas[4] = resposta5;
            this.respostas[5] = resposta6;
            this.respostas[6] = resposta7;
        }
        
        if(ordem == 2){
            this.respostas[0] = resposta6;
            this.respostas[1] = resposta7;
            this.respostas[2] = resposta3;
            this.respostas[3] = resposta4;
            this.respostas[4] = resposta5;
            this.respostas[5] = resposta1;
            this.respostas[6] = resposta2;
        }
        
        if(ordem == 3){
            this.respostas[0] = resposta5;
            this.respostas[1] = resposta1;
            this.respostas[2] = resposta7;
            this.respostas[3] = resposta4;
            this.respostas[4] = resposta3;
            this.respostas[5] = resposta2;
            this.respostas[6] = resposta6;
       }
        
        if(ordem == 4){
            this.respostas[0] = resposta2;
            this.respostas[1] = resposta4;
            this.respostas[2] = resposta6;
            this.respostas[3] = resposta1;
            this.respostas[4] = resposta7;
            this.respostas[5] = resposta3;
            this.respostas[6] = resposta5;
        }
    }
    
    public String[] getRespostasPopuladas(){
        
        this.respostasBoss[0] = "V";
        this.respostasBoss[1] = "V";
        this.respostasBoss[2] = "F";
        
        return this.respostasBoss;
    }
}
