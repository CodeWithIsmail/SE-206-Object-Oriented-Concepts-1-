import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    public Library(ArrayList<Book> books, ArrayList<Student> students) {
        this.books = books;
        this.students = students;
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public Book findBook(String title) {
        Book targetBook = null;
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return targetBook;
    }

    public void borrowBook(String title, Student student) {
        for (Book book : books) {
            if (book.getTitle().equals(title) == true && book.getNumCopies() > 0) {
                addStudent(student);
                book.borrow();
                return;
            }
        }
        System.out.println("No Book!");
    }

    public void returnBook(String title, Student student) {
        boolean check = false;
        for (Student targetStudents : students) {
            if (targetStudents.getName().equals(student.getName()) == true) {
                for (Book book : books) {
                    if (book.getTitle().equals(title) == true) {
                        book.returnBook();
                        students.remove(targetStudents);
                        check = true;
                        break;

                    }
                }
                if (check) break;
            }
        }
        if (!check) System.out.println("This student didn't borrow this book");
    }
}
