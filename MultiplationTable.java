import java.util.Scanner;

public class MultiplationTable {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i,num;
        System.out.println("please input any integer:");
        num= input.nextInt();

             for( i=1; i<=10; i++){

                 System.out.println(num+ "x"+i +"="+num*i);
             }


    }
}
