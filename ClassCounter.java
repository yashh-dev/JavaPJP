import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClassCounter {
    public static void main(String[] args) throws IOException{
        int count=0;
        System.out.println("Enter the File Name");
        Scanner sc=new Scanner(System.in);
        String fileName=sc.nextLine();
        FileInputStream cin=new FileInputStream(fileName);
        System.out.println("Enter the character to count");
        char givenChar=  sc.nextLine().charAt(0);
        try {
            int i=0;
            while(i<99){
               char c=(char)cin.read();
               if(c==givenChar)count++;
               i++;
            }
         }finally {  
            if (cin != null) {
               cin.close();
            }
         }
         System.out.println(count);
    }
}
