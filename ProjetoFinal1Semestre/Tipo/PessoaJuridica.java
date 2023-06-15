package ProjetoFinal1Semestre.Tipo;

import java.util.Scanner;

public class PessoaJuridica extends Banco {
    Scanner sc = new Scanner(System.in);
    int maxConta = 100;
    PessoaJuridica[] contas = new PessoaJuridica[maxConta];
    int numContas = 0;

    double cnpj;

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public void criarContaJuridica() {
        PessoaJuridica contaPessoaJuridica = new PessoaJuridica();
        System.out.println("Informe o Nome da Empresa");
        contaPessoaJuridica.setNome(sc.next());
        System.out.println("Informe seu CNPJ (somente números)");
        contaPessoaJuridica.setCnpj(sc.nextDouble());
        System.out.println("Informe seu Faturamento (somente números)");
        contaPessoaJuridica.setFaturamento(sc.nextDouble());
        System.out.println("Informe o numero que deseja para sua conta");
        contaPessoaJuridica.setnConta(sc.nextInt());
        System.out.println("============================================");
        System.out.println("Cadastro Realizado com Sucesso");
        System.out.println("========================================");
        contas[numContas] = contaPessoaJuridica;
        numContas++;

        System.out.println("Informe a ação Desejada:"
                + "\n1-Criar Conta Fisica"
                + "\n2-Criar Conta Juridica"
                + "\n3-Acessar Conta Fisica"
                + "\n4-Acessar Conta Juridica"
                + "\n5-Sair");
    }

    public PessoaJuridica buscarContaPeloNumero(int numeroConta) {
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getnConta() == numeroConta) {
                return contas[i];
            }
        }
        return null;
    }

    public PessoaJuridica buscarContaPeloNome(String nome) {
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getNome().equalsIgnoreCase(nome)) {
                return contas[i];
            }
        }
        return null;
    }
}