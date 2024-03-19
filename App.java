public class App {


    public static void main(String[] args) {

        Customer r = new Customer();
        r.setName("Habib");
        System.out.println(r.getName());

        r.setBirthDay(14);
        r.setBirthMonth(09);
        r.setBirthYear(2000);
        System.out.println( "Current Age of the Customer: "+r.getAge(r.getBirthDay(), r.getBirthMonth(), r.getBirthYear()));

        Employe s = new Employe();
        s.setName("Ahashan");
        System.out.println(s.getName());
        s.setBirthDay(23);
        s.setBirthMonth(2);
        s.setBirthYear(1967);
        System.out.println( "Current Age of the Employee: "+s.getAge(s.getBirthDay(), s.getBirthMonth(), s.getBirthYear()));

    }
}
class Employe extends Person  {

    @Override
    public String getAge(int CurrentDay,int CurrentMonth,int CurrentYear){
        int year,month,day;


        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(CurrentYear, CurrentMonth, CurrentDay);
        Period period = Period.between(date, now);
        day=period.getDays();
        month = period.getMonths();
        year= period.getYears();




        return year+" years "+month+"  months "+day+" days ";


    }

}
class Customer extends Person  {

    @Override
    public String getAge(int CurrentDay,int CurrentMonth,int CurrentYear){

        LocalDate dob = LocalDate.of(CurrentYear, CurrentMonth, CurrentDay);
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(dob, curDate);

        int a,c,d;
        a = period.getYears();
        c = period.getMonths();
        d=period.getDays();
        String b=a+" years "+c+"  months "+d+" days ";
        return b;


    }

}


