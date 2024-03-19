class MyClass{
    public int x=20;
    public int y=40;

    public void show(){
        System.out.println("value of x= "+x);
        System.out.print("value of y= "+y);
    }
}

/*class child extends MyClass{
    public int a=50;
    public int b=30;

    public void show(){
        System.out.println(a);
        System.out.println(b);
    }
}   */

public class Inheritance extends MyClass {
    public int z=30;
    public static void main(String[] args) {
        Inheritance i=new Inheritance();
        i.show();
        System.out.println(i.x+" "+ i.y+" "+ i.z );

    }
}