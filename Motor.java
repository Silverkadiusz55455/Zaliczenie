public class Motor extends Vehicle {

    boolean factoryMotorPaint;

    public Motor(String producer, String model, double year, double vehicleMileage,
                 int wheels, int power, boolean factoryMotorPaint) {
        super(producer, model, year, vehicleMileage, wheels, power);
        this.factoryMotorPaint = factoryMotorPaint;
    }

    public boolean isFactoryMotorPaint() {
        return factoryMotorPaint;
    }

    public void setFactoryMotorPaint(boolean factoryMotorPaint) {
        this.factoryMotorPaint = factoryMotorPaint;
    }

    @Override
    public String toString() {
        return "Marka i model motoru: " + getProducer() + " " + getModel()
                + ", rok produkcji: " + getYear() + ", przebieg pojazdu: " + getVehicleMileage()
                + ", liczba kół: " + getWheels() + " moc: " + getPower() + ", lakier fabryczny: " + isFactoryMotorPaint();
    }
    public void prrr(){
        System.out.println("motur robi prrrrr");
    }
    public void giveSound() {
        System.out.println(getName() + " robi brrrrrrr");

    }
}

