
package com.mycompany.prova.grafos_prova;

/**
 *
 * @author Dell
 */
public class Grafos_prova {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("a");
        grafo.adicionarVertice("b");
        grafo.adicionarVertice("c");
        grafo.adicionarVertice("d");
        grafo.adicionarVertice("e");
        grafo.adicionarVertice("f");
        grafo.adicionarVertice("g");
        
        grafo.adicionarAresta(8.0, "a", "b" );
        grafo.adicionarAresta(5.0, "b", "c" );
        grafo.adicionarAresta(2.0, "c", "d" );
        grafo.adicionarAresta(4.0, "d", "e" );
        grafo.adicionarAresta(3.0, "e", "f" );
        grafo.adicionarAresta(1.0, "f", "g" );
        grafo.adicionarAresta(2.0, "f", "g" );
        
        grafo.buscarEmLargura();
    
    }
    
}
