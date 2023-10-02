package ArrayList;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitaisCidades = new HashMap<>();
        capitaisCidades.put("SP", "São Paulo");
        capitaisCidades.put("RJ", "Rio de Janeiro");
        capitaisCidades.put("MG", "Belo Horizonte");
        capitaisCidades.put("ES", "Vitória");
        // Imprime o valor correspondente a chave
        System.out.println(capitaisCidades.get("ES"));
        // Imprime chave e valor
        System.out.println(capitaisCidades);
        // Imprime somente chaves
        System.out.println(capitaisCidades.keySet());
        // Imprime somente valores
        for (String i : capitaisCidades.keySet()) {
            System.out.println(capitaisCidades.get(i));
        }
    }
}
