import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteF {
    public static void main(String[] args) {

        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("F:/FileHandling/New.txt"));

            System.out.println("Input file content:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            bw.write(s);
            for(int i = Integer.parseInt(String.valueOf(s.length())); i>=0; i--){
                BufferedWriter b=new BufferedWriter(new FileWriter("F:/FileHandling/New.txt"));
                System.out.println(i);
            }
            bw.close();
        }
        catch(Exception ex){
            return;
        }
    }
}
