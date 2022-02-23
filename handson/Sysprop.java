import java.util.Properties;

public class Sysprop {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println(p.getProperty("user.name"));
    }
}
