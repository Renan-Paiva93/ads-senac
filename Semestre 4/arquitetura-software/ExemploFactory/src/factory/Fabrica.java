
package factory;

//Croncrete creator
public class Fabrica {

    //lista de carro
    public static Carro factoryMethod(ListaCarros carro) {
        Carro car = null;
        if (carro.equals(ListaCarros.FOX)) {
            car = new Fox("Cross fox", 45000);
        } else if (carro.equals(ListaCarros.JETTA)) {
            car = new Jetta("Jetta TSI", 120000);
        }
        return car;
    }
}
