public class TestPhase1 {

    public static void main(String[] args) {

        // 3 Cars
        CarType carType1;
        CarType carType2;
        CarType carType3;
        System.out.println("Created three car instances");

        // Instantiate the first carType and display the contents
        carType1 = new CarType("Dodge", "Neon", 1997, "Purple");
        System.out.println("Car1: " + carType1);

        // Instantiate the second carType and display the contents
        carType2 = new CarType("Chevrolet", "Impala", 2006, "Silver");
        System.out.println("Car2: " + carType2);

        // Instantiate the third carType and display the contents
        carType3 = new CarType("Dodge", "Neon", 1997, "Purple");
        System.out.println("Car3: " + carType3);
        System.out.println();

        // Try out the equals method
        System.out.println("Are carType1 and carType2 equal? " + carType1.equals(carType2));

        // Try out the equals method
        System.out.println("Are carType1 and carType3 equal? " + carType1.equals(carType3));
        System.out.println();
    }

}