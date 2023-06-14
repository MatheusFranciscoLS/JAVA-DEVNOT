package IteracaoFor;
import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for(int i=0;i<10;i++){
            System.out.println("o nº da iteração é "+i);
        }
    }
    public void exemplo2() {
        int vetor[]=new int[10];//criando o vetor 10 posiçoes
        //preenchenco o vetor com for
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+i+"]=");
            vetor[i]=sc.nextInt();
        }
        //imprimir o vetor na ordem inversa
        for(int i=9;i>=0;i--){
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }

    public void exemplo3() {
        //Carrinho de Compra
        double carrinhoCompra[]=new double[]{19.90, 35.70, 56.80, 97.50};
        //finalizar a compra
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            //imprimir o valor parcial
            System.out.println("Valor Parcial Compra: R$"
                                +valorFinal);
        }
        //mostrar o valor final da compra
        System.out.println(" o valor da Compra é R$ "
                                +valorFinal);
    }
    public void exemplo4() {
        //ler 4 notas e mostar as 4 notas e a média
        double vetorNotas[]=new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a Nota "+(i+1)+":");
            vetorNotas[i]=sc.nextDouble();
        }
        //imprimir as 4 notas e calcular a média
        double mediaNotas=0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas+=vetorNotas[i];
            System.out.println("A "+(i+1)+"ª Nota é "
                                +vetorNotas[i]);      
        }
        //Imprimir a média
        mediaNotas/=vetorNotas.length;
        System.out.printf("A média do Aluno é %.2f"
        +mediaNotas);
    }

    public void exemplo5() {
        //ler 4 notas de 10 alunos
        // vetor guardar as médias
        double vetorMedia[]=new double[3];
        //preencher o vetor de médias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas=0;
            for(int j=0;j<4;j++){
                System.out.print("Nota "+(j+1)+ " Aluno "+(i+1)+":");
                notas+=sc.nextDouble();
            }
            notas/=4;//calcula a média
            vetorMedia[i]=notas; //coloca a média no vetor
        }
        //imprimir notas >=7 do vetor Médias
        for (int i = 0; i < vetorMedia.length; i++) {
            if(vetorMedia[i]>=7){
                System.out.println("A média do Aluno "
                            +(i+1)+" é "+vetorMedia[i] );
            }
        }
    }
}
