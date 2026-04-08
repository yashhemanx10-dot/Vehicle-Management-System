package Task2;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.numberOfDoors = doors;
    }

    @Override
    public void displayInfo(){
        super.displayInfo() ;
        System.out.println("Doors: " + numberOfDoors);

    }

    @Override
    public double calculateMaintenanceCost() {
        if (year <= 2005){
            return (2025 - year) * 200.0; // Older cars cost more
        }else if (year <= 2015){
            return (2025 - year) * 175.0;
        }else {
            return (2025 - year) * 150.0;
        }
    }


}
