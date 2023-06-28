package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapPrgm {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(2,3);
        map.put(11,4);
        map.remove(2);
        for (Map.Entry<Integer,Integer> r : map.entrySet())
        {
            System.out.println(r.getKey());
        }
    }
}
