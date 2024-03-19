public class Account {
    public String name;
    public static double balance=0;

}
class InsufficientBalance{
    public void withdraw(double a) throws InsufficientBalance{
        if(balance>0){
            balance=balance-a;
        }
        public InsufficientBalance(double a,double b){
            super(a,b);
        }
        if(balance<0){
            try{
                throw new InvalidAmountArgument(double currentBalance,double withdrawAmount);
            }
            catch(InvalidAmountArgument  e){
                System.out.println(e);
            }
        }
    }
}
class InvalidAmountArgument{
    public void deposit(double a){
        if(balance>0){
            balance=balance+a;
        }
        public InvalidAmountArgument(double n){
            super(n);
        }
        if(balance<0){
            try{
                throw new InvalidAmountArgument(double negativeAmount);
            }
            catch(InvalidAmountArgument  e){
                System.out.println(e);
            }
        }

    }
}
