/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validarCPF;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class validarCPF {
    

    public static void main(String[] args) {

        int somatoria, restoDivisao, subtracao;
        boolean comparacao;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o CPF em 11 dÃ­gitos +.");
        String cpfLido = leitor.next();

        somatoria = 0;
        //passo 1 e 2
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(0)) * 10);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(1)) * 9);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(2)) * 8);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(3)) * 7);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(4)) * 6);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(5)) * 5);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(6)) * 4);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(7)) * 3);
        somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(8)) * 2);

        //passo 3
        restoDivisao = somatoria % 11;
        //passo 4
        subtracao = 11 - restoDivisao;
        //passo 5
        comparacao = false;
        if (subtracao < 10) {
            if (subtracao == Character.getNumericValue(cpfLido.charAt(9))) {
                comparacao = true;
            }
        } else if (Character.getNumericValue(cpfLido.charAt(9)) == 0) {
            comparacao = true;
        }
        if (comparacao) {
            System.out.println("Primeiro digito OK");
            somatoria = 0;
            //passo 1 e 2
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(0)) * 11);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(1)) * 10);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(2)) * 9);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(3)) * 8);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(4)) * 7);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(5)) * 6);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(6)) * 5);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(7)) * 4);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(8)) * 3);
            somatoria = somatoria + (Character.getNumericValue(cpfLido.charAt(9)) * 2);
            //passo 3
            restoDivisao = somatoria % 11;
            //passo 4
            subtracao = 11 - restoDivisao;
            //passo 5
            comparacao = false;
            if (subtracao < 10) {
                if (subtracao == Character.getNumericValue(cpfLido.charAt(10))) {
                    comparacao = true;
                }
            } else if (Character.getNumericValue(cpfLido.charAt(9)) == 0) {
                comparacao = true;
            }
            if (comparacao) {
                System.out.println("Segundo dÃ­gito OK");
                System.out.println("CPF + DIGITO verificador - OK");
            }else{
                System.out.println("segundo dÃ­gito ERRO");
                System.out.println("CPF + DIGITO verificador - NOK");
            }
        } else {
                System.out.println("primeiro dÃ­gito ERRO");
                System.out.println("CPF + DIGITO verificador - NOK");
        }

    }

}
    

