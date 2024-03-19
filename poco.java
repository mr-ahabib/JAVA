
abstract class ping{
    String model="E class";
    String year="2008";

    public abstract void goFast();
    public void show(){
        System.out.println(model+" "+year);
    }
}


public class poco extends ping {
    @Override
    public void goFast() {
        System.out.println("Car can go fast.");

    }

    public static void main(String[] args) {
        poco p=new poco();
        p.show();
        p.goFast();
    }
}
