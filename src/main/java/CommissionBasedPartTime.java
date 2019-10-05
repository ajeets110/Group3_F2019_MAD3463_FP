public class CommissionBasedPartTime extends PartTime implements IPrintable{

    private double commissionPerc;
    private double finalSalary;
    private double commission;
    private int make;
    private String plate;
    private String color;
    private int seats;
    private String brand;
    private double price;

    // S e t t e  r   a n d    G e t t  e r

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCommissionPerc() {
        return commissionPerc;
    }

    public void setCommissionPerc(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }

    public void setCar(int mak, String plat, String colo, int seat) {
        this.make = mak;
        this.plate = plat;
        this.color = colo;
        this.seats = seat;
    }
    public void setMotorcycle(int mak, String plat, String brand, int price) {
        this.make = mak;
        this.plate = plat;
        this.brand = brand;
        this.price = price;
    }


    @Override
     Double calcEarnings() {

        commission = (super.getHoursWorked() * super.getRate()) * commissionPerc/100;
        finalSalary = (super.getHoursWorked() * super.getRate() ) + commission;
        setEarnings(finalSalary);
        return finalSalary;
    }

    @Override
    public void printMyData() {
        super.printMyData();
        System.out.println("Commission Percentage  : " + commissionPerc);
        System.out.println("Earnings               : " + finalSalary);
        Motorcycle motorcycle = new Motorcycle(make, plate, brand, price);
        Car car = new Car(make, plate, color, seats);
        if(car.getColor()!=null) {
            System.out.println("Employee has a car");
            car.printMyData();
            System.out.println("=========================");
        }
        else if(motorcycle.getBrand()!=null)
        {
            System.out.println("Employee has a motorcycle");
            motorcycle.printMyData();
            System.out.println("=========================");
        }
        else{
            System.out.println("No Vehicle");
        }
    }

}