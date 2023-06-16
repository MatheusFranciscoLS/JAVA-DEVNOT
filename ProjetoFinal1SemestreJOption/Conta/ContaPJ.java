package ProjetoFinal1SemestreJOption.Conta;

import javax.swing.JOptionPane;

public class ContaPJ extends Conta {

    String nCnpj;
    int faturamento;

    public String getnCnpj() {
        return nCnpj;
    }

    public void setnCnpj(String nCnpj) {
        this.nCnpj = nCnpj;
    }

    public int getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(int faturamento) {
        this.faturamento = faturamento;
    }

    public void emprestimoPJ() {
        if (faturamento <= 15000) {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$25.000 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 25000) {
                JOptionPane.showMessageDialog(null, "Quantidade solicitada está acima do valor liberado.");
            } else {
                saldo += emprestimo;
                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!"
                        + "\n Valor solicitado: R$" + emprestimo
                        + "\n Saldo após empréstimo: R$" + saldo);
            }
        } else if (faturamento <= 30000) {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$50.000 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 50000) {
                JOptionPane.showMessageDialog(null, "Quantidade solicitada está acima do valor liberado.");
            } else {
                saldo += emprestimo;
                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!"
                        + "\n Valor solicitado: R$" + emprestimo
                        + "\n Saldo após empréstimo: R$" + saldo);
            }
        } else if (faturamento <= 60000) {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$100.000 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 100000) {
                JOptionPane.showMessageDialog(null, "Quantidade solicitada está acima do valor liberado.");
            } else {
                saldo += emprestimo;
                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!"
                        + "\n Valor solicitado: R$" + emprestimo
                        + "\n Saldo após empréstimo: R$" + saldo);
            }
        } else {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$200.000 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 200000) {
                JOptionPane.showMessageDialog(null, "Quantidade solicitada está acima do valor liberado.");
            } else {
                saldo += emprestimo;
                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!"
                        + "\n Valor solicitado: R$" + emprestimo
                        + "\n Saldo após empréstimo: R$" + saldo);
            }
        }

    }

}
