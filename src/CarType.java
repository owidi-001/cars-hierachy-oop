import java.util.Objects;

public class CarType {
    private String make;
    private String model;
    private int year;
    private String color;

    private Object[] dealers;
    private int references;

    /**
     * a constructor that takes the make, model, year, and number of wheels
     **/

    public CarType(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color=color;
    }

    public CarType(Object[] dealers,int references) {
        this.dealers= dealers;
        this.references=references;

    }
    /*** basic accessors ***/

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }
    public String getColor() {
        return this.color;
    }

    //    to string method
    @Override
    public String toString() {
        return "CarType:" +
                "" + make +
                ", " + model +
                ", " + year +
                ", " + color ;
    }

    //    checks equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarType)) return false;
        CarType carType = (CarType) o;
        return getYear() == carType.getYear() && getMake().equals(carType.getMake()) && getModel().equals(carType.getModel()) && getColor().equals(carType.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), getModel(), getYear(), getColor());
    }

    public void addDealership(Dealership dealership){
        Object[] temp;
        if (references == dealers.length)
        {
            //array too small - double its size
            temp = new Object [2*dealers.length];
            System.arraycopy(dealers, 0, temp, 0, dealers.length);
            dealers = temp;
        }
        dealers[references] = dealership;
        references++;
    }

    //    Add car to the list
    public void newAcquisition(CarType carType){
        Object[] temp;
        //insert object cartype into cars
        if (references == dealers.length)
        {
            //array too small - double its size
            temp = new Object [2*dealers.length];
            System.arraycopy(dealers, 0, temp, 0, dealers.length);
            dealers = temp;
        }
        dealers[references] = carType;
        references++;
    }

    public void findInstances(){
        for (Object dealer : dealers) {
            System.out.println(dealer);
        }
    }
}