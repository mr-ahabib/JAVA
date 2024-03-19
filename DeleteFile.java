import java.io.*;

import java.util.Scanner;

public class DeleteFile {
    public static void main(String[] args) {
        String[] del=new String[10];
        try{
            BufferedWriter b=new BufferedWriter(new FileWriter("F:/Final Assignment/Reverse.txt"));
            Scanner sc=new Scanner(System.in);
            for(int i=0;i< del.length;i++){
                del[i]=sc.nextLine();
                b.write(del[i]);
                b.write("/n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      if(del.length<3){
          try{
              BufferedWriter b1=new BufferedWriter(new FileWriter("File.txt"));
              for(int i=0;i< del.length;i++){
                  b1.write(del[i]);
                  b1.write("\n");
              }
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
      }
      else {
          try {
              BufferedWriter b1 = new BufferedWriter(new FileWriter("File.txt"));
              int a=0;
              for (int i = del.length; i<0; i--) {
                  a++;
                  if(a==3){
                      break;
                  }
                  b1.write(del[i]);
                  b1.write("\n");
              }
          } catch (IOException e) {
              throw new RuntimeException(e);

          }
      }
    }
}
