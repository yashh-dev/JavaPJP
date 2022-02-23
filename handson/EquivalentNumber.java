public class EquivalentNumber {
    public static void main(String[] args) {
        Integer num = Integer.parseInt(args[0]);
        System.out.println("Given Number :" + num);
        System.out.println("Binary Equivalent :" + Integer.toBinaryString(num));
        System.out.println("Octal Equivalent :" + Integer.toOctalString(num));
        System.out.println("Hexadecimal Equivalent :" + Integer.toHexString(num));

    }
}
