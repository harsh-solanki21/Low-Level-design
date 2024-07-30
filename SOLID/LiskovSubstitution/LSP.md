# Liskov Substitution Principle

- **Child classes should never break the parent class type definitions.**
- **If S is a subtype of T, then objects of type T in a program may be replaced with objects of type S without altering
  any of the desirable properties of that program.**


- Which means, Derived types must be completely substitutable for their base types


- When a child Class cannot perform the same actions as its parent Class, this can cause bugs.
- If you have a Class and create another Class from it, it becomes a parent and the new Class becomes a child. The child
  Class should be able to do everything the parent Class can do. This process is called Inheritance.
- The child Class should be able to process the same requests and deliver the same result as the parent Class, or it
  could deliver a result that is of the same type.

### Implementation guidelines :

In the process of development we should ensure that

- No new exceptions can be thrown by the subtype unless they are part of the existing exception hierarchy.
- We should also ensure that Clients should not know which specific subtype they are calling, nor should they need to
  know that. The client should behave the same regardless of the subtype instance that it is given.
- And last but not the least, New derived classes just extend without replacing the functionality of old classes