
package projetointegradori;

/**
 *
 * @author Arthur
 */
public class Perguntas1 {
    
    String pergunta1 = "Seus pais morreram após uma apresentação de circo.";
    String pergunta2 = "O mordomo da família, Alfred Pennyworth era seu principal suporte na luta contra o crime.";
    String pergunta3 = "Seu principal poder é super força e agilidade extrema.";
    String pergunta4 = "Seu modo de luta não se adequa à morte.";
    String pergunta5 = "Seu principal veículo de passeio é uma Ferrari.";
    String pergunta6 = "Seu principal aliado contra o crime era Flash.";
    String pergunta7 = "A primeira a pessoa a consolar o Bruce após a perda dos seus pais foi Jim Gordon.";
    
    //vetor de perguntas de 7 posições
    public String[] perguntas = new String[7];
    
    //vetor perguntas Boss
    public String[] perguntasBoss = new String[3];
    
    //metodo responsavel por popular a o vetor na ordem recebida por parametro
    public void popularPerguntas(int ordem){
        
        if(ordem == 1){
            this.perguntas[0] = pergunta1;
            this.perguntas[1] = pergunta2;
            this.perguntas[2] = pergunta3;
            this.perguntas[3] = pergunta4;
            this.perguntas[4] = pergunta5;
            this.perguntas[5] = pergunta6;
            this.perguntas[6] = pergunta7;
        }
        
        if(ordem == 2){
            this.perguntas[0] = pergunta6;
            this.perguntas[1] = pergunta7;
            this.perguntas[2] = pergunta3;
            this.perguntas[3] = pergunta4;
            this.perguntas[4] = pergunta5;
            this.perguntas[5] = pergunta1;
            this.perguntas[6] = pergunta2;
        }
        
        if(ordem == 3){
            this.perguntas[0] = pergunta5;
            this.perguntas[1] = pergunta1;
            this.perguntas[2] = pergunta7;
            this.perguntas[3] = pergunta4;
            this.perguntas[4] = pergunta3;
            this.perguntas[5] = pergunta2;
            this.perguntas[6] = pergunta6;
       }
        
        if(ordem == 4){
            this.perguntas[0] = pergunta2;
            this.perguntas[1] = pergunta4;
            this.perguntas[2] = pergunta6;
            this.perguntas[3] = pergunta1;
            this.perguntas[4] = pergunta7;
            this.perguntas[5] = pergunta3;
            this.perguntas[6] = pergunta5;
        }
    }
    
    public String[] getPerguntasPopuladas(){
        this.perguntasBoss[0] = "Coringa ganha suas cicatrizes após ser questionado\n"
        + "por seu pai do por quê estar tão sério ao encontrar sua mãe sendo espancada pelo mesmo";
        
        this.perguntasBoss[1] = "Segundo boatos, o ator Heath Ledger, que foi encontrado morto em seu apartamento em Nova York\n"
        + " no dia 22 de janeiro de 2008, sofreu uma parada cardíaca causada por abuso de remédios prescritos. Ledger já estava usando\n"
        + "medicamentos para dormir, uma vez que nas filmagens de Batman, o Cavaleiro das Trevas, seu emocional estava em constante teste.\n"
        + "Isto nos leva a cogitar que talvez a carga que o ator extraiu do Coringa para si mesmo possa ter o 'enlouquecido' e influenciado em seu descontrole.";
        
        this.perguntasBoss[2] = "No final da história Batman encontra o Coringa no topo do prédio e o mata de forma brutal que assusta\n"
        + " até o comissário Gordon, fazendo ele ser procurado pela polícia.";
        
        return this.perguntasBoss;        
    }
}
