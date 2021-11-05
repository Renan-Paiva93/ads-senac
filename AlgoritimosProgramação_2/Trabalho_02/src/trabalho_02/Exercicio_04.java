/*
Dada uma string, criar uma função recursiva (sem laços) que compute o número de caracteres ’x’ na string.
Exemplos:
contarX("xxhixx")  4
contarX("xhixhix")  3
contarX("hi")  0

Dica: utilize os métodos length() e substring() da classe String.

 */
package trabalho_02;
/**
 *
 * @author renan.paiva
 */
public class Exercicio_04 {
    public static void main(String[] args) {
        int totalX = totalDeX("xxxttxxtxxtxtttxx", 'x');
        System.out.println("Número " + totalX);
      
    }
    public static int totalDeX(String string, char x){
       
        if(string.equals("")){
            return 0;
        }else if (string.charAt(0) != x){
            return totalDeX(string.substring(1), x);
        }else{
            return totalDeX(string.substring(1), x) + 1;
        }
    }
    
}
