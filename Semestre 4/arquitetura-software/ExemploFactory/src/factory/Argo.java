package factory;

public class Argo implements Carro{

    private String modelo;
    private double preco;

    public Argo() {
    }

    public Argo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;

    }

}
