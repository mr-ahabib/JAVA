
class Audi{
    int x=20;
    int y=30;

    public void show(){
        System.out.println(x+" "+y);
    }
}



public class BMW extends Audi {
    int p=90;

    public static void main(String[] args) {
        BMW o=new BMW();
        o.show();
        System.out.println(o.x+" "+o.y+" "+o.p);
    }
}
