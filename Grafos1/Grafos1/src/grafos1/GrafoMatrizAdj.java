/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos1;

/**
 *
 * @author aluno
 */
public class GrafoMatrizAdj {
    int [][] matrizAdj;
    int qtdVertices;
    public GrafoMatrizAdj(int qtdVertices){
        this.qtdVertices = qtdVertices;
        this.matrizAdj = new int[qtdVertices][qtdVertices];
        for(int i = 0; i < qtdVertices; i++){
            for(int j = 0; j < qtdVertices; j++){
                this.matrizAdj[i][j] = 0;
            }
        }
    }
    public void addAresta(int vertice1, int vertice2){
        this.matrizAdj[vertice1][vertice2] = 1;
    }

    
    public void imprimirTela() {
        for(int i = 0; i < qtdVertices; i++){
            for(int j = 0; j < qtdVertices; j++){
                System.out.print(matrizAdj[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
