import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class ContactList {
    static TreeMap<String, String> contactList = new TreeMap();

    public static String getPhoneNumber(String name) {
        return contactList.get(name);
    }

    public static String getName(String phoneNumber) {
        Set set = contactList.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Entry<String, String> e = (Entry<String, String>) i.next();
            if (e.getValue().equals(phoneNumber)) {
                return e.getKey();
            }
        }
        return "No Contact in that Number";
    }

    public static void printAll() {
        Set set = contactList.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Entry<String, String> e = (Entry<String, String>) i.next();
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    public static void main(String[] args) {
        contactList.put("Ajay", "479383574");
        contactList.put("Vijay", "475678356");
        contactList.put("Jai", "8947376345");
        contactList.put("Aja", "37845725");
        System.out.println(getPhoneNumber("Vijay"));
        System.out.println(getName("8947376345"));
        printAll();
    }
}
