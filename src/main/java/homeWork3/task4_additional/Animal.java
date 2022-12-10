package homeWork3.task4_additional;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public Animal(String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        String nameAnimal = "Назва тварини = ";
        String speedAnimal = ", Швидкість тварини = ";
        String ageAnimal = ", Вік тварини = ";

        Animal animal = new Animal("Леопард", 20, 7);
        System.out.println(nameAnimal + animal.getName() + speedAnimal + animal.getSpeed() + " км/год" + ageAnimal + animal.getAge() + " років");
        System.out.println("----------------------------------------");
        animal.setName("Бик");
        animal.setSpeed(2);
        animal.setAge(14);
        System.out.println(nameAnimal + animal.getName() + speedAnimal + animal.getSpeed() + " км/год" + ageAnimal + animal.getAge() + " років");
    }
}
