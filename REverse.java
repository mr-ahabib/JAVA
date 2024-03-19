import java.io.*;

import java.util.Scanner;

public class REverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        String[] normal = new String[3];
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("F:/Final Assignment/Normal.txt"));
            for(int i=0; i<= normal.length;i++){
                normal[i]=sc.nextLine();
                bw.write(normal[i]);
                bw=new BufferedWriter(new FileWriter("F:/Final Assignment/Reverse.txt"));
                for(int j= normal.length; i>=0;i--){
                    bw.write(normal[i]);
                }

            }
            bw.close();
            try{
               BufferedWriter bw1=new BufferedWriter(new FileWriter("F:/Final Assignment/Reverse.txt"));
                for(int j= normal.length; j>=0;j--){
                    bw1.write(normal[j]);

                }
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
        catch(Exception e){
            System.out.println(e);;
        }
    }
}
