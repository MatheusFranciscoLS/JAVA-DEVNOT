package ProjetoFinal1SemestreJOption.Conta;

import javax.swing.JOptionPane;

public class ContaPF extends Conta {

    String nCpf;
    int salario;

    public String getnCpf() {
        return nCpf;
    }

    public void setnCpf(String nCpf) {
        this.nCpf = nCpf;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void emprestimoPF() {
        if (salario <= 1500) {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$2.500 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 2500) {
                JOptionPane.showMessageDialog(null, "Quantidade solicitada está acima do valor liberado.");
            } else {
                saldo += emprestimo;
                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!"
                        + "\n Valor solicitado: R$" + emprestimo
                        + "\n Saldo após empréstimo: R$" + saldo);
            }
        } else if (salario <= 3000) {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$5.000 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 5000) {
                JOptionPane.showMessageDialog(null, "Quantidade solicitada está acima do valor liberado.");
            } else {
                saldo += emprestimo;
                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!"
                        + "\n Valor solicitado: R$" + emprestimo
                        + "\n Saldo após empréstimo: R$" + saldo);
            }
        } else if (salario <= 6000) {
            int emprestimo = Integer
                    .parseInt(JOptionPane.showInputDialog(
                            "Disponivel até R$10.000 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 10000) {
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
                            "Disponivel até R$20.000 para empréstimo \n Digite a quantidade solicitada."));
            if (emprestimo > 20000) {
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
