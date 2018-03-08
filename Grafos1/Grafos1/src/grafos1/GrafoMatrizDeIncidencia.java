/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos1;

/**
 *
 * @author Junior
 */
public class GrafoMatrizDeIncidencia {
    int [][] matrizIncidencia;
    int qtdVertices;
    int qtdAresta;
    public GrafoMatrizDeIncidencia(int qtdVertices, int qtdAresta){
        this.qtdVertices = qtdVertices;
        this.qtdAresta = qtdAresta;
        this.matrizIncidencia = new int[qtdVertices][qtdAresta];
        for(int i = 0; i < qtdVertices; i++){
            for(int j = 0; j < qtdAresta; j++){
                this.matrizIncidencia[i][j] = 0;
            }
        }
    }
    public void addAresta(int vertice, int aresta){
        this.matrizIncidencia[vertice][aresta] = 1;
    }
    
    public void imprimirTela() {
        for(int i = 0; i < qtdVertices; i++){
            for(int j = 0; j < qtdAresta; j++){
                System.out.print(this.matrizIncidencia[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
}
