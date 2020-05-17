public class Car extends  Vehicle{

    private String CarSteeringWheelPosition;
    private double engine;

    public Car(String producer, String model, double year, double vehicleMileage,
               int wheels, String carSteeringWheelPosition, double engine, int power)
    {
        super(producer, model, year, vehicleMileage, wheels, power);
        CarSteeringWheelPosition = carSteeringWheelPosition;
        this.engine = engine;
    }

    public String getCarSteeringWheelPosition() {
        return CarSteeringWheelPosition;
    }

    public void setCarSteeringWheelPosition(String carSteeringWheelPosition) {
        CarSteeringWheelPosition = carSteeringWheelPosition;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Marka i model samochodu: "+ getProducer() +" "+ getModel()
                + ", rok produkcji: " +getYear() +", przebieg pojazdu: "+ getVehicleMileage()
                + ", liczba kół: "+getWheels()+" silnik: "+getEngine()+", moc: "+getPower() +", kierownica po "
                +getCarSteeringWheelPosition()+" stronie.";
    }

    public void AddpowerUp(){
        System.out.println("Początkowa moc"+ getPower());
        }


    }
