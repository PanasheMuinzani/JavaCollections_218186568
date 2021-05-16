package za.ac.cput.Panashe;
import java.util.Collection;
import java.util.HashSet;


//Panashe Muinzani_218186568
// 14 May 2021
//Java Collection classes

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> collection = new HashSet<>();
        collection.add("Panashe");
        collection.add("Sharon");
        collection.add("Muinzani");
        collection.remove("Muinzani");
        System.out.println("Collection= " + collection);
        boolean output = collection.contains("Sharon");
        if (output)
            System.out.println("The Collection contains the name Sharon ");
        else
            System.out.println("The Collection does not contain the name Sharon");
    }
}
