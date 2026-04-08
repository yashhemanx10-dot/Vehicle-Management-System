package Task2.task2;

import Task2.Vehicle;
import Task2.Car;
import Task2.Motorcycle;
import Task2.Truck;

public class main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota", "Camry", 2020, 4),
                new Motorcycle("Honda", "CBR", 2021, 2,"Parallel-twin"),
                new Truck("Ford", "F-150", 2019, 1500)
                };

        for (Vehicle v : vehicles) {
            v.displayInfo(); // Calls overridden method
            System.out.println("Maintenance: $" + v.calculateMaintenanceCost() + "\n");
        }

    }
}
