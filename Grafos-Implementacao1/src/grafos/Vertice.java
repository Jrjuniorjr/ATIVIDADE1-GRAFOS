/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Junior
 */
public class Vertice {
    String nome;
    List<Aresta> arestasDoVertice;

    public Vertice(String nome) {
        this.nome = nome;
        this.arestasDoVertice = new ArrayList<Aresta>();
    }
    void addAresta(Aresta aresta) {
        arestasDoVertice.add(aresta);
    }
    void vizinhos(){
        for(Aresta e: arestasDoVertice){
            System.out.println(e.entrada.nome);
            return;
        }
        System.out.println("Nao existe vizinhos do vertice " + nome);
    }
}
