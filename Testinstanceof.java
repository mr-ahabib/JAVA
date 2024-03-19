
class car{
    public void abc(){
        System.out.println("Car");
    }
}
class bus{
    public void xyz(){
        System.out.println("Bus");
    }
}


public class Testinstanceof {
    public static void main(String[] args) {
        car c=new car();
        bus b=new bus();
        Testinstanceof t=new Testinstanceof();
        t.test(c);
        t.test(b);
    }
    public void test (Object obj){
        if (obj instanceof car){
            System.out.println("car class object.");
        }
        else if(obj instanceof bus){
            System.out.println("bus class object.");
        }
        else{
            System.out.println("not bus/car class.");
        }
    }
}
