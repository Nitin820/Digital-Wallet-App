package lamda.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Orange");
        stringList.add("Mango");

       
        Collections.sort(stringList, (s1, s2) -> s2.compareTo(s1));

        
        System.out.println("Sorted List in Descending Order:");
        stringList.forEach(System.out::println);
    }
}
