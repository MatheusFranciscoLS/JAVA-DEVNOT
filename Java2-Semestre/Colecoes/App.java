package Colecoes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Cadastrar novo carro
        // Consultar carro
        // Excluir carro da minha lista
        List<Carros> listaCarros = new ArrayList<>();
        boolean aberto = true;
        JOptionPane.showMessageDialog(null, "Seja Bem Vindo !");
        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe a ação desejada.\n1- Cadastrar Carro\n2- Listar Carro\n3- Consultar Carro\n4- Excluir Carro\n5- Sair"));
            if (acao == 1) {
                Carros carro = new Carros(JOptionPane.showInputDialog("Digite a Marca do carro"),
                        JOptionPane.showInputDialog("Digite o Modelo do carro"),
                        JOptionPane.showInputDialog("Digite o Ano do carro"),
                        JOptionPane.showInputDialog("Digite a Cor do carro"));
                listaCarros.add(carro);
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
            } else if (acao == 2) {
                String listar = "";
                for (Carros carros : listaCarros) {
                    listar += carros.imprimirLN();
                }
                JOptionPane.showMessageDialog(null, listar);
            } else if (acao == 3) {
                String listar = "";
                int i = 0;
                for (Carros carros : listaCarros) {
                    listar += i +" "+ carros.imprimirLN();
                    i++;
                }
                int acao2 = Integer
                        .parseInt(JOptionPane.showInputDialog("Escolha o Carro Para Consultar:\n " + listar));
                listaCarros.get(acao2).imprimir();
            } else if (acao == 4) {
                String listar = "";
                int i = 0;
                for (Carros carros : listaCarros) {
                    listar += i +" "+ carros.imprimirLN();
                    i++;
                }
                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Carro Para Excluir:\n " + listar));
                listaCarros.remove(acao2).imprimir();
            } else if (acao == 5) {
                JOptionPane.showMessageDialog(null, "Você saiu com sucesso");
                aberto = false;
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma Opção valida");
            }
        }
    }
}
