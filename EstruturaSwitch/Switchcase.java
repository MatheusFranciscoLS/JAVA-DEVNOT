package EstruturaSwitch;

import java.util.Scanner;

public class Switchcase {
    Scanner sc = new Scanner(System.in);

    public void letras() {
        System.out.println("Escreva uma letra");
        String letra = sc.nextLine();

        switch (letra) {
            case "a":
                System.out.println("Vogal");
                break;
            case "e":
                System.out.println("Vogal");
                break;
            case "i":
                System.out.println("Vogal");
                break;
            case "o":
                System.out.println("Vogal");
                break;
            case "u":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }
    }

    public void mes() {
        System.out.println("Informe um nº de 1 a 12 Ref. meses do ano");
        int mes = sc.nextInt();
        

        switch (mes) {
            case 1:
                System.out.println("O " + mes + "º mes é janeiro");
                break;
            case 2:
                System.out.println("O " + mes + "º mes é fevereiro");
                break;
            case 3:
                System.out.println("O " + mes + "º mes é março");
                break;
            case 4:
                System.out.println("O " + mes + "º mes é abril");
                break;
            case 5:
                System.out.println("O " + mes + "º mes é maio");
                break;
            case 6:
                System.out.println("O " + mes + "º mes é junho");
                break;
            case 7:
                System.out.println("O " + mes + "º mes é julho");
                break;
            case 8:
                System.out.println("O " + mes + "º mes é agosto");
                break;
            case 9:
                System.out.println("O " + mes + "º mes é setembro");
                break;
            case 10:
                System.out.println("O " + mes + "º mes é outubro");
                break;
            case 11:
                System.out.println("O " + mes + "º mes é novembro");
                break;
            case 12:
                System.out.println("O " + mes + "º mes é dezembro");
                break;
            default:
                System.out.println("Coloque um numero válido !");
                break;
        }

    }
}