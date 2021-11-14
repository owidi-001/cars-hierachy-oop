public class TestPhase2 {

    public static void main(String[] args) {

        // 2 carTypes
        CarType carType1;
        CarType carType2;
        carType1 = new CarType("Dodge", "Neon", 1997, "Purple");
        carType2 = new CarType("Chevrolet", "Impala", 2006, "Silver");

        // Instantiate three Cars based on two carTypes
        Car car1 = new Car(carType1);
        Car car2 = new Car(carType1);
        Car car3 = new Car(carType2);

        System.out.println("New Cars:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();

        //rent out a car to change the availability
        System.out.println("Renting: " + car2);
        car2.rentCar();
        System.out.println("Is the car still available? " + car2.isAvailable());


        // Print out all current cars
        System.out.println("Current Cars:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();


        //return a car to change the availability
        System.out.println("Returning: " + car2);
        car2.returnCar();

        // Print out all current cars
        System.out.println("Current Cars:");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println();

        // Print out comparisons
        System.out.println("Is the ID for car2 20210001? " + car2.matches(20210001));
        System.out.println("Is the ID for car2 20210002? " + car2.matches(20210002));

    }

}