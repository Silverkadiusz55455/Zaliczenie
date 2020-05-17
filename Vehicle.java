public class Vehicle  {

    private String producer;
    private String model;
    private double year;
    private double vehicleMileage;
    private int wheels;
    private int power;
    public static final int ADD_POWER= 40;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String producer, String model, double year,
                   double vehicleMileage, int wheels, int power) {

        this.producer = producer;
        this.model = model;
        this.year = year;
        this.vehicleMileage = vehicleMileage;
        this.wheels = wheels;
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getVehicleMileage() {
        return vehicleMileage;
    }

    public void setVehicleMileage(double vehicleMileage) {
        this.vehicleMileage = vehicleMileage;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void powerUp(){
        setPower(getPower()+ADD_POWER);
    }

    public void giveSound(){
        System.out.println(name +"robi brrrrr");
    }

}
