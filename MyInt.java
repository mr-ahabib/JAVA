
class Hide{
    private int x;

    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
        }



public class MyInt {
    public static void main(String[] args) {
        Hide o=new Hide();
        o.setX(10);
        System.out.println(o.getX());
    }
}
