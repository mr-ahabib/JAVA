public class DeclareException {

    public void MethodA(){
        try{

        }catch(Exception e){
            System.out.println("if try fails then catch.");

        }finally {
            System.out.println("always execute.");
        }
    }
    public void mrthodB() throws SecurityException{

    }
    public void methodC() throws SecurityException{

    }
}
