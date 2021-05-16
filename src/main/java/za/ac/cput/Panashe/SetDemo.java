package za.ac.cput.Panashe;
//Panashe Muinzani_218186568
// 14 May 2021
//Java Collection classes
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> value = new HashSet<>();

        value.add(7);
        value.add(3);
        value.add(22);
        value.add(30);
        value.remove(22);

        for (int i : value) {
            System.out.println(i);
        }
    }
}
