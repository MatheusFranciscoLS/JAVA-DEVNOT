package ExerciciosIfeElse;

import java.util.Scanner;

public class ExerciciosIf {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Informe o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Informe o segundo valor: ");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior: " + valor1);
        } else if (valor1 == valor2) {
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println("O segundo valor é maior: " + valor2);
        }
    }

    public void exercicio2() {
        System.out.println("Digite seu ano de nascimento:");
        int idade = sc.nextInt();

        double votarAno = 2024 - idade;
        boolean votar = votarAno >= 18;
        boolean votoOpcional = votarAno >= 16;

        if (votar) {
            System.out.println("Voce já tem idade para o Voto Obrigatorio");

        } else if (votoOpcional) {
            System.out.println("Voce pode votar ano que vem (Voto Opcional)");
        } else {
            System.out.println("Voce poderá votar somente após alguns anos");
        }
    }

    public void exercicio3() {
        System.out.println("Digite a senha contendo 4 numeros");
        int senha = sc.nextInt();

        if (senha == 1234) {

            System.out.println("Voce acertou a senha !! ACESSO PERMITIDO ");
        } else {
            System.out.println("Você errou a senha !! ACESSO NEGADO");
        }
    }

    public void exercicio4() {
        System.out.println("Informe quantas maçã comprou: ");
        int macaCompradas = sc.nextInt();

        double valorDuzia = macaCompradas * 0.25;
        double valorMaca = macaCompradas * 0.30;

        if (macaCompradas >= 12) {
            System.out.println("O valor das Maças será de: R$" + valorDuzia);

        } else {
            System.out.print("O valor das Maças será de: R$" + valorMaca);
        }
    }

    public void exercicio5() {
        System.out.println("Informe o primeiro numero:");
        int A = sc.nextInt();
        System.out.println("Informe o segundo numero:");
        int B = sc.nextInt();
        System.out.println("Informe o terceiro numero:");
        int C = sc.nextInt();

        if (A > B && A > C && B > C) {
            System.out.println("A ordem dos numeros será: " + A + B + C);
        }

        else if (B > A && A > C && B > C) {
            System.out.println(" A ordem dos numeros será: " + B + A + C);
        }

        else if (C > A && B > A && C > A) {
            System.out.println(" A ordem dos numeros será: " + C + B + A);
        }

        else if (C > A && A > B && C > A) {
            System.out.println(" A ordem dos numeros será: " + C + A + B);
        }

        else if (A > B && C > B && A > C) {
            System.out.println("A ordem dos numeros será: " + A + C + B);
        } else if (B > A && C > A && B > C) {
            System.out.print("A ordem dos numeros será: " + B + C + A);
        } else {
            System.out.println("A ordem dos numeros será: " + C + A + B);
        }
    }

    public void exercicio6() {
        System.out.println("Informe a sua altura:");
        double altura = sc.nextDouble();

        System.out.println("Informe seu sexo. Sendo 1 para Masculino e 2 para Feminino");
        int sexo = sc.nextInt();

        double pesoMasculino = (72.7 * altura) - 58;
        double pesoFeminino = (62.1 * altura) - 44.7;

        if (sexo == 2) {
            System.out.println("O seu peso ideal é de : " + pesoFeminino + "Kg.");
        }else{
            System.out.println("O seu peso ideal é de : " + pesoMasculino + "Kg.");
        }
    }

    public void exercicio7() {

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

    public void exercicio8() {
        System.out.println("Informe o primeiro numero:");
        int n1 = sc.nextInt();

        if (n1 % 2 == 1) {

            System.out.println("O numero é impar");
        } else {
            System.out.println("O numero é par");
        }
    }

    public void exercicio9() {
        System.out.println("Informe sua nota");
        int nota = sc.nextInt();

        if (nota > 7) {
            System.out.println("Aprovado");
        } else if (nota > 6 && nota < 7) {
            System.out.println("Ficou de recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void exercicio10() {
        System.out.println("Informe a letra");
        char letra = sc.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }

    public void exercicio11() {
        System.out.println("Informe seu salario");
        double salario = sc.nextDouble();

        if (salario <= 1280) {
            double aumento = (salario * 20) / 100;
            double salarioaumento = salario + aumento;

            System.out.println("Seu salario antes do reajuste é" + salario);
            System.out.println("Foi aplicado 20% de aumento");
            System.out.println(" O valor foi de: " + aumento);
            System.out.println("O valor final do seu salario é de:" + salarioaumento);

        } else if (salario >= 1281 || salario <= 1700) {

            double aumento = (salario * 15) / 100;
            double salarioaumento = salario + aumento;

            System.out.println("Seu salario antes do reajuste é" + salario);
            System.out.println("Foi aplicado 15% de aumento");
            System.out.println(" O valor foi de: " + aumento);
            System.out.println("O valor final do seu salario é de:" + salarioaumento);

        } else if (salario >= 1701 || salario <= 2500) {

            double aumento = (salario * 10) / 100;
            double salarioaumento = salario + aumento;

            System.out.println("Seu salario antes do reajuste é" + salario);
            System.out.println("Foi aplicado 10% de aumento");
            System.out.println(" O valor foi de: " + aumento);
            System.out.println("O valor final do seu salario é de:" + salarioaumento);
        } else {
            double aumento = (salario * 5) / 100;
            double salarioaumento = salario + aumento;

            System.out.println("Seu salario antes do reajuste é" + salario);
            System.out.println("Foi aplicado 5% de aumento");
            System.out.println(" O valor foi de: " + aumento);
            System.out.println("O valor final do seu salario é de:" + salarioaumento);
        }
    }

    public void exercicio12() {

        System.out.println("Informe quanto recebe por hora");
        double valor = sc.nextDouble();
        System.out.println("Informe quantas horas trabalhou no mes");
        double hora = sc.nextInt();

        double salario = valor * hora;
        double sindicato = (salario * 3) / 100;
        double inss = (salario * 10) / 100;
        double fgts = (salario * 11) / 100;

        if (salario <= 900) {

            double totalDescontos = sindicato + inss;
            double salarioLiquido = salario - totalDescontos;
            System.out.println("Segue abaixo a folha de pagamento");
            System.out.println(" Salario Bruto: " + salario);
            System.out.println("Voce será isento do IR");
            System.out.println("Voce arrecadara 3% para o Sindicato: " + sindicato);
            System.out.println("Voce arrecadará 10% para o INSS:" + inss);
            System.out.println("A empresa arrecadará 11% ao FGTS:" + fgts);
            System.out.println("O total de descontos será de:" + totalDescontos);
            System.out.println("Voce receberá o salario de: " + salarioLiquido);

        } else if (salario >= 901 && salario <= 1500) {

            double ir = (salario * 5) / 100;
            double totalDescontos = sindicato + inss + ir;
            double salarioLiquido = salario - totalDescontos;

            System.out.println("Segue abaixo a folha de pagamento");
            System.out.println(" Salario Bruto: " + salario);
            System.out.println("Voce arrecadara 5% para o IR:" + ir);
            System.out.println("Voce arrecadara 3% para o Sindicato: " + sindicato);
            System.out.println("Voce arrecadará 10% para o INSS:" + inss);
            System.out.println("A empresa arrecadará 11% ao FGTS:" + fgts);
            System.out.println("O total de descontos será de:" + totalDescontos);
            System.out.println("Voce receberá o salario de: " + salarioLiquido);

        } else if (salario >= 1501 && salario <= 2500) {

            double ir = (salario * 10) / 100;
            double totalDescontos = sindicato + inss + ir;
            double salarioLiquido = salario - totalDescontos;

            System.out.println("Segue abaixo a folha de pagamento");
            System.out.println(" Salario Bruto: " + salario);
            System.out.println("Voce arrecadara 10% para o IR:" + ir);
            System.out.println("Voce arrecadara 3% para o Sindicato: " + sindicato);
            System.out.println("Voce arrecadará 10% para o INSS:" + inss);
            System.out.println("A empresa arrecadará 11% ao FGTS:" + fgts);
            System.out.println("O total de descontos será de:" + totalDescontos);
            System.out.println("Voce receberá o salario de: " + salarioLiquido);

        } else {

            double ir = (salario * 20) / 100;
            double totalDescontos = sindicato + inss + ir;
            double salarioLiquido = salario - totalDescontos;

            System.out.println("Segue abaixo a folha de pagamento");
            System.out.println(" Salario Bruto: " + salario);
            System.out.println("Voce arrecadara 20% para o IR:" + ir);
            System.out.println("Voce arrecadara 3% para o Sindicato: " + sindicato);
            System.out.println("Voce arrecadará 10% para o INSS:" + inss);
            System.out.println("A empresa arrecadará 11% ao FGTS:" + fgts);
            System.out.println("O total de descontos será de:" + totalDescontos);
            System.out.println("Voce receberá o salario de: " + salarioLiquido);
        }
    }
}