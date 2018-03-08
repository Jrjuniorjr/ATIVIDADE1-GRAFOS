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
    GrafoMatrizDeIncidencia grafoMatrizIncidencia;
    
    public Transformar(GrafoLista grafoLista){
        this.grafoLista = grafoLista;
    }
    public Transformar(GrafoMatrizAdj grafoMatrizAdj){
        this.grafoMatrizAdj = grafoMatrizAdj;
    }
    public Transformar(GrafoMatrizDeIncidencia grafoMatrizIncidencia){
        this.grafoMatrizIncidencia = grafoMatrizIncidencia;
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
    
    
    public GrafoLista transformarMatrizParaLista(){
        GrafoLista grafoListaAux = new GrafoLista(this.grafoMatrizAdj.qtdVertices);
        for(int i = 0; i < this.grafoMatrizAdj.qtdVertices; i++){
            for(int j = 0; j < this.grafoMatrizAdj.qtdVertices; j++){
                if(this.grafoMatrizAdj.matrizAdj[i][j] == 1){
                    grafoListaAux.addAresta(i, j, 0);
                }
            }
        }
        return grafoListaAux;
    }
 
    public GrafoLista transformarMatrizIncidenciaParaLista(){
        GrafoLista grafoListaAux = new GrafoLista(this.grafoMatrizIncidencia.qtdVertices);
        int vertice1 = -1;
        int vertice2 = -1;
        
        for(int i = 0; i <this.grafoMatrizIncidencia.qtdAresta; i++){
            for(int j = 0; j < this.grafoMatrizIncidencia.qtdVertices; j++){
                if(this.grafoMatrizIncidencia.matrizIncidencia[j][i] == 1){
                    if(vertice1 == -1){
                        vertice1 = j;
                    }
                    else{
                        vertice2 = j;
                    }
                }
                if(vertice1 != -1 && vertice2 != -1){
                    grafoListaAux.addAresta(vertice1, vertice2, 0);
                }
                else if(vertice1 != -1 && vertice2 == -1){
                    grafoListaAux.addAresta(vertice1, vertice1, 0);
                }
                vertice1 = -1;
                vertice2 = -1;
            }
        }
        return grafoListaAux;
    }
    
}
