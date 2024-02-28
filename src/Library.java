package src;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library containing books, authors and patrons
 */
public class Library{
    /** Lists of books in the library */
    private List<Book> books;
    /** Lists of authors in the library */
    private List<Author> authors;
    /** Lists of patrons in the library */
    private List<Patron> patrons;

   /**
    * Construct a new library with empty lists of books, authors, patrons
    */
    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    /**
     * Returns the list of books in the library
     * @return The list of books in the library
     */
    public List<Book> getBooks() {
        return books;
    }

    /**
     * Returns the list of patrons in the library.
     * @return The list of patrons in the library.
     */
    public List<Patron> getPatrons() {
        return patrons;
    }

    
    //Adding, editing and deleting books (including error handling)
    public void addBook(Book book) {
        if (book != null) {
            books.add(book);
            System.out.println("Book added successfully");
        } else {
            System.out.println("Error - book cannot be added");
        }
    }

    public void editBook(Book oldBook, Book newBook) {
        if (oldBook != null && newBook != null) {
            int index = books.indexOf(oldBook);
            if (index != -1) {
                books.set(index, newBook);
                System.out.println("Book updated successfully");
            } else {
                System.out.println("Error - book not found");
            }
        } else {
            System.out.println("Error - book cannot be edited");
        }
    }

    public void deleteBook(Book book) {
        if (book != null) {
            if (books.remove(book)) {
                System.out.println("Book deleted successfully");
            } else {
                System.out.println("Error - book not found");
            } 
         } else {
            System.out.println("Error - book cannot be deleted");
        }
        
    }

    
    //Adding, editing, deleting authors (including error handling)
    public void addAuthor(Author author) {
        if (author != null) {
            authors.add(author);
            System.out.println("Author added successfully");
        } else {
            System.out.println("Error - author cannot be added");
        }
    }

    public void editAuthor(Author oldAuthor, Author newAuthor) {
        if (oldAuthor != null && newAuthor != null) {
            int index = authors.indexOf(oldAuthor);
            if (index != -1) {
                authors.set(index, newAuthor);
                System.out.println("Author updated successfully");
            } else {
                System.out.println("Error - author not found");
            }
        } else {
            System.out.println("Error - author cannot be edited");
        }
    }

    public void deleteAuthor(Author author) {
        if (author != null) {
            if (authors.remove(author)) {
                System.out.println("Author deleted susccessfully");
            } else {
                System.out.println("Error - author not found");
            }
        } else {
            System.out.println("Error - author cannot be deleted");
        }
    }


    
    //Adding, editing, deleting patrons (including error handling) 
    public void addPatron(Patron patron) {
        if (patron != null) {
            patrons.add(patron);
            System.out.println("Patron added successfully");
        } else {
            System.out.println("Error - patron cannot be added");
        }
    }

    public void editPatron(Patron oldPatron, Patron newPatron) {
        if (oldPatron != null && newPatron != null) {
            int index = patrons.indexOf(oldPatron);
            if (index != -1) {
                patrons.set(index, newPatron);
                System.out.println("Patron updated successfully");
            } else {
                System.out.println("Error - patron not found");
            }
        } else {
            System.out.println("Error- patron cannot be edited");
        }
    }

    public void deletePatron(Patron patron) {
        if (patron != null) {
            if (patrons.remove(patron)) {
                System.out.println("Patron deleted successfully");
            } else {
                System.out.println("Error - patron not found");
            }
        } else {
            System.out.println("Error - patron cannot be deleted");
        }
    }


    //Search for books by title(including error handling)
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        if (title != null && !title.isEmpty()) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    result.add(book);
                }
            }
        } else {
            System.out.println("Error - title not valid");
        }
        return result;
    }

    //Search for books by author(including error handling)
    public List<Book> searchByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        if (authorName != null && !authorName.isEmpty()) {
            for (Book book : books) {
                if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                    result.add(book);
                }
            }
        } else {
            System.out.println("Error - author not valid");
        }
        return result;
    }

    //Search for books by ISBN(including error handling)
    public Book searchByISBN(String ISBN) {
        Book result = null;
        if (ISBN != null && !ISBN.isEmpty()) {
            for (Book book : books) {
                if (book.getISBN().equals(ISBN)) {
                    result = book;
                    break;
                }
            }
        } else {
            System.out.println("Error - ISBN not valid");
        }
        return result;
    }

    // Borrowing a book 
    public void borrowBook(Patron patron, Book book) {
        if (books.contains(book)) {
            if (book.getStatus() == Status.AVAILABLE) {
                book.borrow();
                patron.borrowBook(book);
            } else {
                System.out.println("Book unavailable.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    // Returning a book
    public void returnBook(Patron patron, Book book) {
        if (books.contains(book)) {
            book.returnBook();
            patron.returnBook(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    //Finding Book by Title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
    
    //Finding Patron by Name
    public Patron findPatronByName(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equalsIgnoreCase(name)) {
                return patron;
            }
        }
        return null; // Patron not found
    }
    

}



