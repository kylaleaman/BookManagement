package src;
/**
 * Represents a book in the library system.
 */
public class Book implements Borrowable {
    // Properties
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numCopies;
    private Status status;

    // Constructors

    /**
     * Constructs a book with the given details.
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN (International Standard Book Number) of the book.
     * @param publisher The publisher of the book.
     * @param numCopies The number of copies available for the book.
     */
    public Book(String title, Author author, String ISBN, String publisher, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numCopies = numCopies;
        this.status = Status.AVAILABLE;
    }

    // Getters and Setters
    /**
     * Gets the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the title of the book.
     * @param title The title of the book to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     * @param author The author of the book to set.
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Gets the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     * @param ISBN The ISBN of the book to set.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the publisher of the book.
     * @return The publisher of the book.
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the publisher of the book.
     * @param publisher The publisher of the book to set.
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets the number of copies available for the book.
     * @return The number of copies available for the book.
     */
    public int getNumCopies() {
        return numCopies;
    }

    /**
     * Sets the number of copies available for the book.
     * @param numCopies The number of copies available for the book to set.
     */
    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    /**
     * Gets the status of the book (e.g., available, checked out).
     * @return The status of the book.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the book (e.g., available, checked out).
     * @param status The status of the book to set.
     */
    public void setStatus(Status status) {
        this.status = status;
    }


    // Borrowable Interface

    /**
     * Marks the book as borrowed and updates the number of copies available.
     */
    @Override
    public void borrow() {
        if (status == Status.AVAILABLE) {
            numCopies--;
            status = Status.CHECKED_OUT; 
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book unavailable.");
        }
    }

    /**
     * Marks the book as returned and updates the number of copies available.
     */
    @Override
    public void returnBook() {
        numCopies++;
        status = Status.AVAILABLE; 
        System.out.println("Book returned successfully");
    }
}

