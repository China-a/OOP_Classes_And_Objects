package Class_Object_Constructor_Practice;

public class Animal {
    private String animalName;

    private Boolean isItADog;

    public Animal(String animalName) {
        this.animalName = animalName;
    }
public Animal( Boolean isItADog) {
        this.isItADog = isItADog;
}
    public String getAnimalName() {
        return animalName;
    }

    public Boolean getIsItADog() {
        return isItADog;
    }


    public String toString() {
        return getAnimalName() + " is a dog = " + getIsItADog();
    }



}
