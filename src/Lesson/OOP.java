package Lesson;
import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        // we create an object from the ArrayList class named "list"
        ArrayList<Integer> list = new ArrayList<>();

// let's add the values 1, 22, 59, 58, and 90 to the "list" object
        list.add(1);
        list.add(22);
        list.add(59);
        list.add(58);
        list.add(90);

// we print the size of the integers object
        System.out.println("Index 0 so the first value: " + list.get(0));
        System.out.println("Index 1 so the second value: " + list.get(1));
        System.out.println("Index 1 so the second value: " + list.get(2));
    }
}
