import java.util.Calendar;
import java.util.Date;


public abstract class Employee implements IPrintable{

    //V a r i a b l e s    d e c l a r a t i o n

    private String name = "";
    private int age;
    private double earnings;
    private int birthYear = 0 ;


    //M e t h o d s    d e c l a r a t i o n

    int calcBirthYear() {

        Date date = new Date();
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        if(age == 0)
        {
            System.out.println("Age not found!");
        }
        else{
            birthYear += currYear - age;
            //System.out.println("Birth year of " +name + " is " +birthyear);   //Displaying to check result
        }

        return birthYear;
    }

     Double calcEarnings(){
        setEarnings(1000.00);
        return 1000.00;
    }



    //O v e r r i d i n g
    @Override
    public void printMyData()
    {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Birth Year : " + birthYear) ;

    }


    //A d d e d   G e t t  e r   a n d   S e t t e r


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }
}
