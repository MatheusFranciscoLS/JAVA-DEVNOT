package Operacoes.ExercicioOperadores;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);

    public void notasFrequencias() {

        System.out.println("Informe a nota 1 do aluno?");
        int nota1 = sc.nextInt();

        System.out.println("Informe a nota 2 do aluno?");
        int nota2 = sc.nextInt();

        double mediaNotas = (nota1 + nota2) / 2;

        System.out.println("A media do aluno foi de:" + mediaNotas);

        System.out.println("Informe a frequencia do aluno?");
        int frequencia = sc.nextInt();

        System.out.println("A frequencia do aluno foi de: " + frequencia + "%");

        boolean notaAltas = mediaNotas >= 5;
        boolean frequenciaAlta = frequencia >= 75;

        boolean aprovado = notaAltas && frequenciaAlta;

        System.out.println("O aluno foi aprovado? " + aprovado);
        System.out.println("==============================================");

        if (aprovado == true) {

            System.out.println("Parabens!! Voce foi aprovado");

        } else {

            System.out.println("Tente melhorar para o proximo ano !");

        }
    }
}