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
public class Grafos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*GrafoLista grafo = new GrafoLista(5);
        grafo.addAresta(0, 0, 5);
        grafo.addAresta(0, 2, 5);
        grafo.addAresta(0, 3, 5);
        grafo.addAresta(1, 4, 5);
        grafo.addAresta(4, 1, 5);
        grafo.addAresta(3, 2, 5);
        grafo.addAresta(2, 3, 5);
        Transformar transformacao = new Transformar(grafo);
        GrafoMatrizAdj grafo2 = transformacao.transformarListaParaMatrizAdj();
        grafo2.imprimirTela();

*/
        GrafoMatrizDeIncidencia grafo1 = new GrafoMatrizDeIncidencia(4, 3);
        grafo1.addAresta(0, 0);
        grafo1.addAresta(3, 2);
        grafo1.addAresta(2, 1);
        grafo1.addAresta(2, 0);
        grafo1.imprimirTela();
    }
    
}
