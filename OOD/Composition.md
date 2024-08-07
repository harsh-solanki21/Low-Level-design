# Composition (◆--)

- Composition is the practice of creating other class objects in your class. In such a scenario, the class which creates
  the object of the other class is known as the owner and is responsible for the lifetime of that object.

- Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.

- One class is part of another and cannot exist independently. The lifetime of the owned object depends on the lifetime
  of the owner.

- It is referred as `Belongs-To` or `part-of` association.

## Code Example

- A car is composed of an engine, tires, and doors. In this case, a Car owns these objects so a Car is an Owner class
  and tires , doors and engine classes are Owned classes.

**Example 1**

```java
class Engine {
    private int capacity;

    public Engine() {
        capacity = 0;
    }

    public Engine(int cap) {
        capacity = cap;
    }

    public void engineDetails() {
        System.out.println("Engine details: " + capacity);
    }
}

class Tires {
    private int noOfTires;

    public Tires() {
        noOfTires = 0;
    }

    public Tires(int nt) {
        noOfTires = nt;
    }

    public void tireDetails() {
        System.out.println("Number of tyres: " + noOfTires);
    }
}

class Doors {
    private int noOfDoors;

    public Doors() {
        noOfDoors = 0;
    }

    public Doors(int nod) {
        noOfDoors = nod;
    }

    public void doorDetails() {
        System.out.println("Number of Doors: " + noOfDoors);
    }
}

class Car {
    private Engine engine;
    private Tires tire;
    private Doors door;
    private String color;

    public Car(String col, int engineCapacity, int tires, int doors) {
        this.engine = new Engine(engineCapacity);
        this.tire = new Tires(tires);
        this.door = new Doors(doors);
        color = col;
    }

    public void carDetail() {
        engine.engineDetails();
        tire.tireDetails();
        door.doorDetails();
        System.out.println("Car color: " + color);
    }
}


class Main {
    public static void main(String[] args) {
        Car car = new Car("Black", 1600, 4, 4);
        car.carDetail();
    }
}

// Output:
// Engine details: 1600
// Number of tyres: 4
// Number of Doors: 4
// Car color: Black
```

<br />

**Example 2**

```java
class Car {
    private int id;
    private String model;
    private String color;

    public void carFeatures() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Toyota extends Car {
    public void setStart() {
        ToyotaEngine engine = new ToyotaEngine();
        engine.start();
    }
}

class ToyotaEngine {
    public void start() {
        System.out.println("Engine has been started.");
    }

    public void stop() {
        System.out.println("Engine has been stopped.");
    }
}


public class Main {

    public static void main(String[] args) {
        Toyota t = new Toyota();
        t.setModel("Fortuner");
        t.setColor("Corolla");
        t.carFeatures();
        t.setStart();
    }

}

// Output:
// Car Model: Fortuner
// Car Color: Corolla
// Engine has been started.
```
