package za.ac.cput.Panashe;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

   public class ListCollectionTest {
       @Test
       public void ListCollectionAddTest() {
           List<String> myToDoList = new ArrayList<>();
           Assertions.assertEquals(0, myToDoList.size());
           myToDoList.add("Do ADP3");
           Assertions.assertEquals(1, myToDoList.size());
       }
   }