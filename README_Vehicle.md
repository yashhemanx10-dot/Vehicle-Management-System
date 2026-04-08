# Vehicle Management System

A Java OOP project that models a fleet of vehicles using core object-oriented programming principles including **abstraction**, **inheritance**, and **polymorphism**.

---

## Project Structure

```
Task2/
├── Vehicle.java        # Abstract base class
├── Car.java            # Extends Vehicle
├── Motorcycle.java     # Extends Vehicle
├── Truck.java          # Extends Vehicle
└── task2/
    └── main.java       # Entry point
```

---

## How It Works

The project is built around an abstract `Vehicle` class that defines shared properties and behaviour for all vehicle types. Each subclass extends `Vehicle` and provides its own implementation of the maintenance cost calculation.

### Class Overview

| Class | Type | Description |
|---|---|---|
| `Vehicle` | Abstract class | Base class with shared fields and abstract method |
| `Car` | Subclass | Adds number of doors, age-based maintenance tiers |
| `Motorcycle` | Subclass | Adds seat count and engine type |
| `Truck` | Subclass | Adds cargo capacity, higher maintenance rate |
| `main` | Entry point | Creates a Vehicle array and loops through it polymorphically |

---

## OOP Concepts Demonstrated

- **Abstraction** — `Vehicle` is abstract and defines `calculateMaintenanceCost()` as an abstract method, forcing all subclasses to provide their own implementation
- **Inheritance** — `Car`, `Motorcycle`, and `Truck` all extend `Vehicle` and reuse its constructor and `displayInfo()` method via `super`
- **Polymorphism** — All vehicles are stored in a `Vehicle[]` array and iterated with a single loop, calling the correct overridden method for each type at runtime
- **Encapsulation** — Subclass-specific fields (e.g. `numberOfDoors`, `cargoCapacity`) are declared `private`

---

## Maintenance Cost Logic

Each vehicle type calculates maintenance cost differently based on age (`2025 - year`):

| Vehicle | Rate per year |
|---|---|
| Car (pre-2005) | $200 |
| Car (2006–2015) | $175 |
| Car (post-2015) | $150 |
| Motorcycle | $100 |
| Truck | $300 |

---

## How to Run

```
javac Task2/*.java Task2/task2/main.java
java Task2.task2.main
```

**Example output:**
```
2020, Toyota, Camry
Doors: 4
Maintenance: $750.0

2021, Honda, CBR
numOfSeats: 2 EngineType: Parallel-twin
Maintenance: $400.0

2019, Ford, F-150
cargoCapacity: 1500
Maintenance: $1800.0
```

---

## Technologies Used

- **Language:** Java
- **IDE:** IntelliJ IDEA
- **Concepts:** Abstract classes, inheritance, method overriding, polymorphism, encapsulation, packages

---

## Author

Developed as part of university programming assignments.
