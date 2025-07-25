package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
//        SortedMap<String, Integer> sortedMap = new TreeMap<>((a, b) -> b - a);  reverse
        sortedMap.put("Pittu", 71);
        sortedMap.put("Mulya", 75);
        sortedMap.put("Nagesh", 79);
        sortedMap.put("Paka", 78);
        System.out.println(sortedMap);  //{Mulya=75, Nagesh=79, Paka=78, Pittu=71}
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("Nagesh"));  //{Mulya=75}             // exclude
        System.out.println(sortedMap.tailMap("Paka"));  //{Paka=78, Pittu=71}    // include
    }
}
