class Hasan{

    public void show(){
        System.out.println("Hello");
    }
}



public class Mahdi extends Hasan {
    @Override
    public void show() {
        super.show();
        System.out.println("Hi.");
    }

    public static void main(String[] args) {
        Mahdi h=new Mahdi();
        h.show();

    }
}
