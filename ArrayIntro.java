package ArrayDemo;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] number; //array declaration
        number= new int[5]; //array creation
        // by adding in one line
        /* int[] number=new int[]; */
        number[0]=545;
        number[1]=55;
        number[2]=54;
        number[3]=56;
        number[4]=5;

        int size=number.length;
        System.out.println(number[2]);// number[2] array value

        System.out.println("Array size = "+size);//array size

    }
}
