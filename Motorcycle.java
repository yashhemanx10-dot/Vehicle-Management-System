package Task2;

public class Motorcycle extends Vehicle{

    private int numOfSeats;
    private String EngineType;

    public Motorcycle(String brand, String model, int year, int numOfSeats, String EngineType) {
        super(brand,model,year);
        this.numOfSeats = numOfSeats;
        this.EngineType = EngineType;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("numOfSeats: "  + numOfSeats + " EngineType: " + EngineType);
    }

    @Override
    public double calculateMaintenanceCost() {
        return (2025 - year) * 100.0;
    }
}
