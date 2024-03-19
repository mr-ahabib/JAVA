
class Ar{
    public void show(){
        System.out.println("I am in parent class.");
    }
}

public class over extends Ar {
    public void show(){
        System.out.println("I am ic child class.");
    }

    public static void main(String[] args) {
        over o=new over();
        o.show();
    }
}
