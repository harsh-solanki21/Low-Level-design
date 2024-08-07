# Aggregation (◇--)

- Aggregation is a special form of association where a "whole" class has a relationship with its "parts." It represents
  a `has-a` or `contains` relationship.

- It is a `unidirectional` association.

- Both entries can survive individually which means ending one entity will not affect the other entity.

## Code Example

- The Library is the Aggregate class, which contains references to many Book objects considered parts of the Library.
  The Library is responsible for managing the collection of books, but the existence of a book does not depend on the
  Library.

**Example 1**
```java
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    List<Book> books;

    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    List<Book> getAllBooks() {
        return books;
    }
}


public class LibraryExample {

    public static void main(String[] args) {
        Library library = new Library("College Library");

        Book book1 = new Book("Harry Potter and the Sorcerer’s Stone", "J.K.Rowling");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in " + library.name + ":");
        for (Book book : library.getAllBooks()) {
            System.out.println("Title: " + book.title + ",Author: " + book.author);
        }

        library.removeBook(book2);

        System.out.println("Books in " + library.name + "after removing a book:");
        for (Book book : library.getAllBooks()) {
            System.out.println("Title: " + book.title + ",Author: " + book.author);
        }
    }

}

// Output:
// Books in College Library:
// Title: Harry Potter and the Sorcerer’s Stone, Author: J.K. Rowling
// Title: To Kill a Mockingbird, Author: Harper Lee
// Books in College Library after removing a book:
// Title: Harry Potter and the Sorcerer’s Stone, Author: J.K. Rowling
```

<br />

**Example 2**

```java
class Player {
    private int id;
    private String team;
    private String name;

    Player(String name, int id, String team) {
        this.name = name;
        this.id = id;
        this.team = team;
    }
}

class Team {
    private List<Player> players;
    private String name;

    Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }
}

class School {
    private List<Team> teams;
    private String schoolName;

    School(String schoolName, List<Team> teams) {
        this.schoolName = schoolName;
        this.teams = teams;
    }

    public int getTotalPlayersInSchool() {
        int playersCount = 0;
        for (Team team : teams) {
            List<Player> players = team.getPlayers();
            for (Player p : players) {
                playersCount++;
            }
        }
        return playersCount;
    }
}


public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("Harris", 1, "Red");
        Player p2 = new Player("Carol", 2, "Red");
        Player p3 = new Player("Johnny", 1, "Blue");
        Player p4 = new Player("Sarah", 2, "Blue");

        List<Player> redPlayers = new ArrayList<>();
        redPlayers.add(p1);
        redPlayers.add(p2);

        List<Player> bluePlayers = new ArrayList<>();
        bluePlayers.add(p3);
        bluePlayers.add(p4);

        Team red = new Team("Red", redPlayers);
        Team blue = new Team("Blue", bluePlayers);

        List<Team> teams = new ArrayList<>();
        teams.add(red);
        teams.add(blue);

        School mySchool = new School("ABC", teams);
        System.out.print("Total players in my school: ");
        System.out.println(mySchool.getTotalPlayersInSchool());
    }

}

// Output:
// Total players in my school: 4
```
