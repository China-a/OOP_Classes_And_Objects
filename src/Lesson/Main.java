package Lesson;

public class Main {
    public static void main(String[] args) {
        ClassCreation_Customer customer1 = new ClassCreation_Customer("Dale");
        ClassCreation_Customer customer2 = new ClassCreation_Customer("Wanda");
        ClassCreation_Customer customer3 = new ClassCreation_Customer("Larry");

        customer1.howOld(18);
        customer1.printClassCreation_Customer1();

        customer2.howOld(56);
        customer2.printClassCreation_Customer1();

        customer3.howOld(33);
        customer3.printClassCreation_Customer1();


//        System.out.println(customer1.printClassCreation_Customer2());
//        System.out.println(customer2.printClassCreation_Customer2());
//        System.out.println(customer3.printClassCreation_Customer2());

        String typeOfCustomer1 = customer1.frequentCustomer();
        String typeOfCustomer2 = customer2.nonFrequentCustomer();

        System.out.println(customer1.whatName() + " is a " + typeOfCustomer1 + " customer.");
        System.out.println(customer2.whatName() + " is a " + typeOfCustomer2 + " customer.");
    }
}