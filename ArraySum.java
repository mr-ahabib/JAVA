
//Array sum of n inputs and average calculation,maximum and minimum

package ArrayDemo;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        System.out.println("Enter array size: ");
        n=input.nextInt();
        double[] number=new double[n];
        double sum=0;

        System.out.println("Enter  numbers: ");
         //for input
        for(int i=0; i<n; i++){
            number[i]=input.nextDouble();
        }
        //for sum
        for(int i=0; i<n; i++) {
            sum = sum + number[i];
        }

        System.out.println("Sum= "+sum);
        System.out.println("Average ="+sum/n);

             double max = number[0];
             double min = number[0];
             for(int i=1;i<n;i++){
                 if(max<number[i]){
                     max=number[i];

                 }
                 if(min>number[i]){
                     min = number[i];

                 }
             }
             System.out.println("Maximum= "+max);

             System.out.println("Minimum= "+min);

    }
}
