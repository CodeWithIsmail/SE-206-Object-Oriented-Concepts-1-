import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Teach Yourself C", "Herbert Schildt", "783-234-90", 90);
        Book book2 = new Book("Java Programming", "Bajlur Rahman", "123-908-90", 15);
        Book book3 = new Book("Statistics", "Sheldon Ross", "234-897-23", 45);

        book1.display();
        book2.display();
        book3.display();

        book1.borrow();
        book1.display();
        book2.returnBook();
        book2.display();

        Student st1 = new Student("Ismail", 1433);
        Student st2 = new Student("Nandan", 1436);
        Student st3 = new Student("Ayon", 1421);

        st1.borrowBook(book1);
        st2.borrowBook(book2);
        st2.borrowBook(book3);
        st3.returnBook(book1);
        st1.returnBook(book1);

        st1.display();
        st2.display();
        st3.display();

        ArrayList<Book> borrowedBooks = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Library iitLibrary = new Library(borrowedBooks, students);
        iitLibrary.addStudent(st1);
        iitLibrary.addBook(book2);
        iitLibrary.addBook(book3);
        iitLibrary.displayBooks();
        iitLibrary.borrowBook("Java Programming", st1);
        iitLibrary.returnBook("Java Programming", st2);
        iitLibrary.displayBooks();

    }
}