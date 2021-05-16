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
        Assertions.assertEquals(1, myToDoList.size());
    }

    @Test
    public void ListRemove() {
        List<String> myToDoList = new ArrayList<>();
        myToDoList.add("Study ITS");
        myToDoList.add("Buy more Dogecoin");
        myToDoList.remove(0);
        Assertions.assertEquals(1, myToDoList.size());
    }

}