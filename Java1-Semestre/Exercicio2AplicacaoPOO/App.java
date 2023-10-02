package Exercicio2AplicacaoPOO;

import java.util.Random;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) {
        Random rd = new Random();
    //criar um vetor de 10 objetos
    Agenda contatos[] = new Agenda[10];
    //criar os objetos e preencher os atributos
    for (int i = 0; i < contatos.length; i++) {
        //criar o objeto
        contatos[i] = new Agenda();
        //preencher os atributos
        contatos[i].setNome(JOptionPane.showInputDialog("Nome:"));
        contatos[i].setIdade(i+18);
        contatos[i].setAltura(1.82);
    }
    //procurar uma pessoa no vetor
    String nomeBuscado = JOptionPane.showInputDialog(
        "Digite um nome para buscar na agenda");
    boolean procurar = true;
    int cont=0;
    while(procurar){
        if(nomeBuscado.equals(contatos[cont].getNome())){
            procurar = false;
            contatos[cont].imprimir();
        }
        cont++;
    }
    }
}