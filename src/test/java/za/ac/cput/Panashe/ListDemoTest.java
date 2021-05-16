package za.ac.cput.Panashe;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListDemoTest {
    @Test
    public void ListAdd() {
        List<String> myToDoList = new ArrayList<>();
        Assertions.assertEquals(0, myToDoList.size());
        myToDoList.add("Do ADP3");
        assertEquals(1, myToDoList.size());
        System.out.println("Total tasks added: " + myToDoList.size());
    }

    @Test
    public void ListRemove() {
        List<String> myToDoList = new ArrayList<>();
        myToDoList.add("Study ITS");
        myToDoList.add("Buy more Dogecoin");
        myToDoList.remove(0);
        Assertions.assertEquals(1, myToDoList.size());
        System.out.println("Total tasks removed: " + myToDoList.size());
    }
    @Test
    public void ListFind() {
        List<String> myToDoList = new ArrayList<>();
        myToDoList.add("Study ITS");
        myToDoList.add("Buy more Dogecoin");
        myToDoList.add("Do ADP3");
        assertEquals(3, myToDoList.size());
        System.out.println("index of 'Do ADP3' is: " + myToDoList.indexOf("Do ADP3"));

    }
}
