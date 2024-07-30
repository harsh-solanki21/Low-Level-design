# OOP (Object Oriented Programming)

- Object-Oriented Programming is a methodology/paradigm to design a program using classes and objects. It simplifies the
  software development and maintenance by providing some concepts.

<br />

- `Class` is a user-defined data type which defines its own properties and functions. Class is the only logical
  representation of the data.
  <br />
  **Example:** Human being is a class. The body parts of a human being are its properties, and
  the actions performed by the body parts are known as functions.

> The class does not occupy any memory space till the time an object is instantiated.

<br />

- `Object` is a run-time entity. It is an instance of the class. An object can represent a person, place or any other
  item. An object can operate on both data members and member functions.

<br />

## OOP Concepts:

|                |                              |
|----------------|------------------------------|
| 	Polymorphism  | (Overload, Override)         
| 	Encapsulation | (setter, getter, innerClass) 
| 	Inheritance   | (extends , Override)         
| 	Abstraction   | (abstract class , interface) 

>
> ```java
> Engine car = new Car();
> ```
> What things can you access is depends on `Engine` class. (we can only access things that Engine class contains)
>
> Which one of those versions (between parent class version and child class version) to access is depends on `Car()`.

- All the primitive data types are pass by value.
- All non-primitive(objects) are pass by reference.
- Variables inside the class is called instance variable.

<br />

## Access Modifiers

| Modifier  | Class | Package | Subclass <br/>(same pkg) | Subclass <br/>(diff pkg) | World <br/>(diff pkg & not subclass) |
|-----------|-------|---------|--------------------------|--------------------------|--------------------------------------|
| Public    | +     | +       | +                        | +                        | +                                    |
| Protected | +     | +       | +                        | +                        |                                      |
| Default   | +     | +       | +                        |                          |                                      |
| Private   | +     |         |                          |                          |                                      |

<br />

## Abstraction vs. Encapsulation

| Aspect  | Abstraction                                         | Encapsulation                                 |
|---------|-----------------------------------------------------|-----------------------------------------------|
| Focus   | Hides unwanted details, shows essential information | Hides internal details/mechanics for security |
| Purpose | Focuses on what an object must contain              | Binds code and data into a single unit        |
| Level   | Solves issues at the design level                   | Solves issues at the implementation level     |

<br />

**Key Differences:**

1. Abstraction is about simplifying complex systems by showing only relevant details.
2. Encapsulation is about protecting the internal workings of an object.
3. Abstraction is a design-level concept, while encapsulation is an implementation-level concept.

<br />

## Enums

An enum is a special type that represents a group of constants (unchangeable variables, similar to final variables).

### Purpose of Enums

Enums allow a variable to be set to one of a predefined set of constants.

### Use Cases

Enums are useful when all possible values are known at compile-time, such as:

- Compass directions (NORTH, SOUTH, EAST, WEST)
- Menu choices
- State machines

### Example

```java
enum Direction {
    NORTH, SOUTH, EAST, WEST
}
```

### Key Points

1. Enums improve type safety
2. They provide a way to define a fixed set of constants
3. Useful for representing conceptually similar things
4. Help in writing more readable and maintainable code
