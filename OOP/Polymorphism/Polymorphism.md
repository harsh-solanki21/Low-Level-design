# Polymorphism

- Polymorphism means having more than one form.
- Polymorphism allows us to perform a single action in different ways.
  In other words, Polymorphism allows you to define one interface and have multiple implementations.

## Two types of polymorphism:

### 1. Compile-time/Static Polymorphism

- Also known as: Static binding, Early binding, Overloading
- Features:
    - Methods share the same name with different parameters or signatures
    - Can have different return types
- Faster execution

### 2.Run-time/Dynamic Polymorphism

- Also known as: Dynamic binding, Late binding, Overriding
- Features:
    - Same method name and parameters in a class and its subclass
    - Java decides at runtime which method to call
- Slower execution

<br />

### Key Points

- Runtime polymorphism occurs in inheritance when parent and child classes have the same method
- `final` keyword prevents method overriding
- All classes implicitly extend `Object` class
- Static methods:
    - Can be inherited but not overridden
    - Always call the base class method, regardless of object type
    - Cannot be overridden because they don't depend on objects
