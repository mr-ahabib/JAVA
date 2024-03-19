// all math type calculation;

public class MathClass {
    public static void main(String[] args) {
        double x=-2,y=3,max,min,absulute,power,round,pie,exponential;

        max=Math.max(x,y);
        System.out.println("Maximum= "+max);

        min= Math.min(x,y);
        System.out.println("Minimum= "+min);

        absulute=Math.abs(x);
        System.out.println("Absulute value of x= "+absulute);

        power= Math.pow(x,y);//x to the power y
        System.out.println("x to the power y = "+power);

        round=Math.round(8.6f);
        System.out.println("Round is= "+round);

        pie=Math.PI;
        System.out.println("Value of PI= "+pie);

        exponential= Math.E;
        System.out.println("Value of Exponential= "+exponential);



    }
}
