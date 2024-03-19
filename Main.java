public class Main {
    public String info;

    public Main(){
        info = "constructor.";
        System.out.println(info);
    }
    {
        info="It is a block.";
        System.out.println(info);
    }
    public void showData(){
        info="Method.";
        System.out.println(info);
    }

    public static void main(String[] args) {
        Main x= new Main();
        x.showData();
    }
}
