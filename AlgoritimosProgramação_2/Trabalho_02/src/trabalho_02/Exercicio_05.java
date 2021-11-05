/*
5) Temos triângulos feito de blocos. A linha superior tem 1 bloco, a próxima linha abaixo tem 2 blocos, a
próxima linha tem 3 blocos e assim por diante. Criar uma função recursiva que calcule (sem loops ou multiplicação)
o número total de blocos em um triângulo com o número especificado de linhas.
Exemplos:
triangulo(0)  0
triangulo(1)  1
triangulo(2)  3
 */
package trabalho_02;

/**
 *
 * @author renan.paiva
 */
public class Exercicio_05 {
    public static void main(String[] args) {
        int linha = blocos(3);
        System.out.println("Total de Blocos " + linha);
      
    }
    public static int blocos(int n){
        if(n == 0){
           return 0;
        }else{
           return n + blocos(n - 1);
        }
    }
    
}
