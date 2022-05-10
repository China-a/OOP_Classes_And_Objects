package Class_Object_Constructor_Practice;

public class MainProduct {
    public static void main(String[] args) {
Product product = new Product( "gas", 10, 4.00);


        System.out.println(product.printProduct());
        System.out.println(product.totalCost());

    }
}
