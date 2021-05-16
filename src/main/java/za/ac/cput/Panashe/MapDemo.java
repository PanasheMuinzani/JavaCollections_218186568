package za.ac.cput.Panashe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Panashe Muinzani_218186568
// 16 May 2021
//Java Collection classes

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Panashe");
        map.put("favMovie", "Acrimony");
        map.put("favColour", "Lilac");
        map.put("favSong", "Damages");

        System.out.println("Map= "+map);
    }
}
