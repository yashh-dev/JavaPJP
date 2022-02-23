import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListHandsOn {
    public static void main(String[] args) {
        // Exercise 1
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("End");
        printAll(list);

        // Exercise 2
        List<Number> numList = new ArrayList<>();
        numList.add(1);
        numList.add(12.0);
        numList.add(10L);
        printAll(numList);

        // Exercise 3
        Vector<Integer> vector = new Vector<>();
        vector.add(5);
        vector.add(6);
        vector.add(7);
        Enumeration nums = vector.elements();
        while (nums.hasMoreElements()) {
            System.out.println(nums.nextElement());
        }
    }

    public static void printAll(List list) {
        Iterator iteratorr = list.iterator();
        while (iteratorr.hasNext()) {
            System.out.println(iteratorr.next());
        }
    }
}
