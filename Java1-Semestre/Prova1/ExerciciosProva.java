package Prova1;

import java.util.Scanner;

public class ExerciciosProva {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = sc.nextInt();

        System.out.println("Digite qual operação quer fazer: ( + , - , * , / )");
        char operacao = sc.next().charAt(0);

        if (operacao == '+') {
            double mais = n1 + n2;
            System.out.println("O resultado da operação é: " + mais);

        } else if (operacao == '-') {
            double menos = n1 - n2;
            System.out.println("O resultado da operação é: " + menos);

        } else if (operacao == '*') {
            double vezes = n1 * n2;
            System.out.println("O resultado da operação é: " + vezes);

        } else if (operacao == '/' && n2 != 0) {
            double divisao = n1 / n2;
            System.out.println("O resultado da operação é: " + divisao);
        } else if (operacao == '/' && n2 == 0) {
            System.out.println("A operação não pode ser realizada");
        } else{
            System.out.println("Informe uma operação valida");
        }
    }

    public void exercicio2() {
        System.out.println("Digite o seu numero de matricula");
        int nMatricula = sc.nextInt();

        double resto = nMatricula % 4;

        if (resto == 0) {
            System.out.println("Voce irá para o Time do Chris");
        } else if (resto == 1) {
            System.out.println("Voce irá para o Time do Greg");
        } else if (resto == 2) {
            System.out.println("Voce irá para o Time do Caruso");
        } else if (resto == 3) {
            System.out.println("Voce irá para o Time do Jerome");
        } else{
            System.out.println("Informe um numero valido !");
        }
    }

    public void exercicio3() {
        System.out.println("Quantos kg de Morango voce comprou? ");
        int kgMorango = sc.nextInt();
        System.out.println("Quantos kg de Maca voce comprou? ");
        int kgMaca = sc.nextInt();
        System.out.println("Quantos kg de Banana voce comprou? ");
        int kgBanana = sc.nextInt();

        double morango = 2.5;
        double maca = 1.8;
        double banana = 1.3;

        double finalMorango = morango * kgMorango;
        double finalMaca = maca * kgMaca;
        double finalBanana = banana * kgBanana;

        double kgTotal = kgMorango + kgMaca + kgBanana;
        double valorfinal = finalMorango + finalMaca + finalBanana;

        if (kgTotal > 8 || valorfinal > 25) {

            double desconto = (valorfinal * 10) / 100;
            double valorCompra = valorfinal - desconto;

            System.out.println("Voce comprou um total de kg de morango: " + kgMorango);
            System.out.println("Voce comprou um total de kg de maca: " + kgMaca);
            System.out.println("Voce comprou um total de kg de banana: " + kgBanana);
            System.out.println("O valor da sua compra foi de : " + valorfinal);
            System.out.println("Voce receberá 10% de desconto: " + desconto);
            System.out.println("O valor final da sua compra será de: " + valorCompra);
        } else {
            System.out.println("Voce comprou um total de kg de morango: " + kgMorango);
            System.out.println("Voce comprou um total de kg de maca: " + kgMaca);
            System.out.println("Voce comprou um total de kg de banana: " + kgBanana);
            System.out.println("O valor da sua compra foi de : " + valorfinal);
            System.out.println("Voce não tem direito a desconto");
        }
    }

    public void exercicio4() {
        System.out.println("Favor informar seus dados abaixo.");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Sexo M para masculino e F para feminino: (Maiúscula)");
        char sexo = sc.next().charAt(0);

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        System.out.println("Peso: ");
        double peso = sc.nextDouble();

        double pesoIdealM = (72.7 * altura) - 58;
        double pesoIdealF = (62.1 * altura) - 44.7;
        double imc = 0;

        if (sexo == 'M') {
            System.out.println("Seu peso ideal é: " + pesoIdealM + "kg");
            imc = pesoIdealM;
        } else if (sexo == 'F') {
            System.out.println("Seu peso ideal é: " + pesoIdealF + "kg");
            imc = pesoIdealF;
        } else {
            System.out.println("Favor inserir M ou F para que possa ser calculado seu peso ideal.");
        }

        if (peso > pesoIdealM && sexo == 'M') {
            double percaPeso = peso - pesoIdealM;
            System.out.println("Você deverá perder " + percaPeso + "kg para chegar no seu peso ideal.");
        } else if (peso < pesoIdealM && sexo == 'M') {
            double ganhaPeso = pesoIdealM - peso;
            System.out.println("Você deverá ganhar " + ganhaPeso + "kg para chegar no seu peso ideal.");
        } else {
        }

        if (peso > pesoIdealF && sexo == 'F') {
            double percaPeso = peso - pesoIdealF;
            System.out.println("Você deverá perder " + percaPeso + "kg para chegar no seu peso ideal.");
        } else if (peso < pesoIdealF && sexo == 'F') {
            double ganhaPeso = pesoIdealF - peso;
            System.out.println("Você deverá ganhar " + ganhaPeso + "kg para chegar no seu peso ideal.");
        } else {
        }

        double nivel = 0;

        if (imc < 20) {
            System.out.println("Sua Classificação é de Abaixo do Peso");
            System.out.println("ATIVIDADE DIFICIL - Voce precisa ganhar massa muscular ");
            nivel = 3;

        } else if (imc > 20 && imc < 27) {
            System.out.println("Sua Classificação Está Dentro do Normal");
            System.out.println("ATIVIDADE MODERADA - Voce pode melhorar a capacidade em aerobica");
            nivel = 2;

        } else if (imc > 27) {
            System.out.println("Sua Classificação é de Acima do Peso");
            System.out.println("ATIVIDADE LEVE - Voce precisa melhorar a resistencia e perder peso  ");
            nivel = 1;
        } else {
        }

        int faixaEtaria = 0;
        if (idade > 16 && idade <= 25) {
            System.out.println("Sua faixa etária é : IDADE I");
            faixaEtaria = 1;
        } else if (idade > 25 && idade <= 35) {
            System.out.println("Sua faixa etária é : IDADE II");
            faixaEtaria = 2;
        } else if (idade > 35 && idade <= 45) {
            System.out.println("Sua faixa etária é : IDADE III");
            faixaEtaria = 3;
        } else if (idade > 45 && idade <= 55) {
            System.out.println("Sua faixa etária é : IDADE IV");
            faixaEtaria = 4;
        } else if (idade > 55 && idade <= 65) {
            System.out.println("Sua faixa etária é : IDADE V");
            faixaEtaria = 4;
        } else if (idade > 65) {
            System.out.println("Sua faixa etária é : IDADE VI");
            faixaEtaria = 6;
        } else {
            System.out.println("Coloque uma idade acima de 16 anos.");
        }

        if (nivel == 3 && (faixaEtaria == 2 || faixaEtaria == 3)) {
            System.out.println("Faça Musculação Intensa");
        }
        if (nivel == 2 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4)) {
            System.out.println("Faça Musculação Moderada");
        }
        if (nivel == 1 && (faixaEtaria == 1 || faixaEtaria == 4 || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Musculação leve");
        }
        if (nivel == 3 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4))
            System.out.println("Faça Luta");
        if (nivel == 2 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4
                || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Dança");
        }
        if (nivel == 3 && (faixaEtaria == 4 || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Pilates");
        }
        if (nivel == 2 && (faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4 || faixaEtaria == 5)) {
            System.out.println("Faça Corrida");
        }
        if (nivel == 1 && (faixaEtaria == 1 || faixaEtaria == 2 || faixaEtaria == 3 || faixaEtaria == 4
                || faixaEtaria == 5 || faixaEtaria == 6)) {
            System.out.println("Faça Ioga");
        }
    }
}