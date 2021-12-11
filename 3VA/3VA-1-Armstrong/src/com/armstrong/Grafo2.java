package com.armstrong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grafo2 {

    public class Vertice {
        String nome;
        List<Aresta> adj;

        Vertice(String nome) {
            this.nome = nome;
            this.adj = new ArrayList<Aresta>();
        }

        void addAdj(Aresta e) {
            adj.add(e);
        }
    }

    public class Aresta {
        Vertice origem;
        Vertice destino;

        Aresta(Vertice origem, Vertice destino) {
            this.origem = origem;
            this.destino = destino;
        }
    }

    List<Vertice> vertices;
    List<Aresta> arestas;

    public Grafo2() {
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
    }

    Vertice addVertice(String nome) {
        Vertice v = new Vertice(nome);
        vertices.add(v);
        return v;
    }

    Aresta addAresta(Vertice origem, Vertice destino) {
        Aresta e = new Aresta(origem, destino);
        origem.addAdj(e);
        arestas.add(e);
        return e;
    }

    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.nome + " -> ";
            for (Aresta e : u.adj) {
                Vertice v = e.destino;
                r += v.nome + ", ";
            }
            r += "\n";
        }
        return r;
    }

    List<List<String>> matrizAdj(Grafo2 g){
        List<String> la = new ArrayList<String>(); //test
        List<List<String>> lb = new ArrayList<List<String>>(); //test

        List<String> verticesAux = Arrays.asList("0", "0", "0", "0");

        System.out.println(verticesAux);

        List<List<String>> listaADJ = new ArrayList<List<String>>();

//        System.out.println(vertices);


        // MONTA LISTA DE ADJ
        String r = "";
        for (Vertice u : vertices) {
            List<String> l1 = new ArrayList<String>();

            for (Aresta e : u.adj) {
                Vertice v = e.destino;
                l1.add(v.nome);
//                r += v.nome + ", ";
            }

//            System.out.println(l1);
            listaADJ.add(l1);
//            r += "\n";
        }

        System.out.println(listaADJ);
        List<List<String>> listaADJCopia = listaADJ;


        // Crio lista final
        List<List<String>> listaFinal = new ArrayList<List<String>>();
        for(int i=0; i<listaADJCopia.size(); i++){
            listaFinal.add(verticesAux);
        }


        List<List<String>> listaFinalCopia = listaFinal;

        System.out.println(listaFinal);

        for (int i=0; i<listaFinal.size(); i++){
            List<String> listaIndiceADJ = listaADJ.get(i);
            for (int j=0; j<listaFinal.get(i).size(); j++){
                if(listaADJ.get(i).contains(String.valueOf(j))){
                    System.out.println("entrou");
                }

            }
        }


        // TODO: Corrigir aqui com metodos do Java certos
        /*for(int i=0; i<listaFinal.size(); i++){
            List<Boolean> aux = new ArrayList<>();
            for(int j=0; j<listaFinal.get(i).size(); j++){
                boolean flag = false;
                if(listaADJ.get(i).contains(listaFinal.get(i).get(j))){
                    flag = true;
                }
                aux.add(flag);
            }
            for(int k = 0; k < aux.size(); k++){
                if(aux.get(k)){
                    listaFinal.get(i).set(k, "1");
                } else {
                    listaFinal.get(i).set(k, "0");
                }
            }
        }*/

        System.out.println(listaFinalCopia);

        /*for(int i=0; i<listaADJCopia.size(); i++){
            listaFinal.add(verticesAux);

            for(int j=0; j<listaADJCopia.get(i).size(); j++){				//itero as colunas
                if(verticesAux.contains(listaADJCopia.get(i).get(j))){						 //quero imprimir somente as ligações
//                    System.out.println(listaADJCopia.get(i).get(j));		  //Imprime as arestas

                }
            }
        }*/

        return lb;

    }

    public static void main(String[] args) {

        // 1ºA) - G1
        Grafo2 grafo1A_1 = new Grafo2();

        Vertice um_grafo1A_1 = grafo1A_1.addVertice("1");
        Vertice dois_grafo1A_1 = grafo1A_1.addVertice("2");
        Vertice tres_grafo1A_1 = grafo1A_1.addVertice("3");
        Vertice quatro_grafo1A_1 = grafo1A_1.addVertice("4");

        Aresta um_um_grafo1A_1 = grafo1A_1.addAresta(um_grafo1A_1, um_grafo1A_1);
        Aresta um_dois_grafo1A_1 = grafo1A_1.addAresta(um_grafo1A_1, dois_grafo1A_1);
        Aresta um_quatro_grafo1A_1 = grafo1A_1.addAresta(um_grafo1A_1, quatro_grafo1A_1);
        Aresta dois_um_grafo1A_1 = grafo1A_1.addAresta(dois_grafo1A_1, um_grafo1A_1);
        Aresta dois_tres_grafo1A_1 = grafo1A_1.addAresta(dois_grafo1A_1, tres_grafo1A_1);
        Aresta tres_dois_grafo1A_1 = grafo1A_1.addAresta(tres_grafo1A_1, dois_grafo1A_1);
        Aresta tres_quatro_grafo1A_1 = grafo1A_1.addAresta(tres_grafo1A_1, quatro_grafo1A_1);
        Aresta tres_quatro_alternativo_grafo1A_1 = grafo1A_1.addAresta(tres_grafo1A_1, quatro_grafo1A_1);
        Aresta quatro_um_grafo1A_1 = grafo1A_1.addAresta(quatro_grafo1A_1, um_grafo1A_1);
        Aresta quatro_tres_grafo1A_1 = grafo1A_1.addAresta(quatro_grafo1A_1, tres_grafo1A_1);
        Aresta quatro_tres_alternativo_grafo1A_1 = grafo1A_1.addAresta(quatro_grafo1A_1, tres_grafo1A_1);

        System.out.println("1ºA) Matriz de adjacência do grafo 1-a:");
        System.out.println("--FAZER--");
        System.out.println(grafo1A_1);
        System.out.println(grafo1A_1.matrizAdj(grafo1A_1));

        // 1ºA) - G2
        Grafo2 grafo1A_2 = new Grafo2();

        Vertice um_grafo1A_2 = grafo1A_2.addVertice("1");
        Vertice dois_grafo1A_2 = grafo1A_2.addVertice("2");
        Vertice tres_grafo1A_2 = grafo1A_2.addVertice("3");
        Vertice quatro_grafo1A_2 = grafo1A_2.addVertice("4");

        Aresta um_um_grafo1A_2 = grafo1A_2.addAresta(um_grafo1A_2, um_grafo1A_2);
        Aresta um_dois_grafo1A_2 = grafo1A_2.addAresta(um_grafo1A_2, dois_grafo1A_2);
        Aresta dois_tres_grafo1A_2 = grafo1A_2.addAresta(dois_grafo1A_2, tres_grafo1A_2);
        Aresta dois_quatro_grafo1A_2 = grafo1A_2.addAresta(dois_grafo1A_2, quatro_grafo1A_2);
        Aresta tres_dois_grafo1A_2 = grafo1A_2.addAresta(tres_grafo1A_2, dois_grafo1A_2);
        Aresta quatro_tres_grafo1A_2 = grafo1A_2.addAresta(quatro_grafo1A_2, tres_grafo1A_2);

        System.out.println("1ºA) Matriz de adjacência do grafo 2-a:");
        System.out.println("--FAZER--");
        System.out.println(grafo1A_2);

        // 1ºB) - G1
        Grafo2 g = new Grafo2();
        Vertice um = g.addVertice("1");
        Vertice dois = g.addVertice("2");
        Vertice tres = g.addVertice("3");
        Vertice quatro = g.addVertice("4");


        Aresta um_um = g.addAresta(um, um);
        Aresta um_dois = g.addAresta(um, dois);
        Aresta um_quatro = g.addAresta(um, quatro);
        Aresta dois_um = g.addAresta(dois, um);
        Aresta dois_tres = g.addAresta(dois, tres);
        Aresta tres_dois = g.addAresta(tres, dois);
        Aresta tres_quatro = g.addAresta(tres, quatro);
        Aresta tres_quatro_alternativo = g.addAresta(tres, quatro);
        Aresta quatro_um = g.addAresta(quatro, um);
        Aresta quatro_tres = g.addAresta(quatro, tres);
        Aresta quatro_tres_alternativo = g.addAresta(quatro, tres);

        System.out.println("1ºB) Lista de adjacência do grafo 1-a:");
        System.out.println(g);
    }
}




