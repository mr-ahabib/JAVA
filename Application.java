
class course{
    String name,id;
    int credit;
    public course(String name,String id,int credit){
        this.name=name;
        this.id=id;
        this.credit=credit;
    }
    public void display(){
        System.out.println(name+" "+id+" "+credit);
    }
    public void updateCourse(course c1){
        this.name=c1.name;
        this.id=c1.id;
        c1.credit--;
    }
}





public class Application {
    public static void main(String[] args) {
        course c1=new course("OOP","CSI211",3);
        course c2=new course("SPL","CSI121",1);

        c1.display();
        c2.display();
        c1.updateCourse(c2);
        c1.display();
        c2.display();
    }
}
