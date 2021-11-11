/*
 * Exercicio referente a aula PO Pagina 15
 */
package APII_ExercicioB;

/**
 *
 * @author Dell
 */
public class Ponto {
    //atributos
    private int x, y;
    
    //construtor
    public Ponto (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //método
    public boolean igual(Ponto p){
        return x == p.x && y == p.y;
    }
    
    //assinatura
    public double distancia(Ponto p) {
        double v1 = (p.x - x) * (p.x - x);
        double v2 = (p.y - y) * (p.y - y);
        return Math.sqrt(v1 + v2); // raiz quadrada
    }
   
}
