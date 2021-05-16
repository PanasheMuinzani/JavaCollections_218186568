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
    public void CollectionAddTest() {
        Collection<String> collection = new LinkedList<>();
        Assertions.assertEquals(0, collection.size());
        collection.add("Panashe");
        Assertions.assertEquals(1, collection.size());
    }

    @Test
    public void CollectionRemoveTest() {
        Collection<String> collection = new LinkedList<>();
        collection.add("Panashe");
        collection.add("Sharon");
        Assertions.assertEquals(2, collection.size());
        collection.remove("Panashe");
        Assertions.assertEquals(1, collection.size());
    }
}

