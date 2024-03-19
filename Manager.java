
class Engineer{
    String name;
    double salary;

    public Engineer( String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void show(){
        System.out.println("Name= "+name+ " "+"Salary= "+salary);
    }
}


public class Manager extends Engineer {
    String department;
    public Manager(String department){
        super("Tukhor",50000.35);
        this.department=department;
    }
    public void show(){
        super.show();
        System.out.println(department);
    }

    public static void main(String[] args) {
        Manager o=new Manager("CSE");
        o.show();

    }
}
