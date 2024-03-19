
class Animal{
    public void show(){
        System.out.println("Animal can not fly.");
    }
}

public class Overr extends Animal{
    public void show() {
        super.show();
        System.out.println("Birds can fly.");
    }

    public static void main(String[] args) {
        Overr a=new Overr();
        a.show();
    }
}
