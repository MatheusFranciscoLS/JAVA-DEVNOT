package ProjetoFinal1Semestre.Tipo;

import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);

    public double nConta;
    public double saldo;
    public String nome;
    int opcao2 = sc.nextInt();
    int acao = sc.nextInt();

    public double getnConta() {
        return nConta;
    }

    public void setnConta(double nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void saldo() {
        System.out.println("Seu saldo é: " + getSaldo());
        System.out.println("Voce deseja depositar algum valor?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Qual é o valor que gostaria de depositar?");
            double valor = sc.nextInt();
            saldo += valor;
            System.out.println("Seu saldo atual é de: " + getSaldo());
        } else if (opcao == 2) {
            System.out.println("Voce saiu da opção 'Saldo'");
        } else {
            System.out.println("Digite uma opção valida");
        }
    }

    public void deposito() {
        double deposito = 0;
        System.out.println("Voce deseja depositar algum valor?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Qual é o valor que gostaria de depositar?");
            double valor = sc.nextInt();
            saldo += valor;
            System.out.println("Seu saldo atual é de: " + saldo);
        } else if (opcao == 2) {
            System.out.println("Voce saiu da opção 'Deposito'");
        } else {
            System.out.println("Digite uma opção valida");
        }
    }

    public void saque() {
        double saque = 0;
        System.out.println("Voce deseja sacar algum valor?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Qual é o valor do saque?");
            double valor = sc.nextInt();
            saldo -= valor;
            System.out.println("Seu saldo atual é de: " + saldo);
        } else if (opcao == 2) {
            System.out.println("Voce saiu da opção 'Saque'");
        } else {
            System.out.println("Digite uma opção valida");
        }
    }

    public void emprestimo() {
        System.out.println("Voce deseja Pedir emprestimo?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Qual é o valor do emprestimo?");
            double valor = sc.nextInt();
            System.out.println("Seu saldo atual é de: " + saldo);
            System.out.println("Voce tem um emprestimo de:" + valor);
        } else if (opcao == 2) {
            System.out.println("Voce saiu da opção 'Emprestimo'");
        } else {
            System.out.println("Digite uma opção valida");
        }
    }


    public void mostrarAcao() {
        boolean opcao2 = true;
        System.out.println("============================================");
        System.out.println("O que você deseja fazer na sua conta?");
        System.out.println("Informe a ação Desejada:"
                + "\n1-Verificar Saldo"
                + "\n2-Sacar"
                + "\n3-Depositar"
                + "\n4-Pedir Empréstimo"
                + "\n5-Sair da Conta");

        int acao2 = sc.nextInt();
        while (opcao2) {
            switch (acao2) {
                case 1:
                    System.out.println("Você gostaria de verificar o saldo");
                    saldo();
                    break;
                case 2:
                    System.out.println("Você gostaria de sacar");
                    saque();
                    break;
                case 3:
                    System.out.println("Você gostaria de depositar");
                    deposito();
                    break;
                case 4:
                    System.out.println("Você gostaria de pedir empréstimo");
                    emprestimo();
                    break;
                case 5:
                    System.out.println("Você deseja sair da conta?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Você saiu da Conta");
            System.out.println("============================================");
            opcao2 = false;
                System.out.println("Informe a ação Desejada:"
                + "\n1-Criar Conta Fisica"
                + "\n2-Criar Conta Juridica"
                + "\n3-Acessar Conta Fisica"
                + "\n4-Acessar Conta Juridica"
                + "\n5-Sair");
        } else if (opcao == 2) {
            System.out.println("Você não saiu da opção 'Sair da Conta'");
            mostrarAcao();
        } else {
        }
                    break;
                default:
                    break;
            }
        }
    }
}