import java.io.*;



public class JavaApplication57 {


    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("F:/Final Assignment/Reverse.txt");

            FileWriter fw = new FileWriter("F:/Final Assignment/Reverse.txt");

            String str = "";

            int i;

            while ((i = fr.read()) != -1) {
                str += (char)i;
            }

            str = str.replaceAll("[^\\d]", " ");
            str = str.trim();
            str = str.replaceAll(" +", " ");


            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println(
                    "File reading and writing both done");
        }

        catch (IOException e) {

            System.out.println(
                    "There are some IOException");
        }
    }

}