
package factory;


public class Gol implements Carro {
    private String modelo;
    private double preco;

    public Gol() {
    }

    public Gol(String modelo, double preco) {
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
