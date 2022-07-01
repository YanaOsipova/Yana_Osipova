import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println(" ");
            System.out.println("Введите один из вариантов: " + (Arrays.toString(Comands.values())));
            String choice = sc.next().toUpperCase().trim();
            Comands cm = Comands.valueOf(choice);

            switch (cm) {
                case ADD:
                    System.out.println("Какое животное добавить: cat, dog или duck?");
                    String animalType = sc.next();
                    if (animalType.equals("cat")){
                        Animal cat = new Cat();
                        createAnimal(cat, sc);
                        animals.add(cat);
                        cat.say();
                    } else if (animalType.equals("dog")){
                        Animal dog = new Dog();
                        createAnimal(dog, sc);
                        animals.add(dog);
                        dog.say();
                    } else if (animalType.equals("duck")){
                        Animal duck = new Duck();
                        createAnimal(duck, sc);
                        animals.add(duck);
                        duck.say();
                    }
                    break;
                case LIST:
                    System.out.println("Список:");
                    animals.forEach(animal -> System.out.println(animal));
                    break;
                case EXIT:
                    System.out.println("Выход из программы.");
                    System.exit(55);
                default:
                    System.out.println("Неизвестная команда: " + cm);
            }
        }

    }


    public static void createAnimal (Animal animal, Scanner scanner){
        System.out.println("Введите имя животного:");
        animal.setName(scanner.next().trim());

        int number;
        do {
            System.out.println("Введите возраст животного (положительное число!):");
            while (!scanner.hasNextInt()) {
                System.out.println("Это НЕ число! Введите возраст животного (положительное число!):");
                scanner.next(); // this is important!
            }
            number = scanner.nextInt();
        } while (number <= 0);
        animal.setAge(number);

        int number2;
        do {
            System.out.println("Введите вес животного (положительное число!):");
            while (!scanner.hasNextInt()) {
                System.out.println("Это НЕ число! Введите вес животного (положительное число!):");
                scanner.next();
            }
            number2 = scanner.nextInt();
        } while (number2 <= 0);
        animal.setWeight(number2);
        System.out.println("Введите цвет шерсти животного:");
        animal.setColor(scanner.next().toLowerCase().trim());
    }
}
