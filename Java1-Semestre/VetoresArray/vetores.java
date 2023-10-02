package VetoresArray;

import java.util.Scanner;

public class vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criando um vetor
        double valores[] = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1ª Posição- Índice[0]:" + valores[0]);
        System.out.println("2ª Posição- Índice[0]:" + valores[1]);
        System.out.println("3ª Posição- Índice[0]:" + valores[2]);
        System.out.println("4ª Posição- Índice[0]:" + valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando o valor do Índice[0]
        System.out.println("1ª Posição- Índice[0]:" + valores[0]);
    }

    public void exemplo2() {
        // criando um vetor
        int valoresInt[] = new int[5];
        System.out.println("Digite os 5 numeros inteiros");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("1ª Posição- Índice[0]:" + valoresInt[0]);
        System.out.println("2ª Posição- Índice[0]:" + valoresInt[1]);
        System.out.println("3ª Posição- Índice[0]:" + valoresInt[2]);
        System.out.println("4ª Posição- Índice[0]:" + valoresInt[3]);
        System.out.println("5ª Posição- Índice[0]:" + valoresInt[4]);
    }

    public void exericio1() {
        double valoresDouble[] = new double[10];
        System.out.println("Digite os 10 numeros reais");
        valoresDouble[0] = sc.nextDouble();
        valoresDouble[1] = sc.nextDouble();
        valoresDouble[2] = sc.nextDouble();
        valoresDouble[3] = sc.nextDouble();
        valoresDouble[4] = sc.nextDouble();
        valoresDouble[5] = sc.nextDouble();
        valoresDouble[6] = sc.nextDouble();
        valoresDouble[7] = sc.nextDouble();
        valoresDouble[8] = sc.nextDouble();
        valoresDouble[9] = sc.nextDouble();
        System.out.println("A ordem inversa dos valores são:" + valoresDouble[9] + valoresDouble[8] + valoresDouble[7]
                + valoresDouble[6] + valoresDouble[5] + valoresDouble[4] + valoresDouble[3] + valoresDouble[2]
                + valoresDouble[1] + valoresDouble[0]);
    }

    public void exercicio2() {
        double notas[] = new double[4];

        System.out.println("Digite 4 notas");
        notas[0] = sc.nextDouble();
        notas[1] = sc.nextDouble();
        notas[2] = sc.nextDouble();
        notas[3] = sc.nextDouble();
        
        double mediaNotas = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        System.out.println("As 4 notas são " + notas[0] + "," + notas[1] + "," + notas[2] + ","
                + notas[3]);
        System.out.println("A media é de: " + mediaNotas);
    }
}
