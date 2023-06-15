package ProjetoFinal1Semestre.Tipo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PessoaFisica extends Banco {
    Scanner sc = new Scanner(System.in);
    int maxConta = 100;
    PessoaFisica[] contas = new PessoaFisica[maxConta];
    int numContas = 0;

    double cpf;

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public void criarContaFisica() {
        PessoaFisica contaPessoaFisica = new PessoaFisica();
        System.out.println("Informe seu nome");
        contaPessoaFisica.setNome(sc.next());
        System.out.println("Informe seu CPF (somente numeros)");
        contaPessoaFisica.setCpf(sc.nextDouble());
        System.out.println("Informe seu Salario (somente numeros)");
        contaPessoaFisica.setSalario(sc.nextDouble());
        System.out.println("Informe o numero que deseja para sua conta");
        contaPessoaFisica.setnConta(sc.nextInt());
        System.out.println("============================================");
        System.out.println("Cadastro Realizado com Sucesso");
        System.out.println("========================================");
        contas[numContas] = contaPessoaFisica;
        numContas++;

        System.out.println("Informe a ação Desejada:"
                + "\n1-Criar Conta Fisica"
                + "\n2-Criar Conta Juridica"
                + "\n3-Acessar Conta Fisica"
                + "\n4-Acessar Conta Juridica"
                + "\n5-Sair");
    }

    public PessoaFisica buscarContaPeloNumero(int numeroConta) {
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getnConta() == numeroConta) {
                return contas[i];
            }
        }
        return null;
    }

    public PessoaFisica buscarContaPeloNome(String nome) {
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getNome().equalsIgnoreCase(nome)) {
                return contas[i];
            }
        }
        return null;
    }
}