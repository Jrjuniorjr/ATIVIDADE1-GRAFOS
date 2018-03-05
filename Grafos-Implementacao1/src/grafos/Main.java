/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Junior
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Grafo g = new Grafo();
        Vertice v1, v2, v3;
        
        g.addVertice("Vertice1");
        g.addVertice("Vertice2");
        g.addVertice("Vertice3");
        v1 = g.buscarVertice("Vertice1");
        v2 = g.buscarVertice("Vertice2");
        v3 = g.buscarVertice("Vertice3");
        g.addAresta(v1, v2);
        g.addAresta(v2, v1);
        g.addAresta(v1, v3);
        g.buscarVizinhosVertice(v3);
        
    }
    
}
