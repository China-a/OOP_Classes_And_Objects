package Class_Object_Constructor_Practice;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animal = new ArrayList<>();
        System.out.println("Animal Menu" + "\n" + "Entering nothing will stop the loop");

        while(true) {

            System.out.println("Please enter a name");
            String animalName = scanner.nextLine();
            animal.add(new Animal(animalName));

            if (animalName.equals("")) {
                break;

            } else {

                System.out.println("Is it a dog? Yes or no");
                   String isItADog = scanner.nextLine();
                   boolean dogOrNa;
                   dogOrNa = isItADog.equalsIgnoreCase("Yes");

                    animal.add(new Animal(dogOrNa));
                    }
        }

        for (Object Animal: animal) {
            System.out.println(Animal.toString());
        }
        scanner.close();
    }
}
