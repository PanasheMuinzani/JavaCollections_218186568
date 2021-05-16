package za.ac.cput.Panashe;

//Panashe Muinzani_218186568
// 14 May 2021
//Java Collection classes
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

class MapDemoTest {
    @Test
    public void MapAdd()
    {
        Map map = new HashMap();
        Assertions.assertEquals(0,map.size());
        map.put("myName","Panashe");
        map.put("favMovie","Acrimony");
        Assertions.assertEquals(2,map.size());
    }

}
