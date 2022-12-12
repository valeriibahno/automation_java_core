package homeWork3.task3;

public class Main {

    public static void main(String[] args) {

        SteeringWheel steeringWheel = new SteeringWheel("Black", 15, true);
        Wheel wheel = new Wheel(18, "Winter", true);
        Body body = new Body("SUV", "Red Crystal", false);
        Passenger passenger = new Passenger("Valerii", 33, true);

        Car carWithoutPassenger = new Car("Honda", "Pilot", 150,false, steeringWheel, wheel, body);
        Car carWithPassenger = new Car("Mazda", "CX-5", 200, true, steeringWheel, wheel, body, passenger);

        System.out.println(carWithoutPassenger.toStringWithoutPass());
        System.out.println("================");
        System.out.println(carWithPassenger.toString());
        System.out.println("================");
        carWithoutPassenger.moveCar(10, false);
        System.out.println("================");
        carWithPassenger.moveCar(5, true);
        System.out.println("================");
        System.out.println("The price of a used car:");
        carWithoutPassenger.priceCar(10000);
        System.out.println("The price of a new car:");
        carWithPassenger.priceCar(20000);
    }
}
