package exercicio2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class UsaStrategy {

    public static void main(String[] args) {
        List<Produto> lista = new LinkedList<>();
        lista.add(new Produto ("x", 1.2));
        lista.add(new Produto ("y", 45.54));
        lista.add(new Produto ("z", 7.98));
        
        Orcamento orcamento=new Orcamento();
        orcamento.setLista(lista);
        
        double valorImposto = Impostos.values() [0].instance().calcular(orcamento);
        System.out.println(valorImposto);
    }
    
}
