package ProjetoFinal1Semestre.Tipo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Banco {
    Scanner sc = new Scanner(System.in);

    double nConta;
    double saldo;
    String nome;
    double salario;
    double faturamento;

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public void saldo() {
        System.out.println("Seu saldo é: " + getSaldo());
        System.out.println("Voce deseja depositar algum valor?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Qual é o valor que gostaria de depositar?");
            double valor = sc.nextDouble();
            saldo += valor;
            System.out.println("Seu saldo atual é de: " + getSaldo());
        } else if (opcao == 2) {
            System.out.println("============================================");
            System.out.println("Voce saiu da opção 'Saldo'");
            System.out.println("============================================");
        } else {
            System.out.println("Opção inválida. Digite uma opção válida (1 ou 2).");
        }
    }

    public void deposito() {
        double deposito = 0;
        System.out.println("Voce deseja depositar algum valor?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Qual é o valor que gostaria de depositar?");
            double valor = sc.nextDouble();
            saldo += valor;
            System.out.println("Seu saldo atual é de: " + saldo);
        } else if (opcao == 2) {
            System.out.println("============================================");
            System.out.println("Voce saiu da opção 'Deposito'");
            System.out.println("============================================");
        } else {
            System.out.println("Opção inválida. Digite uma opção válida (1 ou 2).");
        }
    }

    public void saque() {
        double saque = 0;
        System.out.println("Voce deseja sacar algum valor?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Qual é o valor do saque?");
            double valor = sc.nextDouble();
            saldo -= valor;
            System.out.println("Seu saldo atual é de: " + saldo);
        } else if (opcao == 2) {
            System.out.println("============================================");
            System.out.println("Voce saiu da opção 'Saque'");
            System.out.println("============================================");
        } else {
            System.out.println("Opção inválida. Digite uma opção válida (1 ou 2).");
        }
    }

    public void emprestimo() {
        System.out.println("Você deseja pedir um empréstimo?");
        System.out.println("Digite 1 para sim e 2 para não");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Qual é o valor do empréstimo?");
            double valor = sc.nextDouble();
            if (salario >= 1500 || faturamento >= 1500) {
                System.out.println("Disponivel até R$2500 para empréstimo");
                System.out.println("Digite a quantidade solicitada");
                double emprestimo = sc.nextDouble();
                saldo += emprestimo;
                System.out.println("Empréstimo realizado com sucesso!"
                        + "\n Valor solicitado: R$" + emprestimo
                        + "\n Saldo após empréstimo: R$" + saldo);
            } else {
                System.out.println("Valor inválido para o empréstimo. Salario ou Faturamento baixo");
            }
        } else if (opcao == 2) {
            System.out.println("============================================");
            System.out.println("Você saiu da opção 'Empréstimo'");
            System.out.println("============================================");
        } else {
            System.out.println("Opção inválida. Digite uma opção válida (1 ou 2).");
        }
    }

    public void mostrarAcao() {
        boolean opcao2 = true;
        System.out.println("============================================");
        System.out.println("Informe a ação Desejada:"
                + "\n1-Verificar Saldo"
                + "\n2-Sacar"
                + "\n3-Depositar"
                + "\n4-Pedir Empréstimo"
                + "\n5-Sair da Conta");

        while (opcao2) {
            int acao2 = sc.nextInt();
            switch (acao2) {
                case 1:
                    System.out.println("Você gostaria de verificar o saldo");
                    saldo();
                    System.out.println("============================================");
                    System.out.println("Informe a ação Desejada:"
                            + "\n1-Verificar Saldo"
                            + "\n2-Sacar"
                            + "\n3-Depositar"
                            + "\n4-Pedir Empréstimo"
                            + "\n5-Sair da Conta");
                    break;
                case 2:
                    System.out.println("Você gostaria de sacar");
                    saque();
                    System.out.println("============================================");
                    System.out.println("Informe a ação Desejada:"
                            + "\n1-Verificar Saldo"
                            + "\n2-Sacar"
                            + "\n3-Depositar"
                            + "\n4-Pedir Empréstimo"
                            + "\n5-Sair da Conta");
                    break;
                case 3:
                    System.out.println("Você gostaria de depositar");
                    deposito();
                    System.out.println("============================================");
                    System.out.println("Informe a ação Desejada:"
                            + "\n1-Verificar Saldo"
                            + "\n2-Sacar"
                            + "\n3-Depositar"
                            + "\n4-Pedir Empréstimo"
                            + "\n5-Sair da Conta");
                    break;
                case 4:
                    System.out.println("Você gostaria de pedir empréstimo");
                    emprestimo();
                    System.out.println("============================================");
                    System.out.println("Informe a ação Desejada:"
                            + "\n1-Verificar Saldo"
                            + "\n2-Sacar"
                            + "\n3-Depositar"
                            + "\n4-Pedir Empréstimo"
                            + "\n5-Sair da Conta");
                    break;
                case 5:
                    System.out.println("Você deseja sair da conta?");
                    System.out.println("Digite 1 para sim e 2 para não");
                    int opcao = sc.nextInt();
                    if (opcao == 1) {
                        System.out.println("============================================");
                        System.out.println("Você saiu da Conta");
                        System.out.println("============================================");
                        opcao2 = false;
                        System.out.println("============================================");
                        System.out.println("Informe a ação Desejada:"
                                + "\n1-Criar Conta Fisica"
                                + "\n2-Criar Conta Juridica"
                                + "\n3-Acessar Conta Fisica"
                                + "\n4-Acessar Conta Juridica"
                                + "\n5-Sair");
                    } else if (opcao == 2) {
                        System.out.println("============================================");
                        System.out.println("Você não saiu da opção 'Sair da Conta'");
                        System.out.println("============================================");
                        System.out.println("Informe a ação Desejada:"
                                + "\n1-Verificar Saldo"
                                + "\n2-Sacar"
                                + "\n3-Depositar"
                                + "\n4-Pedir Empréstimo"
                                + "\n5-Sair da Conta");
                    } else {
                        System.out.println("Opção inválida. Digite uma opção válida (1 a 5).");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida (1 a 5).");
                    break;
            }
        }
    }
}