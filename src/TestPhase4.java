public class TestPhase4 {

  public static void main(String[] args) {

    Dealership dealer1 = new Dealership("Honest Jon's Auto Emporium", 6);
    Dealership dealer2 = new Dealership("University of Manitoba Automobiles", 12);

    // 4 different CarTypes
    CarType type1;
    CarType type2;
    CarType type3;
    CarType type4;

    // Instantiate the first CarType and display the contents
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

    // Find and Print all instances of CarType type2
    type2.findInstances();
    System.out.println();

    // Find and Print all instances of CarType type4
    type4.findInstances();
    System.out.println();

    // Print available copies of type2 at dealer1, rent one out, and print updated count
    System.out.println("Renting: " + type2 + " from " + dealer1.getName());
    int carID1 = dealer1.rentType(type2);
    if(carID1 != Dealership.NOT_FOUND){
      System.out.println("Got it!");
    } else {
      System.out.println("+!!!+ Did not get the car! +!!!+");
    }
    System.out.println();

    // Find and Print all instances of CarType type2
    // Should now have one less
    type2.findInstances();
    System.out.println();

    // Print available copies of type4 at dealer2, rent one out, and print updated count
    System.out.println("Renting: " + type4 + " from " + dealer2.getName());
    int carID2 = dealer2.rentType(type4);
    if(carID2 != Dealership.NOT_FOUND){
      System.out.println("Got it!");
    } else {
      System.out.println("+!!!+ Did not get the car! +!!!+");
    }
    System.out.println();

    // Find and Print all instances of CarType type4
    // Should now have one less
    type4.findInstances();
    System.out.println();

    // Print available copies of type4 at dealer2
    // Now RETURN the car that was rented out
    System.out.println("Returning: " + type4 + " to " + dealer2.getName());
    boolean carReturn = dealer2.returnCar(carID2);
    if(carReturn){
      System.out.println("Returned!");
    } else {
      System.out.println("+!!!+ Did not return the car! +!!!+");
    }
    System.out.println();

    // Find and Print all instances of CarType type4
    // Should now be back top initial count
    type4.findInstances();
    System.out.println();

    // Print out Dealerships
    System.out.println(dealer1);
    System.out.println(dealer2);
  }

}