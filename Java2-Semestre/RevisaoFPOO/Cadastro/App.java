package RevisaoFPOO.Cadastro;

import javax.swing.JOptionPane;
import RevisaoFPOO.Agenda.Agenda;

public class App {
    public static void main(String[] args) {
        // cria o cadastro(armaze nar no vetor)
        Gato gatos[] = new Gato[10];
        Cachorro cachorros[] = new Cachorro[10];
        OutrosAnimais outros[] = new OutrosAnimais[10];
        Agenda agendas[] = new Agenda[100];
        // contadores -
        int contGatos = 0, contCachorros = 0, contOutros = 0, contAgenda = 0;

        // criar a minha aplicação
        JOptionPane.showMessageDialog(null, "Bem-Vindo ao Consultório\n do Dr. Frankstein");
        boolean aberto = true;
        while (aberto) {
            int acao1 = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastro\n 2-Consulta\n 3-Sair"));
            if (acao1 == 1) {// cadastro
                int acao2 = Integer.parseInt(JOptionPane.showInputDialog("1-Gato\n 2-Cachorro\n 3-Outro Animal"));
                if (acao2 == 1) {// cadastro dos gato
                    // criar um objeto
                    gatos[contGatos] = new Gato();// utilizei o construtor
                    // setar os valores do cadastro
                    gatos[contGatos].setNome(JOptionPane.showInputDialog("Informe o Nome do PET"));
                    gatos[contGatos].setraca(JOptionPane.showInputDialog("Informe a Raça do PET"));
                    gatos[contGatos].setProprietario(JOptionPane.showInputDialog("Informe o Nome do Proprietario"));
                    gatos[contGatos].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do PET")));
                    // contador +1
                    contGatos++;
                } else if (acao2 == 2) {// cadastro do cachorro
                    // criar um objeto
                    cachorros[contCachorros] = new Cachorro();// utilizei o construtor
                    // setar os valores do cadastro
                    cachorros[contCachorros].setNome(JOptionPane.showInputDialog("Informe o Nome do PET"));
                    cachorros[contCachorros].setraca(JOptionPane.showInputDialog("Informe a Raça do PET"));
                    cachorros[contCachorros]
                            .setProprietario(JOptionPane.showInputDialog("Informe o Nome do Proprietario"));
                    cachorros[contCachorros]
                            .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do PET")));
                    // contador +1
                    contCachorros++;
                } else if (acao2 == 3) {// Cadastro de outros Tipos de PET
                    // criar um objeto
                    outros[contOutros] = new OutrosAnimais();// utilizei o construtor
                    // setar os valores do cadastro
                    outros[contOutros].setNome(JOptionPane.showInputDialog("Informe o Nome do PET"));
                    outros[contOutros].setraca(JOptionPane.showInputDialog("Informe a Raça do PET"));
                    outros[contOutros]
                            .setProprietario(JOptionPane.showInputDialog("Informe o Nome do Proprietario"));
                    outros[contOutros]
                            .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o Peso do PET")));
                    // contador +1
                    contCachorros++;
                }
            } else if (acao1 == 2) {// agendar consulta
                // 1ª verificação - cadastro no nome
                boolean cadastroOK = false;
                String nomeAgenda = JOptionPane.showInputDialog("Informe o nome do PET");
                for (int i = 0; i < contGatos; i++) { // busca no vetor de gatos
                    if (gatos[i].getNome().equals(nomeAgenda)) {
                        // mensagem de confirmação
                        JOptionPane.showMessageDialog(null, "PET encontrado");
                        cadastroOK = true;
                        break;
                    }
                }
                for (int i = 0; i < contCachorros; i++) { // busca no vetor de cachorro
                    if (cachorros[i].getNome().equals(nomeAgenda)) {
                        // mensagem de confirmação
                        JOptionPane.showMessageDialog(null, "PET encontrado");
                        cadastroOK = true;
                        break;
                    }
                }
                for (int i = 0; i < contOutros; i++) { // busca no vetor de outros
                    if (outros[i].getNome().equals(nomeAgenda)) {
                        // mensagem de confirmação
                        JOptionPane.showMessageDialog(null, "PET encontrado");
                        cadastroOK = true;
                        break;
                    }
                }

                // 2ª terminar cadastro
                if (cadastroOK) {
                    boolean agendar = true;
                    while (agendar) {
                        String dataAgenda = JOptionPane.showInputDialog("Informe a Data do Agendamento");
                        String horaAgenda = JOptionPane.showInputDialog("Informe a Hora do Agendamento");
                        if (contAgenda == 0) {
                            agendas[contAgenda] = new Agenda();
                            agendas[contAgenda].setData(dataAgenda);
                            agendas[contAgenda].setHora(dataAgenda);
                            agendar = false;
                        } else {
                            for (int i = 0; i < contAgenda; i++) {
                                if (agendas[i].getDataHora().equals(dataAgenda + horaAgenda)) {
                                    break;
                                } else {
                                    agendas[contAgenda] = new Agenda();
                                    agendas[contAgenda].setData(dataAgenda);
                                    agendas[contAgenda].setHora(dataAgenda);
                                    agendar = false;
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
