
package com.mycompany.renanpaivaado1;

public class Main {

    public static void main(String[] args) {
        
        Raposa novoAnimal = new Raposa();
        
        novoAnimal.cor = "laranja";
        novoAnimal.sexo = "Masculino";
        novoAnimal.nome = "Raposa";
        
        novoAnimal.parar();
        novoAnimal.andar();
        novoAnimal.movimentar();

    }
}
