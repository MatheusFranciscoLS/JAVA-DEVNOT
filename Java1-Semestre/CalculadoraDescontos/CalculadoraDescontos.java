package CalculadoraDescontos;

import java.util.Scanner;

public class CalculadoraDescontos {
    Scanner sc = new Scanner(System.in);

    public void calcular20() {
        System.out.println("Qual seria o valor do produto?");
        double precoProduto = sc.nextDouble();
        final int desconto20 = 20; // final não pode ser alterado
        double precoDesconto = precoProduto - (precoProduto * desconto20 / 100);
        System.out.println("Será aplicado desconto de 20%");
        System.out.println("O preço com desconto é " + precoDesconto + "reais");
    }

    public void calcular30() {
        System.out.println("Qual seria o valor do produto?");
        double precoProduto = sc.nextDouble();
        final int desconto30 = 30; // final não pode ser alterado
        double precoDesconto = precoProduto - (precoProduto * desconto30 / 100);
        System.out.println("Será aplicado desconto de 30%");
        System.out.println("O preço com desconto é " + precoDesconto + "reais");
    }
}
