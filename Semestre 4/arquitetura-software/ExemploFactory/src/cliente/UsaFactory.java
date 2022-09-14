
package cliente;

import factory.Carro;
import factory.Fabrica;
import factory.ListaCarros;

public class UsaFactory {

   //maiores informaçoes do modelo fox
    public static void main(String[] args) {
        
        try{
        int n=2;
        
        //alterar para padrão strategy 
        Carro carro = Fabrica.factoryMethod(ListaCarros.values()[n]);
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Preço: " + carro.getPreco());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Carro inválido!");
        }
    }
        
}
    

