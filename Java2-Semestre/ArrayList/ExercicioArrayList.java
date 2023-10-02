package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ExercicioArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº")));
        }
        Collections.sort(num);
        for (Integer integer : num) {
            System.out.println(integer);
        }
        System.out.println("");
        Collections.reverse(num);
        for (Integer integer : num) {
            System.out.println(integer);
        }
    }
}
