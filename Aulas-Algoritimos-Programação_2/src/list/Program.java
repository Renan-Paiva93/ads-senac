
package list;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>(); // 
        
        //adicionar elementos na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bárbara");
        list.add("Ana");
        list.add(2, "Fernanda");
        
        //remover 
        list.remove("1");
        
        //tamanho da lista
        System.out.println(list.size());
        
        //percorrer
        for(String x : list){
            System.out.println(x);
        }
        
        
    }
    
}
