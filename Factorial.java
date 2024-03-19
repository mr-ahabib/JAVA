import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num,factorial=1;
        System.out.println("enter any positive integer:");
        num= input.nextInt();

        for(int i=num; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial= "+factorial);

           // here you go.
    }
}
