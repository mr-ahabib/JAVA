

public class BreakContinueReturn {
    public static void main(String[] args) {
        int i;
        for(i=1; i<=100 ; i++){
            if(i==25){
               /* break;   */     //this will break before 25.
                continue;      // this will be continued.
            }
            System.out.println(i);
        }
    }
}
