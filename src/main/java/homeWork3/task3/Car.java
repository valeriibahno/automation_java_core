package homeWork3.task3;

public class Car {

    private String brand;
    private String model;
    private int speed;
    private boolean isNew;
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private Body body;
    private Passenger passenger;

    public Car(String brand, String model, int speed, boolean isNew, SteeringWheel steeringWheel, Wheel wheel, Body body) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.isNew = isNew;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.body = body;
    }

    public Car(String brand, String model, int speed, boolean isNew, SteeringWheel steeringWheel, Wheel wheel, Body body, Passenger passenger) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.isNew = isNew;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.body = body;
        this.passenger = passenger;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public SteeringWheel getSteeringWheel() {
        return this.steeringWheel;
    }

    public Wheel getWheel() {
        return this.wheel;
    }

    public Body getBody() {
        return this.body;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Машина з пасажиром: " + brand + ", " + model + ", макс. швидкість: " + speed + " км/ч" + ", стан: " + (isNew ? "нова" : "вживана") +
                ", \nінформація про " + steeringWheel.toString() + ", \nінформація про " + wheel.toString() +
                ", \nінформація про " + body.toString() + ", \nінформація про " + passenger.toString();
    }

    public String toStringWithoutPass() {
        return "Машина без пасажира: " + brand + ", " + model + ", макс. швидкість: " + speed + " км/ч" + ", стан: " + (isNew ? "нова" : "вживана") +
                ", \nінформація про " + steeringWheel.toString() + ", \nінформація про " + wheel.toString() +
                ", \nінформація про " + body.toString();
    }

    public void moveCar(int startSpeed, boolean hasPassenger) {

        if(hasPassenger) {
            System.out.println("Машина з пасажиром почала рух:");

            for (int i = startSpeed; i <= speed; i++) {
                System.out.println("Швидкість: " + i + " км/г");
                i += 30;
            }
        }
        else {
            System.out.println("Машина без пасажира почала рух:");

            for (int i = startSpeed; i <= speed; i++) {
                System.out.println("Швидкість: " + i + " км/г");
                i += 50;
            }
        }
        System.out.println("Максимальна швидкість " + getBrand() + " " + getModel() + ": " + speed + " км/г");
    }

    public void priceCar(int startPrice) {
        if(isNew) {
            System.out.println(startPrice * 1.2);
        }
        else {
            System.out.println(startPrice * 0.8);
        }
    }

    public static void main(String[] args) {

        SteeringWheel steeringWheel = new SteeringWheel("Black", 15, true);
        Wheel wheel = new Wheel(18, "Winter", true);
        Body body = new Body("SUV", "Red Crystal", false);
        Passenger passenger = new Passenger("Валерій", 33, true);

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
        System.out.println("Ціна вживаної машини:");
        carWithoutPassenger.priceCar(10000);
        System.out.println("Ціна нової машини:");
        carWithPassenger.priceCar(20000);
    }
}
