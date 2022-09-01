 

package com.mycompany.mavenproject1;

import java.text.DecimalFormat;

public class MontarCesta {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Composite cesta = new Composite ("Cesta de café");
        
        Component produto1 = new Leaf ("Pão", 2.34);
        Component produto2 = new Leaf ("Café", 12.56);
        Component produto3 = new Leaf ("Leite", 9.34);
        Component produto4 = new Leaf ("Fatias de presunto", 5.74);
        Component produto5 = new Leaf ("Fatias de queijo", 9.50);
        
        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
        
        Composite caixa = new Composite("Frios");
        caixa.adicionar(produto4);
        caixa.adicionar(produto5);
        
        cesta.adicionar(caixa);
        
        System.out.println(df.format(cesta.getPreco()));
        System.out.println(cesta);
    }
}
