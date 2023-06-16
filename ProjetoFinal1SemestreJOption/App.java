package ProjetoFinal1SemestreJOption;

import javax.swing.JOptionPane;

import ProjetoFinal1SemestreJOption.Conta.ContaPF;
import ProjetoFinal1SemestreJOption.Conta.ContaPJ;

public class App {
    public static void main(String[] args) {

        ContaPF contasPF[] = new ContaPF[10];
        ContaPJ contasPJ[] = new ContaPJ[10];

        boolean aberta = true;
        int contPF = 0;
        int contPJ = 0;

        while (aberta) {
            int acao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Escolha a ação desejada"
                                    + "\n 1 - Abrir conta"
                                    + "\n 2 - Acessar conta"
                                    + "\n 3 - Sair"));
            if (acao == 1) {
                boolean criarContas = true;
                while (criarContas) {
                    int acaoContas = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Escolha qual tipo de conta deseja criar"
                                            + "\n 1 - Abrir conta PF"
                                            + "\n 2 - Abrir conta PJ"
                                            + "\n 3 - Voltar ao menu principal"));

                    if (acaoContas == 1) {
                        contasPF[contPF] = new ContaPF();
                        contasPF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                        contasPF[contPF].setnCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                        contasPF[contPF]
                                .setSalario(Integer.parseInt(JOptionPane.showInputDialog("Informe seu salário:")));
                        contasPF[contPF].setSaldo(0);
                        contasPF[contPF].setnConta(1000 + contPF);
                        JOptionPane.showMessageDialog(null,
                                "Conta criada com Sucesso!"
                                        + "\n Nome: " + contasPF[contPF].getNome()
                                        + "\n CPF: " + contasPF[contPF].getnCpf()
                                        + "\n Saldo: " + contasPF[contPF].getSaldo()
                                        + "\n Conta: " + contasPF[contPF].getnConta());
                        contPF++;
                        criarContas = false;
                    } else if (acaoContas == 2) {
                        contasPJ[contPJ] = new ContaPJ();
                        contasPJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                        contasPJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ:"));
                        contasPJ[contPJ].setFaturamento(
                                Integer.parseInt(JOptionPane.showInputDialog("Informe o faturamento:")));
                        contasPJ[contPJ].setSaldo(0);
                        contasPJ[contPJ].setnConta(2000 + contPJ);
                        JOptionPane.showMessageDialog(null,
                                "Conta criada com Sucesso!"
                                        + "\n Nome: " + contasPJ[contPJ].getNome()
                                        + "\n CNPJ: " + contasPJ[contPJ].getnCnpj()
                                        + "\n Saldo: " + contasPJ[contPJ].getSaldo()
                                        + "\n Conta: " + contasPJ[contPJ].getnConta());
                        contPJ++;
                        criarContas = false;
                    } else if (acaoContas == 3) {
                        criarContas = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                    }
                }
            } else if (acao == 2) {
                boolean acessarContas = true;
                while (acessarContas) {
                    int acaoAcessar = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Escolha qual tipo de conta deseja acessar"
                                            + "\n 1 - Conta PF"
                                            + "\n 2 - Conta PJ"
                                            + "\n 3 - Voltar ao menu principal"));
                    if (acaoAcessar == 1) {
                        int nContaBuscaPF = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                        int i = 0;
                        if (nContaBuscaPF - 1000 >= 0 && nContaBuscaPF - 1000 <= contPF - 1) {
                            for (i = 0; i < contasPF.length; i++) {
                                if (nContaBuscaPF == contasPF[i].getnConta()) {
                                    JOptionPane.showMessageDialog(null, "Conta Encontrada!");
                                    break;
                                }
                            }
                            boolean acessarPF = true;
                            while (acessarPF) {
                                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                        + "\n 1 - Verificar saldo."
                                        + "\n 2 - Saque."
                                        + "\n 3 - Depósito."
                                        + "\n 4 - Empréstimo."
                                        + "\n 5 - Sair da conta."));
                                if (acao2 == 1) {
                                    JOptionPane.showMessageDialog(null, "Saldo: " + contasPF[i].getSaldo());
                                } else if (acao2 == 2) {
                                    contasPF[i].saque();
                                } else if (acao2 == 3) {
                                    contasPF[i].deposito();
                                } else if (acao2 == 4) {
                                    contasPF[i].emprestimoPF();
                                } else if (acao2 == 5) {
                                    acessarPF = false;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Conta não encontrada.");
                        }
                    } else if (acaoAcessar == 2) {
                        int nContaBuscaPJ = Integer
                                .parseInt(JOptionPane.showInputDialog("Informe o nº da conta buscada:"));
                        int i = 0;
                        if (nContaBuscaPJ - 2000 >= 0 && nContaBuscaPJ - 2000 <= contPF - 1) {
                            for (i = 0; i < contasPJ.length; i++) {
                                if (nContaBuscaPJ == contasPJ[i].getnConta()) {
                                    JOptionPane.showMessageDialog(null, "Conta Encontrada!");
                                    break;
                                }
                            }
                            boolean acessarPJ = true;
                            while (acessarPJ) {
                                int acao3 = Integer.parseInt(JOptionPane.showInputDialog("Ação desejada:"
                                        + "\n 1 - Verificar saldo."
                                        + "\n 2 - Saque."
                                        + "\n 3 - Depósito."
                                        + "\n 4 - Empréstimo."
                                        + "\n 5 - Sair da conta."));
                                if (acao3 == 1) {
                                    JOptionPane.showMessageDialog(null, "Saldo: " + contasPJ[i].getSaldo());
                                } else if (acao3 == 2) {
                                    contasPJ[i].saque();
                                } else if (acao3 == 3) {
                                    contasPJ[i].deposito();
                                } else if (acao3 == 4) {
                                    contasPJ[i].emprestimoPJ();
                                } else if (acao3 == 5) {
                                    acessarPJ = false;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Conta não encontrada.");
                        }
                    } else if (acaoAcessar == 3) {
                        acessarContas = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
                    }
                }
            } else if (acao == 3) {
                JOptionPane.showMessageDialog(null, "Operação Finalizada!");
                aberta = false;
            } else {
                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
            }

        }
    }

}
