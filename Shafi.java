
class Rafi{
    int i=10;
    public Rafi(int j){
        System.out.println(i);
        j=j*2;
        this.i=j*10;
    }
}

class Habib extends Rafi{
    public Habib(int j){
        super(j);
        System.out.println(i);
        this.i=j*20;
    }
}


public class Shafi {
    public static void main(String[] args) {
        Habib n=new Habib(4);
        System.out.println(n.i);
    }
}
