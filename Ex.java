public class Ex {
    public static void main(String[] args) {
        int x=10;
        try{
            double y=x/0;
            System.out.println(y);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Always");
        }
    }
}
