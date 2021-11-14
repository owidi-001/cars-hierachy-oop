public class TestPhase3 {

    public static void main(String[] args) {

        // 2 different Dealerships
        Dealership dealer1 = new Dealership("Honest Jon's Auto Emporium", 6);
        Dealership dealer2 = new Dealership("University of Manitoba Automobiles", 12);

        // 4 different carTypes
        CarType type1;
        CarType type2;
        CarType type3;
        CarType type4;
        type1 = new CarType("Dodge", "Neon", 1997, "Purple");
        type2 = new CarType("Chevrolet", "Impala", 2006, "Silver");
        type3 = new CarType("Plymouth", "Grand Voyageur", 1999, "Silver/White");
        type4 = new CarType("Nissan", "Rogue", 2014, "Ruby Red");

        // Add 5 Cars of types 1-3 to dealer1
        // 1 type1, 3 type2s, 1 type3
        dealer1.newAcquisition(type1);
        dealer1.newAcquisition(type2);
        dealer1.newAcquisition(type2);
        dealer1.newAcquisition(type3);
        dealer1.newAcquisition(type2);

        // Add 3 Cars of types 1,2,4 to dealer2
        dealer2.newAcquisition(type1);
        dealer2.newAcquisition(type2);
        dealer2.newAcquisition(type4);

        // Print out Dealerships
        System.out.println(dealer1);
        System.out.println(dealer2);

        // Print available instance of type2, rent one out, and print updated count
        System.out.println("Available instances of " + type2 + " at " + dealer1.getName() + ": " + dealer1.getNumberAvailable(type2));
        System.out.println("Renting: " + type2 + " from " + dealer1.getName());
        int carID1 = dealer1.rentType(type2);
        if(carID1 != Dealership.NOT_FOUND){
            System.out.println("Got it!");
        } else {
            System.out.println("+!!!+ Did not get the car! +!!!+");
        }
        System.out.println();
        System.out.println("Available instances of " + type2 + " at " + dealer1.getName() + ": " + dealer1.getNumberAvailable(type2));
        System.out.println();

        // Print out dealer1 to see updated Car availability status
        System.out.println(dealer1);

        // Repeat the above block of code:
        // Print available instances of type2 at dealer1, rent one out, and print updated count
        System.out.println("Renting: " + type2 + " from " + dealer1.getName());
        int carID2 = dealer1.rentType(type2);
        if(carID2 != Dealership.NOT_FOUND){
            System.out.println("Got it!");
        } else {
            System.out.println("+!!!+ Did not get the car! +!!!+");
        }
        System.out.println();
        System.out.println("Available instances of " + type2 + " at " + dealer1.getName() + ": " + dealer1.getNumberAvailable(type2));
        System.out.println();

        // Print out dealer1 to see updated Car availability status
        System.out.println(dealer1);

        // Print available instances of type2 at dealer1
        // Now RETURN one of the cars that was rented out
        System.out.println("Returning: " + type2 + " to " + dealer1.getName());
        boolean carReturn = dealer1.returnCar(carID1);
        if(carReturn){
            System.out.println("Returned!");
        } else {
            System.out.println("+!!!+ Did not return the car! +!!!+");
        }
        System.out.println();

        // Print out dealer1 to see updated Car availability status
        System.out.println(dealer1);

    }

}