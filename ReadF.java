import java.io.BufferedReader;
import java.io.FileReader;

public class ReadF {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("F:/FileHandling/New.txt"));
            String st;
            while((st=br.readLine()) !=null){
                System.out.println(st);
            }

            br.close();
        }
        catch(Exception ex1){
            return;
        }
    }
}
