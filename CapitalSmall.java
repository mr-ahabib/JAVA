import java.util.Scanner;

public class CapitalSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("please input a letter");
        ch = input.next().charAt(0);
        if (ch>= 'a' && ch<= 'z'){
            System.out.println("Small Letter.");
        }
        else if(ch>= 'A' && ch<= 'z'){
            System.out.println("Capital Letter.");
        }
        else
            System.out.println("invalid input.");
    }
}
