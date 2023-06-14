package ProjetoFinal1Semestre;

import java.util.Scanner;

import ProjetoFinal1Semestre.Tipo.PessoaFisica;
import ProjetoFinal1Semestre.Tipo.PessoaJuridica;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaFisica pF1 = new PessoaFisica();
        PessoaJuridica pJ1 = new PessoaJuridica();

        boolean banco = true;

        System.out.println("Bem vindo ao Banco");
        System.out.println("Informe a ação Desejada:"
                + "\n1-Criar Conta Fisica"
                + "\n2-Criar Conta Juridica"
                + "\n3-Acessar Conta Fisica"
                + "\n4-Acessar Conta Juridica"
                + "\n5-Sair");
        while (banco) {
            int acao = sc.nextInt();
            switch (acao) {
                case 1:
                    System.out.println("========================================");
                    System.out.println("Vamos criar uma conta para pessoa fisica");
                    pF1.criarContaFisica();
                    break;
                case 2:
                    System.out.println("==========================================");
                    System.out.println("Vamos criar uma conta para pessoa juridica");
                    pJ1.criarContaJuridica();
                    break;
                case 3:
                    System.out.println("==========================================");
                    System.out.println("Vamos acessar sua conta física");
                    System.out.println("Você deseja entrar através do seu nome ou número da conta?");
                    System.out.println("Digite 1 para nome ou 2 para número da conta");
                    int opcao1 = sc.nextInt();
                    if (opcao1 == 1) {
                        System.out.println("Digite o nome:");
                        String nome = sc.next();
                        PessoaFisica contaEncontrada = pF1.buscarContaPeloNome(nome);
                        if (contaEncontrada != null) {
                            System.out.println("Conta encontrada: " + nome);
                            System.out.println("============================================");
                            pF1.mostrarAcao();
                        } else {
                            System.out.println("Conta não encontrada");
                            System.out.println("Informe a ação Desejada:"
                                    + "\n1-Criar Conta Fisica"
                                    + "\n2-Criar Conta Juridica"
                                    + "\n3-Acessar Conta Fisica"
                                    + "\n4-Acessar Conta Juridica"
                                    + "\n5-Sair");
                        }
                    } else if (opcao1 == 2) {
                        System.out.println("Digite o número da conta:");
                        int nConta = sc.nextInt();
                        PessoaFisica contaEncontrada = pF1.buscarContaPeloNumero(nConta);
                        if (contaEncontrada != null) {
                            System.out.println("Conta encontrada: " + nConta);
                            System.out.println("============================================");
                            pF1.mostrarAcao();
                        } else {
                            System.out.println("Conta não encontrada");
                            System.out.println("Informe a ação Desejada:"
                                    + "\n1-Criar Conta Fisica"
                                    + "\n2-Criar Conta Juridica"
                                    + "\n3-Acessar Conta Fisica"
                                    + "\n4-Acessar Conta Juridica"
                                    + "\n5-Sair");

                        }
                    } else {
                        System.out.println("Digite uma opção valida");
                    }
                    break;
                case 4:
                    System.out.println("==========================================");
                    System.out.println("Vamos acessar sua conta juridica");
                    System.out.println("Você deseja entrar através do seu nome corporativo ou número da conta?");
                    System.out.println("Digite 1 para nome ou 2 para número da conta");
                    int opcao3 = sc.nextInt();
                    if (opcao3 == 1) {
                        System.out.println("Digite o nome:");
                        String nome = sc.next();
                        PessoaJuridica contaEncontrada = pJ1.buscarContaPeloNome(nome);
                        if (contaEncontrada != null) {
                            System.out.println("Conta encontrada: " + nome);
                            System.out.println("============================================");
                            pJ1.mostrarAcao();
                        } else {
                            System.out.println("Conta não encontrada");
                        }
                    } else if (opcao3 == 2) {
                        System.out.println("Digite o número da conta:");
                        int nConta = sc.nextInt();
                        PessoaJuridica contaEncontrada = pJ1.buscarContaPeloNumero(nConta);
                        if (contaEncontrada != null) {
                            System.out.println("Conta encontrada: " + nConta);
                            System.out.println("============================================");
                            pJ1.mostrarAcao();
                        } else {
                            System.out.println("Conta não encontrada");
                        }
                    } else {
                        System.out.println("Digite uma opção valida");
                    }
                    break;
                case 5:
                    System.out.println("Voce saiu do Banco");
                    banco = false;
                    break;
                default:
                    System.out.println("Informe um nº válido");
                    break;
            }
        }
    }
}