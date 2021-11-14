import java.util.Arrays;



public class Dealership {
    private static final int MAX_LIST_LENGTH = 1000;

    Car[] cars=new Car[MAX_LIST_LENGTH];
    private int max_cars;

    private String name;

    public static final int NOT_FOUND=0;

    /*** basic accessors ***/
    public String getName() {
        return name;
    }

    public Dealership(String name, int max_cars){
        this.name=name;
        this.max_cars=max_cars;
    }

    public void newAcquisition(CarType carType) {
        Car car=new Car(carType);
        cars[max_cars]=car;
        max_cars++;
    }

    @Override
    public String toString() {
        return  "\n"+name+ "\n" +
                Arrays.toString(cars);
    }

    // Search car of a given type
    private Car getAvailable(CarType carType){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getType().equals(carType)){
                return cars[i];
            }
        }
        return null;
    }


    // Get car position
    private int findCar(int id){
        for (int i = 0; i < cars.length; i++)
        {
            if (cars[i].getId()==id){
                return i;
            }
        }
        return NOT_FOUND;
    }

    public int rentType(CarType carType) {
        for (Car car : cars) {
            if (car.getType().equals(carType)) {
                car.getId();
                break;
            }

        }
        return NOT_FOUND;
    }


    public boolean returnCar(int id){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i]==cars[findCar(id)]){
                return true;
            }
        }
        return false;
    }

    public int getNumberAvailable(CarType carType){
        int count=0;
        int j=0;

        while (j<cars.length){
            if (cars[j]==getAvailable(carType)){
                count++;
            }
            j++;
        }

        return count;
    }

}