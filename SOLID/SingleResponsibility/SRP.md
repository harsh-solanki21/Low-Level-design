# Single Responsibility Principle

- **A class should have one, and only one, reason to change.**


- If a Class has many responsibilities, it increases the possibility of bugs because making changes to one of its
  responsibilities, could affect the other ones without you knowing.


- Requirements change over time. Each of them also changes the responsibility of at least one class. The more
  responsibilities your class has, the more often you need to change it. If your class implements multiple
  responsibilities, they are no longer independent of each other.

### A Simple Question to Validate Your Design

- You can avoid the problems by asking a simple question before you make any changes: What is the responsibility of your
  class/component/microservice?

- If your answer includes the word “and”, you’re most likely breaking the single responsibility principle. Then it’s
  better to take a step back and rethink your current approach. There is most likely a better way to implement it.

### How to Recognize a Break of the SRP?

- Class Has Too Many Dependencies.
- A constructor with too many input parameters implies many dependencies (hopefully you do inject dependencies). Another
  way too see many dependencies is by the test class. If you need to mock too many objects, it usually means breaking
  the SRP.
- Method Has Too Many Parameters
- Same as the class’s smell. Think of the method’s parameters as dependencies.
- How easy is it to name the class? If a class is difficult to name, it is probably doing too much.
- How many public methods does the class have? 7+/-2 is a good rule of thumb. If the class has more than that, you
  should think about splitting it into several classes.
- Are there cohesive groups of public methods used in separate contexts?
- How many private methods or data members are there? If the class has a complex internal structure, you probably should
  refactor it so that the internals are packaged into separate smaller classes.
- And the easiest rule of thumb: how big is the class? If you have a C++ header file containing a single class that is
  more than a couple of hundred lines long, you should probably split it up.