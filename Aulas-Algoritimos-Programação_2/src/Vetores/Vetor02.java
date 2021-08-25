/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetores;

/**
 *
 * @author renan.paiva
 */
public class Vetor02 {
    public static void main(String[] args) {
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int c = 0; c < mes.length; c++) {
            System.out.println("O més de " + mes[c] + " tem " + tot[c] + " dias ao todo");          
        }
                
    }
}
