# Association (-- / -->)

- An association describes the relationship between two independent classes.
- An association relationship between two classes is a `has a` relationship.

## Types of Association:

**1. Unidirectional Association (A --> B)**

- This association is the one in which one class is aware and associated with another class; the reverse is not true.

- For example, the Student class can be associated with the LibraryCard class, for the association where the student has
  a library card; a LibraryCard does not need to ‘know about’ a Student.

**2. Bidirectional Association (A -- B)**

- The classes are aware of each other and interact with one another.
- For example, a Teacher class and a Classroom class
  may be associated bidirectionally; there would be a teacher assigned to a classroom, and a classroom would know to
  which teacher it is assigned.

## Code Examples

### One-to-One Association

- Each student has only one unique student ID card in a school system, which is a type of one-to-one association.

```java
class Student {
    String name;
    int studentId;

    Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
}

class StudentIDCard {
    int card_Number;
    Student owner;

    StudentIDCard(int cardNumber, Student owner) {
        this.cardNumber = cardNumber;
        this.owner = owner;
    }
}
```

<br />

### One-to-Many Association

- A teacher at the school teaches various subjects to various students, implying a one-to-many association between the
  teacher and the students.

```java
class Teacher {
    String name;
    String subject;

    Teacher(string name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}

class Student {
    String name;
    Teacher teacher;

    Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
```

<br />

### Many-to-One Association

- Consider an employee in an office who has to interact with multiple departments, such as finance, human resources, and
  management.

- Consider a school with multiple classes, and in each class, many students are studying together. This is a Many-to-one
  association.

```java
class SchoolClass {
    String className;
    List<Student> students;

    SchoolClass(String className) {
        this.className = className;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

class Student {
    String name;
    SchoolClass schoolClass;

    Student(String name, SchoolClass schoolClass) {
        this.name = name;
        this.schoolClass = schoolClass;
    }
}
```

<br />

### Many-to-Many Association

- There are many extracurricular activities that students in the school take part in, and each activity includes several
  students. This example depicts the many-to-many association, as all the students are linked to many activities
  happening in school.

```java
class Student {
    String name;
    List<Activity> activities;

    Student(String name) {
        this.name = name;
        activities = new ArrayList<>();
    }

    void addActivity(Activity activity) {
        activities.add(activity);
    }
}

class Activity {
    String activityName;
    List<Student> participants;

    Activity(String activityName) {
        this.activityName = activityName;
        participants = new ArrayList<>();
    }

    void addParticipant(Student student) {
        participants.add(student);
    }
}
```
