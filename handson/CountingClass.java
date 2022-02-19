import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CountingClass{
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input FileName");
        String inputFileName=sc.nextLine();
        System.out.println("Enter the output FileName");
        String outputFileName=sc.nextLine();
        FileReader fr=new FileReader(inputFileName);
        FileWriter fw=new FileWriter(outputFileName);
        BufferedReader reader=new BufferedReader(fr);
        String str;
        Map<String,Integer> map=new TreeMap();
        while((str=reader.readLine())!=null){
            str=str.trim();
            String[] strings=str.split(" ");
            for(String word:strings){
                if(!(map.containsKey(word))){
                    map.put(word,1);
                }else{
                    map.put(word,map.get(word)+1);
                }
            }
        }
        BufferedWriter writer=new BufferedWriter(fw);
        Set<Entry<String,Integer>> set=map.entrySet();
        Iterator<Entry<String,Integer>> iterator=set.iterator();
        while(iterator.hasNext()){
            Entry<String,Integer> me = iterator.next();
            writer.write(me.getKey()+":"+me.getValue()+"\n");
        }
        reader.close();
        writer.close();
    }
}