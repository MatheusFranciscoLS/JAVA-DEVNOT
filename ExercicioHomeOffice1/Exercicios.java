package ExercicioHomeOffice1;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {

        System.out.println("Digite um valor");
        double valor = sc.nextDouble();

        if (valor > 10) {
            System.out.println("O valor é MAIOR QUE 10 !");
        } else if (valor == 10) {
            System.out.println("O valor é igual a 10 !");
        } else {
            System.out.println("O valor NÃO É MAIOR QUE 10 !");
        }
    }

    public void exercicio2() {
        System.out.println("Informe o salario por hora");
        double salarioHora = sc.nextDouble();

        System.out.println("Informe quantas horas voce trabalhou");
        double horas = sc.nextDouble();

        double salario = salarioHora * horas;

        if (horas > 200) {
            double adicional = (salario * 50) / 100;
            double salarioFinal = salario + adicional;

            System.out.println("Voce receberá um valor adicional de: " + adicional);
            System.out.println(" O seu salario total vai ser de: " + salarioFinal);
        } else {
            System.out.println("Voce não fez hora extra");
            System.out.println("Seu salario vai ser de: " + salario);
        }
    }

    public void exercicio3() {
        System.out.println("Informe o salario");
        double salario = sc.nextDouble();

        System.out.println("Informe o valor total das vendas");
        double vendas = sc.nextDouble();

        if (vendas <= 2500) {

            double comissao = (vendas * 3) / 100;
            Double salarioFinal = salario + comissao;
            System.out.println("Você terá comissão de 3% do valor vendido");
            System.out.println("Seu salario vai ser de: " + salarioFinal);
        } else if (vendas > 2500) {

            double comissao = (vendas * 5) / 100;
            Double salarioFinal = salario + comissao;
            System.out.println("Você terá comissão de 5% do valor vendido");
            System.out.println("Seu salario vai ser de: " + salarioFinal);
        } else {
            System.out.println("Voce não teve comissão");
        }
    }

    public void exercicio4() {
        System.out.println("Digite o numero da sua conta:");
        int nConta = sc.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do seu debito");
        double debito = sc.nextDouble();

        System.out.println("digite o valor do seu credito");
        double credito = sc.nextDouble();

        double saldoAtual = (saldo - debito) + credito;

        if (saldoAtual >= 0) {
            System.out.println("Seu numero da conta é: " + nConta);
            System.out.println("Seu saldo está positivo");
        } else {
            System.out.println("Seu numero da conta é: " + nConta);
            System.out.println("Seu saldo está negativo");
        }
    }

    public void exercicio5() {
        System.out.println("Digite o primeiro valor");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor2 = sc.nextDouble();
        System.out.println("Digite o terceiro valor");
        double valor3 = sc.nextDouble();

        if (valor1 > valor2 && valor2 > valor3) {
            System.out.println("O maior valor é:" + valor1);

        } else if (valor2 > valor1 && valor1 > valor3) {
            System.out.println("O maior valor é:" + valor2);

        } else if (valor3 > valor2 && valor2 > valor1) {
            System.out.println("O maior valor é:" + valor3);

        } else if (valor3 > valor1 && valor1 > valor2) {
            System.out.println("O maior valor é:" + valor3);
        } else if (valor1 > valor2 && valor3 > valor2) {
            System.out.println("O maior valor é:" + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
    }

    public void exercicio6() {
        System.out.println("Informe a quantidade de litros vendidos");
        double litros = sc.nextDouble();
        System.out.println("Informe o tipo de combustivel, sendo A alcool e G gasolina");
        char tipo = sc.next().charAt(0);

        if (tipo == 'A' && litros <= 20) {
            double valorLitro = 3.9;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 3) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else if (tipo == 'A' && litros > 20) {
            double valorLitro = 3.9;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 5) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else if (tipo == 'G' && litros <= 20) {
            double valorLitro = 5.3;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 4) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else if (tipo == 'G' && litros > 20) {
            double valorLitro = 5.3;
            double valorCombustivel = valorLitro * litros;
            double descontos = (valorCombustivel * 6) / 100;
            double valorTotal = valorCombustivel - descontos;

            System.out.println("O valor para ser pago é de " + valorTotal);

        } else {
            System.out.println("Informe uma letra correta");
        }
    }

    public void exercicio7() {
        System.out.println("Informe o nome do produto");
        String nome = sc.nextLine();

        System.out.println("Informe a quantidade");
        int quantidade = sc.nextInt();

        System.out.println("Informe o preço unitario");
        double preco = sc.nextDouble();

        double precoTotal = quantidade * preco;

        if (quantidade <= 5) {
            double desconto = (precoTotal * 2) / 100;
            double precoDesconto = precoTotal - desconto;

            System.out.println("Nome do produto: " + nome);
            System.out.println("Voce comprou um total de " + quantidade + " produtos");
            System.out.println("Valor do Desconto: " + desconto);
            System.out.println(" Valor total da compra: " + precoDesconto);
        } else if (quantidade > 5 && quantidade <= 10) {
            double desconto = (precoTotal * 3) / 100;
            double precoDesconto = precoTotal - desconto;

            System.out.println("Nome do produto: " + nome);
            System.out.println("Voce comprou um total de " + quantidade + nome);
            System.out.println("Valor do Desconto: " + desconto);
            System.out.println(" Valor total da compra: " + precoDesconto);
        } else if (quantidade > 10) {
            double desconto = (precoTotal * 5) / 100;
            double precoDesconto = precoTotal - desconto;

            System.out.println("Nome do produto: " + nome);
            System.out.println("Voce comprou um total de " + quantidade + " produtos");
            System.out.println("Valor do Desconto: " + desconto);
            System.out.println(" Valor total da compra: " + precoDesconto);
        } else {
            System.out.println("Informe o que foi pedido");
        }
    }
}
