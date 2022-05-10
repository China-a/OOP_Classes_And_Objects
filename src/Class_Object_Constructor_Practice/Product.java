package Class_Object_Constructor_Practice;

public class Product {
    private String productName;
    private Integer productQuantity;
    private Double productCost;

public Product( String productName, Integer productQuantity, Double productCost) {
    this.productName = productName;
    this.productQuantity = productQuantity;
    this.productCost = productCost;
}

public String totalCost( ) {
    return "Total cost is $" + productCost * productQuantity;
}

public String printProduct() {
return "Gallon of " + productName + " costs $" + productCost + " and " + productQuantity + " units were purchased";
}
}
