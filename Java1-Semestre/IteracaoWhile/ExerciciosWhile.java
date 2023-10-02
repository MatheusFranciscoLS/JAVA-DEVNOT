package IteracaoWhile;

import java.util.Scanner;

public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        System.out.println("Digite os 5 numeros inteiros");
        int i = 0;
        while (i < vetorA.length) {
            vetorA[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < vetorB.length) {
            vetorB[i] = vetorA[i];
            System.out.println("O vetorB[" + i + "] = " + vetorB[i]);
            i++;
        }
    }

    public void exercicio2() {
        int vetorA[] = new int[8];
        int vetorB[] = new int[8];
        System.out.println("Digite os 8 numeros inteiros");
        int i = 0;
        while (i < vetorA.length) {
            vetorA[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < vetorB.length) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("O vetorB[" + i + "] = " + vetorB[i]);
            i++;
        }
    }

    public void exercicio3() {
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];
        System.out.println("Digite os 15 numeros inteiros");
        int i = 0;
        while (i < vetorA.length) {
            vetorA[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < vetorB.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("O vetorB[" + i + "] = " + vetorB[i]);
            i++;
        }
    }

    public void exercicio4() {
        int vetorA[] = new int[15];
        double vetorB[] = new double[15];
        System.out.println("Digite os 15 numeros inteiros");
        int i = 0;
        while (i < vetorA.length) {
            vetorA[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < vetorB.length) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("O vetorB[" + i + "] = " + vetorB[i]);
            i++;
        }
    }

    public void exercicio5() {
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        System.out.println("Digite os 10 numeros inteiros");
        int i = 0;
        while (i < vetorA.length) {
            vetorA[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < vetorB.length) {
            vetorB[i] = vetorA[i] * i;
            System.out.println("O vetorB[" + i + "] = " + vetorB[i]);
            i++;
        }
    }

    public void exercicio6() {
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        System.out.println("Digite os 10 numeros inteiros para o vetor A");
        int i = 0;
        while (i < vetorA.length) {
            vetorA[i] = sc.nextInt();
            i++;
        }
        System.out.println("Digite os 10 numeros inteiros para o vetor B");
        i = 0;
        while (i < vetorB.length) {
            vetorB[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < vetorC.length) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("O vetorC[" + i + "] = " + vetorC[i]);
            i++;
        }
    }
}