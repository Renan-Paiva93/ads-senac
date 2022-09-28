
package exercicio2;


public class Ip2 implements Strategy{

    @Override
    public double calcular(Orcamento orcamento) {
        return orcamento.total()*0.15;
    }
    
}
