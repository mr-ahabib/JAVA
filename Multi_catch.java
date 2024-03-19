public class Multi_catch {
    public static void main(String[] args) {
        try{
            int i=9/3;
            System.out.println(i);
        }
        catch(ArithmeticException e1){
            System.out.println("Error:"+e1);
        }
        catch(Exception e2){
            System.out.println("Again Error:"+e2);
        }
        finally{
            System.out.println("Always.");
        }
    }
}
