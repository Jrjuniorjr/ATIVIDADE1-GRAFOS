/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos1;

import java.util.LinkedList;

/**
 *
 * @author aluno
 */
public class GrafoLista {
    LinkedList<Aresta>[] adj;
     int qtdVertice;
    
    public GrafoLista(int qtdVertice){
        int i;
        this.qtdVertice = qtdVertice;
       adj = new LinkedList[qtdVertice];
       for(i = 0; i < qtdVertice; i++){
           adj[i] = new LinkedList<Aresta>();
       }
    }
    
    public void addAresta(int vertice1, int vertice2, double peso){
        Aresta e = new Aresta(vertice2, peso);
        adj[vertice1].add(e);
    }
}
