package ExercicioemDupla;

import java.util.Scanner;

public class CalculoViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço do litro da gasolina ?");
        int gasolinaLitro = sc.nextInt();

        System.out.println("Quantos km seu carro faz por litro?");
        int kmLitro = sc.nextInt();

        System.out.println("Qual seria a distancia percorrida?");
        int kmPercorrido = sc.nextInt();

        float kmViagem = kmPercorrido / kmLitro;
        float custoViagem = kmViagem * gasolinaLitro;

        System.out.println("Seu carro irá gastar " + kmViagem + " litros durante a viagem");
        System.out.println("O custo da sua viagem será de R$" + custoViagem + " reais.");
        sc.close();
    }
}
