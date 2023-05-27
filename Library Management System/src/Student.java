import java.util.ArrayList;

public class Student {
    private String name;
    private int ID;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + this.name + ", ID: " + this.ID + ", Borrowed Books: " + this.borrowedBooks.toString());
    }

    public void borrowBook(Book book) {
        if (book.getNumCopies() > 0) {
            this.borrowedBooks.add(book);
            book.borrow();
        } else System.out.println("No book!");
    }

    public void returnBook(Book book) {
        if (this.borrowedBooks.contains(book)) {
            book.returnBook();
            this.borrowedBooks.remove(book);
        } else System.out.println("This book was not borrowed!");
    }
}
