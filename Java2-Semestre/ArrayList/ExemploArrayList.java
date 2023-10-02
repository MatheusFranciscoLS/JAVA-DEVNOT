package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        // criando a Arraylista de String com obj de nome carros
        ArrayList<String> carros = new ArrayList<String>();// ArrayList
        List carros1 = new ArrayList<>();// coleção
        // Adicionando elementos na coleção(ArrayList)
        carros.add("Uno");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");
        // Iterando com o laço For
        for (int i = 0; i < carros.size(); i++) {
            System.out.println((i));
        }
        // Ordenar uma lista (sort - collections)
        Collections.sort(carros);
        // Inverte a lista (utilizar o sort primeiro)
        Collections.reverse(carros);
        // Iterando com For-each
        for (String i : carros) {
            System.out.println(i);
        }
        // carros.clear();// apaga o ArrayList
        // Imprimindo a coleção
        System.out.println(carros);
    }
}