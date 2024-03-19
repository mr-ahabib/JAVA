
// Polymorphism


class Car{
    public void run(){
        System.out.println("Car is running.");
    }
}

class Supercar extends Car{
    public void run() {
        System.out.println("super car is running.");
    }
}

public class PolymorPhism {
    public static void main(String[] args) {
        Car c=new Supercar();
        c.run();
    }

}
