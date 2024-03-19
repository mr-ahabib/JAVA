
class D{
    private int number;
    public void setNumber(int number){
        this.number=number;
    }
    public int getNumber(){
        return number;
    }
}


public class E {
    public static void main(String[] args) {
        D o=new D();
        o.setNumber(25);
        System.out.println(o.getNumber());
    }
}
