import java.util.*;
import java.io.*;

public class reverse {
    public static void main (String [] args)throws IOException
    {
        FileReader fr = new FileReader("reverse_input.txt");
        FileWriter fw = new FileWriter("reverse_output.txt");
        BufferedReader in = new BufferedReader(fr);

        String data;
        String reverse;

        while ((data = in.readLine()) != null)
            System.out.println (data);





    }
}