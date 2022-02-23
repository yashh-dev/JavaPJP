import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet set = new TreeSet(Collections.reverseOrder());
        set.add("Ajay");
        set.add("Vinoth");
        set.add("Vijay");
        set.add("Prem");
        Iterator names = set.iterator();
        while (names.hasNext()) {
            System.out.println(names.next());
        }
        System.out.println("Vijay Exists : " + set.contains("Vijay"));
    }

}