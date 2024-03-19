class Student{
    String name;
    float tutionFees;

    public Student(String name,float tutionFees){
        this.name=name;
        this.tutionFees=tutionFees;
    }
    public void printBill(String name,float tutionFees){
        System.out.println("Name: "+name+ " " +"Bill: "+tutionFees);
    }

}

class GoldenFiveStudent extends Student{
    public GoldenFiveStudent(String name, float tutionFees) {
        super(name, tutionFees);
    }

    public void printBill(String name, float tutionFees) {
        super.printBill(name, tutionFees);
        double amount=(tutionFees*50)/100;
        System.out.println("Payable Amount: "+amount);
    }
}

class GPAFiveStudent extends Student{
    public GPAFiveStudent(String name, float tutionFees) {
        super(name, tutionFees);
    }

    public void printBill(String name, float tutionFees) {
        super.printBill(name, tutionFees);
        double pay=(tutionFees*25)/100;
        double grand =tutionFees-pay;
        System.out.println("Payable Amount: "+grand);
    }
}

public class BillPay {
    public static void main(String[] args) {
        GoldenFiveStudent gf=new GoldenFiveStudent("Habib",50000F);
        gf.printBill("Habib",50000F);

        GPAFiveStudent gp=new GPAFiveStudent("Ahashan",50000F);
        gp.printBill("Ahashan",50000F);
    }
}