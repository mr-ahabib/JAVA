import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter any positive integer");
        num= input.nextInt();
           int count=0;

        for(int i=2; i<num; i++){

            if(num%i==0){
                count++;
                break;

            }

        }
        if(count==0){
            System.out.println("Prime");
        }
        else
            System.out.println("Not Prime");
    }
}
