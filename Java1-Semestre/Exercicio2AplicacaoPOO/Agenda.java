package Exercicio2AplicacaoPOO;

import javax.swing.JOptionPane;

public class Agenda {
    //atributos
    String nome;
    int idade;
    double altura;
    //métodos
    //construtor com parâmetros(valores atriobuidos na construção)
    public Agenda(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    //construtor vazio
    public Agenda() {
    }
    //set and get
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //métodos definidos pelo programador
    //imprimir
    public void imprimir() {
        JOptionPane.showMessageDialog(null,
        "Nome: "+nome
        +"\nIdade: "+idade
        +"\nAltura: "+altura);
    }
    
    
}