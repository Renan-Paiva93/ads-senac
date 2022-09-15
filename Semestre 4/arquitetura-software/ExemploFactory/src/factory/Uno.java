package factory;


public class Uno implements Carro{
   
    private String modelo;
    private double preco;

    public Uno() {
    }

    public Uno(String modelo, double preco) {
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
