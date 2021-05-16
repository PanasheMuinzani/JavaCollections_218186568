package za.ac.cput.Panashe;
//Panashe Muinzani_218186568
// 14 May 2021
//Java Collection classes

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;

public class SetDemoTest {
    @Test
    public void SetAdd() {
        Set<Integer> value = new HashSet<>();
        Assertions.assertEquals(0, value.size());
        value.add(7);
        Assertions.assertEquals(1, value.size());
        System.out.println("value added: " +value.size());
    }
    @Test
    public void SetRemove ()
    {
        Set<Integer> value = new HashSet<>();
        value.add(7);
        value.add(22);
        Assertions.assertEquals(2, value.size());
        value.remove(7);
        Assertions.assertEquals(1, value.size());
        System.out.println("value removed: " +value.size());

    }
    @Test
    public void SetFind() {

        Set<Integer> value = new HashSet<>();
        value.add(22);
        value.add(7);
        if (!value.contains(22)) {
        }
        assertEquals(2, value.size());
        System.out.println("Contains 22");
    }

}

