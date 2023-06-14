package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // gerar, preencher, imprimir e manipular matrizes
        // criar uma matriz 10x9
        int m[][] = new int[10][9]; // bidimensional 10x9
        // preencher minha matriz
        for (int i = 0; i < m.length; i++) { // length le a primeira dimensão
            for (int j = 0; j < 9; j++) { // segunda dimensão
                // System.out.print("matriz["+i+"]["+j+"]");
                // m[i][j] = sc.nextInt();
                m[i][j] = rd.nextInt(10);
            }
        }
        // imprimir elemento por elemento da matriz
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < 9; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
        // somar todos os elementos da 4 linha
        int somaLinha = 0;
        for (int j = 0; j < 9; j++) {
            somaLinha += m[3][j];
        }
        // somar todos os elementos da 4 coluna
        int somaColuna = 0;
        for (int i = 0; i < m.length; i++) {
            somaColuna += m[i][3];
        }
        System.out.println("====================");
        System.out.println("A soma da 4ª linha é " + somaLinha);
        System.out.println("====================");
        System.out.println("A soma da 4ª coluna é " + somaColuna);
    }

    public void exercicio1() {
        int m[][] = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int m[][] = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("===========");
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println("|");
        }
        int somaDiagonal = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == j) {
                    somaDiagonal += m[i][j];
                } else {
                }
            }
        }
        System.out.println("====================");
        System.out.println("A soma na diagonal é " + somaDiagonal);
    }

    public void exercicio3() {
        int m[][] = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = i*j;
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio4() {
        int m[][] = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print("|");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("==============");
            }
        }
