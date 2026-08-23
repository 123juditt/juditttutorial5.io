class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("--- General Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    public Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    
    public void display() {
        System.out.println("--- Technical Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    public Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    public void display() {
        System.out.println("--- Story Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}

public class Main {
    public static void main(String[] args) {
        Book ref;

        ref = new Book("The Alchemist", "Paulo Coelho");
        ref.display();
        System.out.println();

        ref = new Technical("Core Java", "Cay S. Horstmann", "Computer Science");
        ref.display();
        System.out.println();

        ref = new Story("Harry Potter", "J.K. Rowling", "Fiction", "Fantasy");
        ref.display();
    }
}
