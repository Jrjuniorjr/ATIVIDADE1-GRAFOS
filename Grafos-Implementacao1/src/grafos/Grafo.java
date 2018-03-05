/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author Junior
 */
public class Grafo {
    ArrayList <Aresta> arestas;
    ArrayList <Vertice> vertices;
    
    public Grafo() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
    }

    void addVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        System.out.println("Vertice adicionado.");
    }

    void addAresta(Vertice saida, Vertice entrada) {
        Aresta e = new Aresta(saida, entrada);
        saida.addAresta(e);
        arestas.add(e);
        System.out.println("Aresta adicionada");
    }

    Vertice buscarVertice(String nome){
        for(Vertice v: vertices){
            if(v.nome.equals(nome)){
                System.out.println("Vertice encontrado.");
                return v;
            }
        }
        return null;
    }
    void buscarAresta(Vertice saida, Vertice entrada){
        for(Aresta e: arestas){
            if ((e.saida.nome.equals(saida.nome)) && e.entrada.nome.equals(entrada.nome)){
                System.out.println(e.saida.nome + "->" + e.entrada.nome);
                return;
            }
        }
        System.out.println("Aresta nao encontrada.");
    }
   void buscarVizinhosVertice(Vertice saida){
       saida.vizinhos();
   }
}
