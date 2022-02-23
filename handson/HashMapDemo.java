import java.util.HashMap;

public class HashMapDemo {
    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(saveCountryCapital("Us", "washingTon"));
        System.out.println(saveCountryCapital("Us", "washingTon"));
        System.out.println(saveCountryCapital("Us", "washingTon"));
        System.out.println(saveCountryCapital("Us", "washingTon"));
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
}