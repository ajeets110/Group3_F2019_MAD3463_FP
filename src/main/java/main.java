public class main {

    public static void main(String[] args) {



       /** Intern i1 = new Intern();
       i1.setSchoolName("abc");
       i1.calcEarnings();
       i1.printMyData(); **/

       FullTIme f1 = new FullTIme();
       f1.setName("Skrillex");
       f1.setAge(25);
       f1.setSalary(85000);
       f1.setBonus(5000);
       f1.calcEarnings();
       f1.calcBirthYear();
       f1.setMake(2019);
       f1.setCar(2019, "ABD512", "Blue", 4);
       f1.printMyData();

       FullTIme f2 = new FullTIme();
       f2.setName("Martin Garrix");
       f2.setAge(22);
       f2.setSalary(852000);
       f2.setBonus(50000);
       f2.calcEarnings();
       f2.calcBirthYear();
       f2.setMake(2019);
       f2.setMotorcycle(2019, "ABD512", "Blue", 4);
       f2.printMyData();

      Intern i1 = new Intern();
      i1.setMotorcycle(2019, "BGV51", "Repsol", 50000);
      i1.setName("Hardwell");
      i1.setAge(62);
      i1.setSchoolName("Lambton College");
      i1.calcBirthYear();
      i1.calcEarnings();
      i1.printMyData();

       Intern i2 = new Intern();
       i1.setCar(2018, "BGV52", "Black", 4);
       i1.setName("Cardi B");
       i1.setAge(26);
       i1.setSchoolName("Hoods");
       i1.calcBirthYear();
       i1.calcEarnings();
       i1.printMyData();


    }
}
