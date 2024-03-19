
//Encapsulation with getter and setter


class MyEncapsulation{
    private int num;

    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        MyEncapsulation obj= new MyEncapsulation();
        obj.setNum(500);
        System.out.println(obj.getNum());

    }
}
