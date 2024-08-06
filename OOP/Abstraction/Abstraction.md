# Abstraction

Abstraction hides complex details while showing only essential information, reducing programming complexity.

## Abstract Classes

- Declared using the `abstract` keyword
- Can contain both abstract (without body) and concrete (with body) methods
- Cannot be instantiated directly
- Must be extended; abstract methods must be overridden
- Can have constructors (non-abstract)
- Can have static methods

### Key Points:

- Normal classes cannot have abstract methods
- Abstract classes provide partial abstraction (vs. interfaces for complete abstraction)
- Cannot create abstract static methods (contradiction in terms)
- Cannot be declared as `final` (conflicts with inheritance requirement)

## Abstract Methods

**Syntax:**

```java
abstract void methodName(int parameters);
```

- Declared without implementation
- If a class has an abstract method, the class must be abstract

**Why Can't We Instantiate Abstract Classes?** <br />
Abstract classes often lack full method implementations, making direct instantiation impractical or meaningless.
<br />

**Example of a Concrete Method in an Abstract Class**

```java
abstract class Example {
    void concreteMethod() {
        // Method implementation
    }
}
```

This method can be called via an object and can be overridden in subclasses


<br />

# Interface

- An interface can have:
    - `abstract` method(s)
    - `default` method(s)
    - `static` method(s)
    - `public static final` variable(s)

- All the methods declared or implemented in an interface are by default
  `public` and all the variables are by default `public static final`.

**Note:** A class uses the keyword `implements` to use an interface but an
interface uses the keyword `extends` to use another interface.

### Decoupling

Decoupling refers to reducing dependencies between classes.

Benefits:

- Minimizes impact of changes
- Improves maintainability
- Enhances flexibility

Example: Car components (tires, steering) work together but aren't tightly coupled.

### Interfaces

Interfaces are abstract types specifying behaviors that classes must implement.

**Key Points:**

- Used to achieve decoupling
- Enable multiple inheritance of behavior
- Define a contract for implementing classes

**Syntax:**

```java
interface InterfaceName {
    // abstract method declarations
}

class ClassName implements InterfaceName {
    // method implementations
}
```

**Example**

```java
interface Polygon {
    void getArea();
}

class Rectangle implements Polygon {
    public void getArea() {
        int length = 5, breadth = 6;
        System.out.println("Area = " + (length * breadth));
    }
}
```

<br />

### Advantages of Interfaces

- Interfaces allow us to achieve 100% abstraction
- Support implementation of multiple interfaces
- Provide a way to achieve abstraction
- Enable loose coupling
- Facilitate easier testing and maintenance

### Why Use Interfaces?

1. Provide specifications for implementing classes
2. Achieve abstraction
3. Enable multiple inheritance of behavior

### Key Features

- Classes can implement multiple interfaces
- Interfaces can extend other interfaces
- Cannot be instantiated
- No constructors
- All methods are implicitly public and abstract
- All attributes are implicitly public, static, and final

### Example of Multiple Interface Implementation

```java
interface Line { /* ... */
}

interface Polygon { /* ... */
}

class Rectangle implements Line, Polygon { /* ... */
}
```

### Important Considerations

1. Use when classes are at the same conceptual level (e.g., Student and YouTuber)
2. Prefer over forced inheritance hierarchies
3. Implementing class must override all interface methods (unless abstract)
4. Avoid in performance-critical code (runtime resolution)

### Additional Points

- Static methods in interfaces require a body
- Overridden methods should have same or better access than interface method
- Interface methods are implicitly abstract and public
- Interfaces can extend other interfaces but not classes

### Best Practices

- Use interfaces to define common behavior across unrelated classes
- Implement multiple interfaces to combine different behaviors
- Use to achieve loose coupling in design

<br />

# Interface vs Abstract Class

| Interfaces                                | Abstract Classes                                        |
|-------------------------------------------|---------------------------------------------------------|
| Can have abstract method(s) only          | Can have concrete (non-abstract) &   abstract method(s) 
|
| Support multiple inheritance              | Don’t support multiple inheritance                      |
| All members are `public`                  | Can have `private` , `protected` and `public` members   |
| All data members are `static` and `final` | Can have non-static and non-final members too           |
| Can’t have constructors                   | Constructors can be defined                             |
