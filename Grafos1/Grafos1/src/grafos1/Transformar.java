/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos1;

import java.util.LinkedList;

/**
 *
 * @author Junior
 */
public class Transformar {
    GrafoLista grafoLista;
    GrafoMatrizAdj grafoMatrizAdj;
    
    public Transformar(GrafoLista grafoLista){
        this.grafoLista = grafoLista;
    }
    public Transformar(GrafoMatrizAdj grafoMatrizAdj){
        this.grafoMatrizAdj = grafoMatrizAdj;
    }
    
    public GrafoMatrizAdj transformarListaParaMatrizAdj(){
        GrafoMatrizAdj grafoMatrizAdjAux = new GrafoMatrizAdj(this.grafoLista.qtdVertice);
        for(int i = 0; i < this.grafoLista.qtdVertice;i++){
            for(Aresta l: this.grafoLista.adj[i]){
                grafoMatrizAdjAux.addAresta(i, l.vertice);
            }
        }
        return grafoMatrizAdjAux;
    }
}
