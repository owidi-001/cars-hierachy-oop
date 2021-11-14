public class Car{
    private CarType type;
    private boolean available;
    private static int id = 20210001;

    /**
     * a constructor that takes the type
     **/
    public Car(CarType type) {
        this.type = type;
        this.id = id++;
    }

    /*** basic accessors
     * @return***/

    public CarType getType() {
        return this.type;
    }

    public int getId() {
        return this.getId();
    }

    public boolean isAvailable() {
        return this.available;
    }

    /**
     * methods
     **/
    public void returnCar() {
        this.available = true;
    }

    public void rentCar() {
        this.available = false;
    }

    public boolean matches(int i) {
        if (this.id == i) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "" +
                type +
                ", " + available;
    }
}