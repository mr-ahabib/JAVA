interface Botol{
    String e="hi";
    String b="2000";

    public abstract void fast();
}

public class Abs implements Botol {
    @Override
    public void fast() {
        System.out.println("Hello.");
    }

    public static void main(String[] args) {
        Abs a=new Abs();
        a.fast();
    }
}
