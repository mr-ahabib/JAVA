import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner input= new Scanner(System.in);
        int m,n;
        System.out.println("Please input value of m,n:");
        m= input.nextInt();
        n= input.nextInt();
        for(int i=m; i<=n; i++){
            sum=sum+i;

        }
        System.out.println("Sum = "+sum);
    }
}
