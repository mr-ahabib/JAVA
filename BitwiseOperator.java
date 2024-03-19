public class BitwiseOperator {
    public static void main(String[] args) {
        int a=120,b=32,c;
         c= a&b;
        System.out.println("a & b= "+c);

        c= a|b;
        System.out.println("a | b= "+c);

        c= a^b;
        System.out.println("a ^ b= "+c);


        c= a>>2;//a is divided by 2 and 2 shift right.
        System.out.println("Right shift = "+c);

        c= b<<3;//b is divided by 2 and 3 shift left.
        System.out.println("Left shift = "+c);
    }
}
//Bitwise operator only used for binary addition,multiplication etc.