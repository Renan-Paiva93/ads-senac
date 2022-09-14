
package cliente;

import factory.Carro;
import factory.Fabrica;
import factory.ListaCarros;

public class UsaFactory {

   //maiores informaçoes do modelo fox
    public static void main(String[] args) {
        Carro carro = Fabrica.factoryMethod(ListaCarros.values()[0]);
    }
    
}
