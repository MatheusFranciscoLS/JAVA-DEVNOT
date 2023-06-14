package ProjetoFinalTeste;

import java.util.Scanner;

import javax.swing.JOptionPane;

import ProjetoFinalTeste.Contas.ContaPF;
import ProjetoFinalTeste.Contas.ContaPJ;

public class App {

    public static void main(String[] args) {
        // criar o meu vetor de objetos
        Scanner sc = new Scanner(System.in);
        ContaPJ contasPJ[] = new ContaPJ[10];
        ContaPF contasPF[] = new ContaPF[10];
        // começar meu banco
        boolean aberto = true;
        int contPJ = 0;// contador de contas abertas
        int contPF = 0;
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação Desejada:"
                    + "\n 1-Abrir Conta PJ"
                    + "\n 2-Abrir Conta PF"
                    + "\n 3-Acessar Conta PJ"
                    + "\n 4-Acessar Conta PF"
                    + "\n 5-Sair"));
            if (acao == 1) {// abrir a conta
                // criar um objeto
                contasPJ[contPJ] = new ContaPJ();// chamei o construtor
                // preencher os atributos do objeto
                contasPJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome da Empresa:"));
                contasPJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa:"));
                contasPJ[contPJ].setnConta(2000 + contPJ);
                contasPJ[contPJ].setSaldo(0);
                // acrescimo no contador
                JOptionPane.showMessageDialog(null,
                        "Conta Criada com Sucesso " + "Seu numero da conta é " + contasPJ[contPJ].getnConta());
                contPJ++;
            } else if (acao == 2) {
                contasPF[contPF] = new ContaPF();// objeto criado
                // preencher as informações da conta
                contasPF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                contasPF[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                contasPF[contPF].setSaldo(0);
                contasPF[contPF].setnConta(1000 + contPF);
                JOptionPane.showMessageDialog(null,
                        "Conta Criada com Sucesso " + "Seu numero da conta é " + contasPF[contPF].getnConta());
                contPF++;
            } else if (acao == 3) { // acessar uma conta já criada
                // localizar a conta no vetor
                int i;// contador
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta buscada"));
                for (i = 0; i < contasPJ.length; i++) {
                    if (nContaBuscada == contasPJ[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        break;
                    }
                }
                boolean acesso = true;
                while (acesso) { // acessei a conta
                    int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação Desejada:"
                            + "\n1-Verificar Saldo"
                            + "\n2-Sacar"
                            + "\n3-Depositar"
                            + "\n4-Pedir Empréstimo"
                            + "\n5-Sair da Conta"));
                    if (acao2 == 1) {// saldo
                        JOptionPane.showMessageDialog(null, "Seu Saldo é de R$ " + contasPJ[i].getSaldo());
                    } else if (acao2 == 2) {
                        JOptionPane.showMessageDialog(null, "Seu Saldo é de R$ " + contasPJ[i].getSaldo());
                        if (contasPJ[i].getSaldo() < 0) {
                            JOptionPane.showMessageDialog(null, "Voce não tem valor para sacar");
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Você deseja sacar algum valor?");
                            boolean saque = true;
                            while (saque) { // acessei a conta
                                int acao3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação Desejada:"
                                        + "\n1-Sim"
                                        + "\n2-Não"));
                                if (acao3 == 1) {
                                    double sacar = 0;
                                    double valor = 0;
                                    sacar = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
                                    valor = contasPJ[i].getSaldo() - sacar;
                                    JOptionPane.showMessageDialog(null,
                                            "Está sendo retirado um valor de: " + sacar);
                                    JOptionPane.showMessageDialog(null, "Você agora tem um saldo de " + valor);
                                    break;
                                } else if (acao3 == 2) {
                                    JOptionPane.showMessageDialog(null, "Vamos voltar a menu");
                                    break;
                                }
                            }
                        }
                    } else if (acao2 == 3) {
                        JOptionPane.showMessageDialog(null, "Seu Saldo é atual é R$ " + contasPJ[i].getSaldo());
                        JOptionPane.showMessageDialog(null, "Você deseja depositar algum valor?");
                        boolean deposito = true;
                        while (deposito) { // acessei a conta
                            int acao4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação Desejada:"
                                    + "\n1-Sim"
                                    + "\n2-Não"));
                            if (acao4 == 1) {
                                double depositar = 0;
                                double valor = 0;
                                depositar = Double
                                        .parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
                                valor = contasPJ[i].getSaldo() + depositar;
                                JOptionPane.showMessageDialog(null, "Está sendo depositado um valor de: " + depositar);
                                JOptionPane.showMessageDialog(null, "Você agora tem um saldo de " + valor);
                                break;
                            } else if (acao4 == 2) {
                                JOptionPane.showMessageDialog(null, "Vamos voltar a menu");
                                break;
                            }
                        }
                    } else if (acao2 == 4) {
                        JOptionPane.showMessageDialog(null, "Seu Saldo é atual é R$ " + contasPJ[i].getSaldo());
                        JOptionPane.showMessageDialog(null, "Você deseja pedir emprestimo de qual valor algum valor?");
                        boolean emprestimo = true;
                        while (emprestimo) { // acessei a conta
                            int acao4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a ação Desejada:"
                                    + "\n1-Sim"
                                    + "\n2-Não"));
                            if (acao4 == 1) {
                                double emprestar = 0;
                                double valor = 0;
                                emprestar = Double
                                        .parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
                                valor = contasPJ[i].getSaldo() + emprestar;
                                JOptionPane.showMessageDialog(null, "Está sendo emprestado um valor de: " + emprestar);
                                JOptionPane.showMessageDialog(null, "Você agora tem um saldo de " + valor);
                                break;
                            }
                        }
                    }
                }
                break;
            } else if (acao == 4) {
                int i;// contador
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta buscada"));
                for (i = 0; i < contasPF.length; i++) {
                    if (nContaBuscada == contasPF[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Conta Encontrada");
                        break;
                    }
                }
            } else if (acao == 5) {
                JOptionPane.showMessageDialog(null, "Você saiu do banco");
                aberto = false;
                break;
            }
            // menu de acesso da conta

        }
    }
}