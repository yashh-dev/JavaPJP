import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        System.out.println(String.format("%08d", Integer.parseInt(Integer.toBinaryString(num))));
    }
}
