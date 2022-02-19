import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopier {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input File Name");
        String InputfileName=sc.nextLine();
        FileInputStream cin;
        System.out.println("Enter the Output File Name");
        String OutputfileName=sc.nextLine();
        FileOutputStream cout;
        int c=0;
        try {
            cin=new FileInputStream(InputfileName);
            cout=new FileOutputStream(OutputfileName);
            while((c=cin.read())!=-1){
                cout.write(c);
            }
            
            cin.close();
            cout.close();
         }catch(FileNotFoundException e){
             System.out.println(e);
         }finally{
             if(c==-1){
                 System.out.println("File is Copied");
             }
         }
    }


}
