package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> flores = new LinkedList<>();
        flores.add("Rosas");
        flores.add("Margarida");
        flores.addFirst("Begônias");
        flores.addLast("Cravos");
        System.out.println(flores.getFirst());
        System.out.println(flores.getLast());
    }
}
