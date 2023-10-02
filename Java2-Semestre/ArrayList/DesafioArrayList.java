package ArrayList;

import java.util.HashMap;

public class DesafioArrayList {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoa = new HashMap<>();

        pessoa.put("Matheus", 23);
        pessoa.put("João", 20);
        pessoa.put("Jose", 18);

        System.out.println(pessoa.get("Matheus"));

        System.out.println(pessoa);

        System.out.println(pessoa.keySet());
        
        for (String i : pessoa.keySet()) {
            System.out.println(pessoa.get(i));
        }
    }
}
