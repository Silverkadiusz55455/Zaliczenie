public class testClass {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Audi", "q3",2012, 200.000,4,
                "lewej", 3.0, 140);
        car1.powerUp();

        Vehicle mot1 = new Motor("Yamaha", "Fazer 600 s2", 2006, 29932,
                2, 96, true);
        System.out.println("Lista pojazdów: ");



        System.out.println(car1.toString());

        System.out.println(mot1.toString());

        if (car1 instanceof Car) {
            Car specificCar = (Car) car1;
            specificCar.brrr();
        }
// sprawdzenie czy referencja wskazuje na obiekt reprezentujacy car, uzylem operatora instanceof

        if(mot1 instanceof Motor){
            ((Motor) mot1).prrr();
        }
    }

}
