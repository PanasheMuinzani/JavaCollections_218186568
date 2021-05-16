package za.ac.cput.Panashe;
//Panashe Muinzani_218186568
// 14 May 2021
//Java Collection classes

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.LinkedList;

class CollectionDemoTest {
    @Test
    public void CollectionAdd() {
        Collection<String> collection = new LinkedList<>();
        Assertions.assertEquals(0, collection.size());
        collection.add("RNB");
        collection.add("Hip-Hop");
        Assertions.assertEquals(2, collection.size());
        System.out.println("Total Genre's added: " +collection.size());
    }

    @Test
    public void CollectionRemove() {
        Collection<String> collection = new LinkedList<>();
        collection.add("Gospel");
        collection.add("Hip-Hop");
        Assertions.assertEquals(2, collection.size());
        collection.remove("Gospel");
        Assertions.assertEquals(1, collection.size());
        System.out.println("Total Genre's removed: " +collection.size());
    }

    @Test
    void CollectionFind(){
        Collection<String> collection = new LinkedList<>();
        collection.add("Hip-Hop");
        collection.add("Gospel");
        if(collection.contains("Gospel")){
            System.out.println("Contains Gospel");
        }
        assertEquals(2, collection.size());
    }
}


