

public class Invoking extends Employee {
    public String Department="Engineering";
    public void showDetails(){
        super.showDetails();
        System.out.println(Department);
    }

    public static void main(String[] args) {
        Invoking o=new Invoking();
        o.showDetails();
    }

        }

class Employee{
    String name="Habib";
    double salary=50000.25;

    public void showDetails(){
        System.out.println(name+" "+salary);
    }

        }

