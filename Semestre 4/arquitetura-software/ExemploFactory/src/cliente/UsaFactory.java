
package cliente;

import factory.*;


public class UsaFactory {

   //maiores informaçoes do modelo fox
    public static void main(String[] args) {
        
        try{
        int n=4;
        
        //pode alterar para padrão strategy 
        FabricaFiat fiat = new FabricaFiat();
        Carro carro = fiat.factoryMethod(ListaCarros.values()[n]);
        
        
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Preço: " + carro.getPreco());
        
        
        } catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Carro inválido!");
        }
    }
        
}
    

