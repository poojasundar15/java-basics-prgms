package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExamplePrgm {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"Pooja");
        map1.put(2,"Rajan");
        map1.put(3,"Pooja");
        System.out.println(map1.get(1));

        for (Map.Entry<Integer,String> a : map1.entrySet())
        {
            System.out.println(a);


        }

    }
}
