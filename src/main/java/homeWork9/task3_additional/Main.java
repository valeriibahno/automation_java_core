package homeWork9.task3_additional;

import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void addPersonToClub(Map<Person, List<Animal>> map) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter name of new person:");
        String name = scanner.next();
        logger.info("Enter age of new person:");
        int age = scanner.nextInt();

        map.put(new Person(name, age), null);
        logger.info("Map with added new person: " + map + "\n");
    }

    public static void addAnimalToPerson(Map<Person, List<Animal>> map, Person person) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter type of new animal:");
        String type = scanner.next();
        logger.info("Enter name of new animal:");
        String name = scanner.next();

        for (Map.Entry<Person, List<Animal>> item: map.entrySet()) {
            List<Animal> lisOfAnimals = item.getValue();
            if(item.getKey().equals(person)) {
                lisOfAnimals.add(new Animal(type, name));
                map.replace(person, lisOfAnimals);
            }
        }
        logger.info("Map with added animal to person: " + map + "\n");
    }

    public static void removeAnimalFromPerson(Map<Person, List<Animal>> map, Person person, Animal animal) {

        for (Map.Entry<Person, List<Animal>> item: map.entrySet()) {
            List<Animal> lisOfAnimals = item.getValue();
            if(item.getKey().equals(person)) {
                lisOfAnimals.remove(animal);
                map.replace(person, lisOfAnimals);
            }
        }
        logger.info("Map with removed animal from person: " + map + "\n");
    }

    public static void removePersonFromClub(Map<Person, List<Animal>> map, Person person) {

        Iterator<Map.Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals(person))
                iterator.remove();
        }
        logger.info("Map with removed person from club: " + map + "\n");
    }

    public static void main(String[] args) {

        Map<Person, List<Animal>> map = new HashMap<>();
        Person p1 = new Person("Valerii", 33);
        Person p2 = new Person("Iryna", 18);
        Person p3 = new Person("Alex", 21);
        Person p4 = new Person("Olha", 25);
        Person p5 = new Person("Anna", 28);

        Animal a1 = new Animal("dog", "Jack");
        Animal a2 = new Animal("cat", "Mursik");
        Animal a3 = new Animal("wolf", "Grey");
        Animal a4 = new Animal("rabbit", "Fast");
        Animal a5 = new Animal("elephant", "Huge");
        Animal a6 = new Animal("hamster", "Fat");

        List<Animal> listForP1 = new ArrayList<>();
        listForP1.add(a1);
        listForP1.add(a2);
        List<Animal> listForP2 = new ArrayList<>();
        listForP2.add(a3);
        List<Animal> listForP3 = new ArrayList<>();
        listForP3.add(a4);
        List<Animal> listForP4 = new ArrayList<>();
        listForP4.add(a5);
        listForP4.add(a6);

        map.put(p1, listForP1);
        map.put(p2, listForP2);
        map.put(p3, listForP3);
        map.put(p4, listForP4);

        logger.info("Start program");

        Scanner scanner = new Scanner(System.in);
        logger.info("You can choose one of actions:");
        logger.info("1 - Додати людину до клубу");
        logger.info("2 - Додати тваринку до людини");
        logger.info("3 - Видалити(забрати) тваринку від людини");
        logger.info("4 - Видалити людину з клубу");
        logger.info("5 - Вивести на екран зооклуб");
        logger.info("6 - Вийти з програми");
        logger.info("Choose your action:");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                addPersonToClub(map);
                break;
            case 2:
                addAnimalToPerson(map, p4);
                break;
            case 3:
                removeAnimalFromPerson(map, p4, a5);
                break;
            case 4:
                removePersonFromClub(map, p5);
                break;
            case 5:
                logger.info("Final map: " + map);
                break;
            case 6:
                logger.info("Finish program");
                break;
        }
    }
}
