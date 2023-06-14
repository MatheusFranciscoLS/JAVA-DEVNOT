package ProjetoFinal1Semestre.Tipo;

import java.util.Scanner;

public class PessoaJuridica extends Banco {
    Scanner sc = new Scanner(System.in);
    private final int maxConta = 100;
    private PessoaJuridica[] contas = new PessoaJuridica[maxConta];
    private int numContas = 0;

    public double cnpj;

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public void criarContaJuridica() {
        PessoaJuridica contaPessoaJuridica = new PessoaJuridica();
        System.out.println("Informe o nome da Corporação");
        contaPessoaJuridica.setNome(sc.next());
        System.out.println("Informe seu CNPJ (somente números)");
        contaPessoaJuridica.setCnpj(sc.nextDouble());
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