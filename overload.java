public class overload {
    int a,b,c;

    public void Value(){
        a=10;
        b=20;
        c=3;
    }
    public void Value(int a){
        this.a=a;
        b=20;
        c=3;
    }
    public void value(int a,int b){
        this.a=a;
        this.b=b;
        c=3;
    }
}
