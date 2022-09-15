
package factory;


public class FabricaFiat implements InterfaceFabrica {

    @Override
    public Carro factoryMethod(ListaCarros carro) {
        
        Carro car = null;
        
        if(carro.equals(ListaCarros.UNO)) {
            car = new Uno ("Uno Mile", 120222);
        }else if(carro.equals(ListaCarros.ARGO)){
            car = (Carro) new Argo ("Argo HGT ", 40000);
        }
        return car;
    }
    
}
