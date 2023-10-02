package ExerciciosFor;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero do vetor [" + i + "]");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O numero do vetor " + i + " é " + vetor[i]);
        }
    }

    public void exercicio2() {
        double vetor[] = new double[10];

        // pegar as 4 notas do aluno
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero do vetor [" + i + "]");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("O numero do vetor " + i + " é " + vetor[i]);
        }
    }

    public void exercicio3() {
        double vetor[] = new double[4];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor da " + (i + 1) + "º nota");
            vetor[i] = sc.nextDouble();
        }
        // mostrar as notas e calcular a média
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Nota " + (i + 1) + " = " + vetor[i]);
            media += vetor[i];
        }
        // dividir a media pelo nº de nota
        media /= vetor.length;
        // imprimir a media
        System.out.println("A media do aluno é " + media);
    }

    public void exercicio4() {
        // char letras[] = new char[]{'a','b','c','d','e','f','g','h','i','j'};
        String letras2[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // percorrer o vetor para procurar letras vogais ou consoante
        // contar o nº de consoantes
        int cont = 0;
        for (int i = 0; i < letras2.length; i++) {
            if (letras2[i] != "a" && letras2[i] != "e" && letras2[i] != "i" && letras2[i] != "o" && letras2[i] != "u") {
                System.out.println(letras2[i] + " É consoante");
                cont++;
            } else {
                System.out.println(" É vogal");
            }
        }
        // mostrar o contator de consoantes
        System.out.println("O numero de consoante é " + cont);
    }

    public void exercicio4x() {
        System.out.println("Digite uma palavra");
        String palavra = sc.next(); // ler a palavra digitada pelo usuario e guardar na string
        palavra = palavra.toLowerCase();
        // percorrer a String para procurar letras vogais ou consoante
        // contar o nº de consoantes
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " É consoante");
                cont++;
            }
        }
        // mostrar o contator de consoantes
        System.out.println("Foi digitado a palavra " + palavra);
        System.out.println("O numero de consoante é " + cont);
    }

    // ler 20 numeros e separar em Pares e Impares
    public void exercicio5() {
        int numeros[] = new int[20];
        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o numero do vetor [" + i + "]");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];

        // distribuir o nº do vetor nº para os vetores par e impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                nPar[contPar] = numeros[i];
                contPar++;
                System.out.println("Vetor Par [" + i + "] = " + nPar[i]);
            } else {
                nImpar[contImpar] = numeros[i];
                contImpar++;
                System.out.println("Vetor Impar [" + i + "] = " + nImpar[i]);
            }
        }
    }

    public void exercicio6() {
        // ler 4 notas e mostar as 4 notas e a média
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a Nota " + (i + 1) + ":");
            vetorNotas[i] = sc.nextDouble();
        }
        // imprimir as 4 notas e calcular a média
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A " + (i + 1) + "ª Nota é "
                    + vetorNotas[i]);
        }
        // Imprimir a média
        mediaNotas /= vetorNotas.length;
        System.out.printf("A média do Aluno é %.2f"
                + mediaNotas);
    }

    public void exercicio7() {
        // criar vetor
        int vetor[] = new int[5];
        // percorrer o vetor e realizar as operações(+ e *)
        int soma = 0;// acumular a soma dos elementos do vetor
        int mult = 1;// acumular a multiplicação dos elementos do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero do vetor [" + i + "]");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i]; // acumula a soma
            mult *= vetor[i]; // acumula a multiplicação
        }
        System.out.println("O valor da Soma do vetor é " + soma);
        System.out.println("O valor da Multiplicação do vetor é " + mult);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exercicio8() {
        // ler idade e altura de 5 pessoas
        String nome[] = new String[5];
        int idade[] = new int[5];
        double altura[] = new double[5];
        for (int i = 0; i < idade.length; i++) {
            System.out.print("Informe o nome:  ");
            nome[i] = sc.next();
            System.out.print("Informe a idade:  ");
            idade[i] = sc.nextInt();
            System.out.print("Informe a altura:  ");
            altura[i] = sc.nextDouble();
        }
        // imprimir na ordem inversa
        for (int i = 4; i >= 0; i--) {
            System.out.println("Nome: " + nome[i]);
            System.out.println("Idade: " + idade[i]);
            System.out.println("Altura: " + altura[i]);
            System.out.println("++++++++++++++++++++++");
        }
    }

    public void exercicio9() {
        int vetor[] = new int[10];
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero do vetor [" + i + "]");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i] * vetor[i];
        }
        System.out.println("A soma dos quadrados é " + soma);
    }
}