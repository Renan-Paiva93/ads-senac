
package factory;

//ConcreteProduct
public class Fox implements Carro {
    private String modelo;
    private double preco;
       
    public Fox(){}

    public Fox(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }
    
    @Override
    public String getModelo() {
    return modelo;
        
    }
    
    @Override
    public double getPreco() {
       return preco;
    }
    
}
