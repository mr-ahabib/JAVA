
// n series sum program

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0,result=1;
        System.out.println("enter the last number: ");
        n = input.nextInt();
        for(int i=1; i<=n; i=i+1) {
            sum = sum + i;    // n series sum
            sum = sum+ i*i;  // for square series sum
            result = result*i;

        }
        System.out.println("Sum = "+sum);
        System.out.println("Result = "+result);
    }
}
