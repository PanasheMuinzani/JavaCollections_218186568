package za.ac.cput.Panashe;
import java.util.Collection;
import java.util.HashSet;

//Panashe Muinzani_218186568
// 14 May 2021
//Java Collection classes

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> collection = new HashSet<>();
        collection.add("RNB");
        collection.add("Gospel");
        collection.add("Hip-Hop");
        collection.remove("RNB");
        System.out.println("Collection= " + collection);
        boolean output = collection.contains("Gospel");
        if (output)
            System.out.println("The Collection contains the name Gospel ");
        else
            System.out.println("The Collection does not contain the name Gospel");
    }
}
