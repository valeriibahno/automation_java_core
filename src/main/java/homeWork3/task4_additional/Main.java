package homeWork3.task4_additional;

public class Main {

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
