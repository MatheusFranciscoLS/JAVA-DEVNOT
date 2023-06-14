package AtividadeLogicaProgramacao;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {

        System.out.println("Informe o valor de linhas");
        int l = sc.nextInt();
        System.out.println("Informe o valor de colunas");
        int c = sc.nextInt();

        int m[][] = new int[l][c];

        for (int i = 0; i < l; i++) { // length le a primeira dimensão
            for (int j = 0; j < c; j++) {
                m[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.print("|");
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("======================");

        for (int i = 0; i < l; i++) {
            System.out.print("|");
            for (int j = 0; j < c; j++) {
                if (i > j) {
                    m[i][j] = 1;
                } else if (i == j) {
                    m[i][j] = 0;
                } else if (j > i) {
                    m[i][j] = 2;
                } else {
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {

        int nSorteado = rd.nextInt(1001);
        int contador = 0;
        boolean tenteNovamente = true;
        int i = 0;

        while (tenteNovamente) {
            System.out.println("Informe um palpite de 0 a 1000");
            int palpite = sc.nextInt();
            if (nSorteado == palpite) {
                System.out.println("Acertou !");
                tenteNovamente = false;
            } else {
                i++;
                if (nSorteado > palpite) {
                    System.out.println("O palpite é MENOR que o nº sorteado");
                    System.out.println("Tente Novamente!");
                } else {
                    System.out.println("O palpite é MAIOR que o nº sorteado");
                    System.out.println("Tente Novamente!");
                }
                System.out.println("================");
            }
        }
        System.out.println("Você acertou em " + (i + 1) + " tentativas");
    }

    public void exercicio3() {

        int nVetor = rd.nextInt(900)+100;
        int vetor[] = new int[nVetor];
        int contParV = 0;
        int contImparV = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100)+1;
        }

        for (int i = 0; i < vetor.length; i++) {
            int resto = i % 2;
            if (resto== 0) {
            System.out.println("Os numeros pares do vetor são " + vetor[i]);
            }
        }
        System.out.println("============================================================");

        for (int i = 0; i < vetor.length; i++) {
            int resto = i % 2;
            if (resto == 1) {
                System.out.println("Os numeros impares do vetor são " + vetor[i]);
            }
        }
        

        for (int i = 0; i < vetor.length; i+=2) {
            if (vetor[i] % 2 == 1) {
                contImparV++;
            }
        }
        for (int i = 1; i < vetor.length; i+=2) {
            if (vetor[i] % 2 == 0) {
                contParV++;
            }
        }
        System.out.println("============================================================");
        System.out.println("O total de numeros par existem é de " + contParV);
        System.out.println("============================================================");
        System.out.println("O total de numeros impar existem é de " + contImparV);
    }
}
