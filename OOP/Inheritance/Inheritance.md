# Inheritance

## IS-A Relationship

- Parent and child classes have an "IS-A" relationship.
- Examples:
    - Student IS-A Person
    - Savings Account IS-A Account
    - Mountain Bike IS-A Bicycle
    - Tiger IS-A Animal

## Upcasting and Downcasting

**Upcasting (Implicit)**

```java
Cat c = new Cat();
Animal a = c; // Cat is an Animal
```

**Downcasting (Explicit)**

```java
Cat c = new Cat();
Animal a = c;
Cat c1 = (Cat) a; // Explicit cast
```

**Super Keyword**

- Used to refer to the immediate parent class of a child class.

**Multiple Inheritance**

- Java doesn't support multiple inheritance of classes.
- Reasons:
    - Ambiguity in method selection
    - Diamond Problem

**Method Overriding**

- Determined by the object's actual class at runtime.
- Example: If a Student object calls an overridden method, the Student class's version is executed.

**Variables in Inheritance**

- Variables don't override; they hide.
- Child class variables hide parent class variables of the same name.
- Hidden variables are considered in all descendant classes.
