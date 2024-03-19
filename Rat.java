class Cat{
    public int x=20;
    public int y=30;

    public void display(){
        System.out.println(x+" "+y);
    }
}

public class Rat extends Cat {
    public int z=60;

    public static void main(String[] args) {
        Rat obj=new Rat();
        obj.display();
        System.out.println(obj.x+" "+ obj.y+" "+obj.z);
    }
}
