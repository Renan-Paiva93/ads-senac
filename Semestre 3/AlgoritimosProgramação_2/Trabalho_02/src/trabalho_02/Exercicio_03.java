
package trabalho_02;

/**
 *
 * @author Dell
 */
public class Exercicio_03 {
    
    public static void main(String[] args) {
        int coelho = totalOrelhas(1);
        System.out.println("total de orelhas: " + coelho);
      
    }
    public static int totalOrelhas(int orelha){
        if(orelha == 0){
           return 0;
        }else{
           return 2 + totalOrelhas( orelha - 1);
        }
    }
  }
    

