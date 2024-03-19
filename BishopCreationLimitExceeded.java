
public class BishopCreationLimitExceeded extends Exception
{
    public BishopCreationLimitExceeded() {
        super("The maximum number of bishop objects can be 5");
    }
}
final class Bishop {
    public int objectNumber;

    public static int objectNumberCounter=1;

    public Bishop() throws BishopCreationLimitExceeded {
        if(objectNumberCounter>5)
            throw new BishopCreationLimitExceeded();
        objectNumber=objectNumberCounter;
        objectNumberCounter++;
    }

    public void printObjectNumber() {
        System.out.println("This Bishop Object number is "+objectNumber);
    }
}