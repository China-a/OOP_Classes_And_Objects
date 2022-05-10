package Lesson;

public class ClassCreation_Customer {
   private String name;
    private int age;

    // the class constructor
    public ClassCreation_Customer(String customerName) {
        this.age = 0;
        this.name = customerName;

    }
    // This method prints out the class constructor
    public void printClassCreation_Customer1() {
        if (customerIsOver21()) {
            System.out.println("the customer's name is " + this.name + " and their age is " + this.age);
        }
    }

    // This method prints out the class constructor and allows a little more functionality if this method has to change or be modified by another method
    public String printClassCreation_Customer2() {
        return "the customer's name is " + this.name + " and their age is " + this.age;
    }

    public void howOld(int customerAge) {
        this.age = customerAge;
    }
    public String whatName(){
        return this.name;
    }

    public String frequentCustomer() {
        return "frequent";
    }

    public String nonFrequentCustomer() {
        return "non-frequent";
    }

    public boolean customerIsOver21() {
        if (this.age < 21) {
            return false;
        }

        return true;
    }

        /*
     You could also write the method like this:

    public boolean customerIsOver21() {
        return this.age >= 21;
    }
    */
}

