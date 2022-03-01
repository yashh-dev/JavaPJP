import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo {
    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(saveCountryCapital("Us", "washingTon"));
        System.out.println(saveCountryCapital("India", "Delhi"));
        System.out.println(saveCountryCapital("Korea", "Seoul"));
        System.out.println(saveCountryCapital("Japan", "Tokyo"));
        System.out.println(map);
        System.out.println(getCapital("Korea"));
        System.out.println(getCountry("washingTon"));
        System.out.println(createMap());
        System.out.println(arrayfrommap());
        System.out.println(arrayfrommapCapital());
    }

    public static String saveCountryCapital(String countryName, String capital) {
        String s;
        if ((s = map.put(countryName, capital)) != null) {
            return "Duplicate country";
        }
        return "Added";
    }

    public static String getCapital(String countryName) {
        String s;
        if ((s = map.get(countryName)) != null) {
            return s;
        }
        return "No Country Found";
    }

    public static String getCountry(String capital) {
        Set<Entry<String, String>> set = map.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Entry<String, String> entry = (Entry<String, String>) iter.next();
            if (entry.getValue().equals(capital)) {
                return entry.getKey();
            }
        }
        return "No Country Found";
    }

    public static Map createMap() {
        Set<Entry<String, String>> set = map.entrySet();
        HashMap map2 = new HashMap<>();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Entry<String, String> entry = (Entry<String, String>) iter.next();
            map2.put(entry.getValue(), entry.getKey());
        }
        return map2;
    }

    public static ArrayList arrayfrommap() {
        Set<Entry<String, String>> set = map.entrySet();
        ArrayList arr = new ArrayList();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Entry<String, String> entry = (Entry<String, String>) iter.next();
            arr.add(entry.getValue());
        }
        return arr;
    }

    public static ArrayList arrayfrommapCapital() {
        Set<Entry<String, String>> set = map.entrySet();
        ArrayList arr = new ArrayList();
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            Entry<String, String> entry = (Entry<String, String>) iter.next();
            arr.add(entry.getKey());
        }
        return arr;
    }
}