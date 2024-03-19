public class mOverRiding extends A{
    public String department="Engineering";
    public void show(){
        super.show();
        System.out.println("I am in child class.");
    }

    public static void main(String[] args) {
        mOverRiding o=new mOverRiding();
        o.show();
    }
}


class A{
    public void show(){
        System.out.println("I am in parent class.");
    }
}