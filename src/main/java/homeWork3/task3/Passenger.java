package homeWork3.task3;

public class Passenger {

    private String name;
    private int age;
    private boolean isRegistered;

    public Passenger(String name, int age, boolean isRegistered) {
        this.name = name;
        this.age = age;
        this.isRegistered = isRegistered;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    @Override
    public String toString() {
        return "passenger: name - " + name + ", age - " + age + ", isRegistered - " + (isRegistered ? "yes" : "no");
    }

    public void registeredNewPassenger(String newName) {
        if(!name.equals(newName)) {
            System.out.println("A new passenger has been registered: " + newName);
        }
        else {
            System.out.println("The passenger is already registered");
        }
    }
}
