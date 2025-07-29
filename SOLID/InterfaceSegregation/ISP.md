# Interface Segregation Principle

- **Clients should not be forced to depend upon interfaces that they do not use.**
- Prefer many small, specific interfaces over one large general-purpose interface.


- When a Class is required to perform actions that are not useful, it is wasteful and may produce unexpected bugs if the
  Class does not have the ability to perform those actions.
- A Class should perform only actions that are needed to fulfil its role. Any other action should be removed completely
  or moved somewhere else if it might be used by another Class in the future.

- Which means, Instead of one fat interface many small interfaces are preferred based on groups of methods with each one
  serving one submodule.
