package Class_Object_Constructor_Practice;

public class Counter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println( counter.startValue);

        System.out.println("\n");

        int i;
        for( i = 0; i < 10; i++ ) {
            counter.increase();
          System.out.println( "Counter + " + counter.startValue);
        }

        System.out.println("\n");

        for( i = 0; i < 10; i++ ) {
            counter.decrease();
            System.out.println( "Counter - " + counter.startValue);
        }

        System.out.println("\n");

        for( i = 0; i < 10; i++ ) {
            counter.increase(2);
            System.out.println( "Counter + " + counter.startValue);
        }

        System.out.println("\n");

        for( i = 0; i < 10; i++ ) {
            counter.decrease(2);
            System.out.println( "Counter - " + counter.startValue);
        }









    }

 private Integer startValue;



    public Counter () {
        startValue = 0;
    }

    public Integer value() {
        return startValue;
    }
    public void increase() {
       this.startValue = this.startValue + 1;
    }

    public void decrease() {
        this.startValue = this.startValue - 1;

    }
    public void increase(Integer increaseBy) {
        startValue += increaseBy;
    }

    public void decrease(Integer decreaseBy) {
        if ( startValue > 0 ) {
            startValue -= decreaseBy;
        }
        else {
            System.out.println("Can not perform operation");
        }
    }


}
