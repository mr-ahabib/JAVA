import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,large;
        System.out.println("Enter two numbers: ");

        x = input.nextInt();
        y = input.nextInt();
        large =(x>y)?x:y;
        System.out.println("Large Number = "+large);

    }
}
