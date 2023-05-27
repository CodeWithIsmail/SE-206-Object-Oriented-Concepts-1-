public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int numCopies;

    public Book(String title, String author, String ISBN, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.numCopies = numCopies;
    }

    public void display() {
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", ISBN: " + this.author + ", Quantity: " + this.numCopies);
    }

    @Override
    public String toString() {
        return
                "title: " + title +
                        ", author: " + author +
                        ", ISBN: " + ISBN +
                        ", numCopies: " + numCopies;
    }

    public void borrow() {
        this.numCopies--;
    }

    public void returnBook() {
        this.numCopies++;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public String getTitle() {
        return title;
    }
}
