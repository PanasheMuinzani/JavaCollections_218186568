package za.ac.cput.Panashe;
//Panashe Muinzani_218186568
// 14 May 2021
//Java Collection classes

import java.util.ArrayList;
import java.util.List;


public class ListCollection {
    public static void main(String[] args) {

        List<String> myToDoList = new ArrayList<String>();
        myToDoList.add("Do ADP3");
        myToDoList.add("Study ITS");
        myToDoList.add("Buy more Dogecoin");
        myToDoList.add("Research Birthday Venues");
        myToDoList.remove(0);
        for (String eachItemInList: myToDoList)
        System.out.println(eachItemInList);
        boolean output = myToDoList.contains("Do ADP3");
        if (output)
            System.out.println("The list contains element, Do ADP3");
        else
            System.out.println("The list does not contain element, Do ADP3");

    }
    }
