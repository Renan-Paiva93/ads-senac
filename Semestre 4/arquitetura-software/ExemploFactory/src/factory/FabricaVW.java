
package factory;

//Croncrete creator
public class FabricaVW implements InterfaceFabrica{

    //lista de carro
    @Override
    public Carro factoryMethod(ListaCarros carro) {
        
        Carro car = null;
        if (carro.equals(ListaCarros.FOX)) {
            car = new Fox("Cross fox", 45000);
        } else if (carro.equals(ListaCarros.JETTA)) {
            car = new Jetta("Jetta TSI", 120000);
        } else if (carro.equals(ListaCarros.GOL)){
            car = new Gol ("Gol GT", 23000);
        }
        return car;
    }
}
