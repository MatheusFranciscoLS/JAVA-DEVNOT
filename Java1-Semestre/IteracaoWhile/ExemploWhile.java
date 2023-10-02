package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int i = 0;
        while (i < 10) {
            i += 1;
            System.out.println("Essa é a Iteração de número " + i + ".");
        }
    }

    public void exemplo2() { // jogo de adivinhação
        Random rd = new Random();
        int nAleatorio = rd.nextInt(10);
        boolean tenteNovamente = true;
        System.out.println("Aperte CTRL+C, a qualquer momento, para parar.");
        while (tenteNovamente) {
            System.out.println("Tente adivinhar o número: ");
            int numero = sc.nextInt();
            if (numero == nAleatorio) {
                System.out.println("Acertou !");
                tenteNovamente = false;
            } else {
                System.out.println("Errou !");
            }
        }
    }

    public void exemplo3() {
        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("Digite o valor para o vetor[" + i + "]");
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println("O valor do vetor[" + i + "] : " + vetor[i]);
            i++;
        }
    }
}