import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    static HashSet set = new HashSet<>();

    public static void main(String[] args) {

        addCounty("India");

    }

    static boolean addCounty(String countryName) {
        return set.add(countryName);
    }

    static String findCountry(String countryName) {
        if (set.contains(countryName)) {
            return countryName;
        }
        return "County Not Found";
    }

    static void printAllCountries() {
        Enumeration names = Collections.enumeration(set);
        while (names.hasMoreElements()) {
            System.out.println(names.nextElement());
        }
        Iterator countrys = set.iterator();
        while (countrys.hasNext()) {
            System.out.println(countrys.next());
        }
    }
}
