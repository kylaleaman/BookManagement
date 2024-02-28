package src;
import java.util.List;
import java.util.Scanner;

/**
 * The main class responsible for running the Library Management System.
 */
public class Main {
    /**
     * The main method that initializes the library, loads data, and displays the menu.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        //Create library instance
        Library library = new Library();

        //Load data
        loadData(library);

        //Test features
        showMenu(library);
    }

    /**
     * Loads initial data into the library.
     * @param library The library instance to load data into.
     */
    private static void loadData(Library library) {
        //Add Authors
        Author author1 = new Author("Sarah Dessan", "06/06/1970");
        Author author2 = new Author("Taylor Jenkins Reid", "03/07/1983");
        Author author3 = new Author("Stephen King", "09/21/1947");
        Author author4 = new Author("Agatha Christie", "09/15/1890");
        Author author5 = new Author("George Orwell", "06/15/1903");
        Author author6 = new Author("Jane Austen", "12/16/1775");
        Author author7 = new Author("Ernest Hemingway", "07/21/1899");
        Author author8 = new Author("Toni Morrison", "02/18/1931");
        Author author9 = new Author("J.R.R. Tolkien", "01/03/1892");
        Author author10 = new Author("Gabriel Garcia Marquez", "03/06/1927");

        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);
        library.addAuthor(author4);
        library.addAuthor(author5);
        library.addAuthor(author6);
        library.addAuthor(author7);
        library.addAuthor(author8);
        library.addAuthor(author9);
        library.addAuthor(author10);

        //Add Books
        Book book1 = new Book("Along for the Ride", author1, "05281993", "Viking Books", 5);
        Book book2 = new Book("Seven Husbands of Evelyn Hugo", author2, "01171999", "Simon Schuster", 7);
        Book book3 = new Book("The Shining", author3, "09201965", "Doubleday", 9);
        Book book4 = new Book("Murder on the Orient Express", author4, "11061965", "William Collins & Sons", 6);
        Book book5 = new Book("Nineteen Eighty-Four", author5, "06091945", "Secker &  Warburg", 3);
        Book book6 = new Book("Pride and Prejudice", author6, "10191942", "T.Egerton, Whitehall(UK)", 8);
        Book book7 = new Book("The Old Man and the Sea", author7, "01011993", "Charles Scribner's Sons", 4);
        Book book8 = new Book("Beloved", author8, "07011993", "Alfred A. Knopf", 3);
        Book book9 = new Book("The Lord of the Rings", author9, "06222002", "George Allen Unwin", 2);
        Book book10 = new Book("One Hundred Years of Solitude", author10, "12242023", "Harper and Row", 6);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        //Add Patrons
        Patron patron1 = new Patron("Lorelai Gilmore", "123 Maple Tree Lane", "203-987-9876");
        Patron patron2 = new Patron("Rory Gilmore", "12 Maple Tree Lane", "203-987-6543");
        Patron patron3 = new Patron("Lane Kim", "93 Elm Street", "203-201-2200");
        Patron patron4 = new Patron("Luke Danes", "555 Main Street", "203-345-4321");
        Patron patron5 = new Patron("Taylor Doose", "520 Main Street", "203-299-2998");
        Patron patron6 = new Patron("Babette Dell", "121 Maple Tree Lane", "203-933-0322");
        Patron patron7 = new Patron("Patricia LaCosta", "60 West Street", "203-499-4932");
        Patron patron8 = new Patron("Sookie St James", "80 Elm Street", "203-888-8437");
        Patron patron9 = new Patron("Dean Forester", "128 Peach Street", "203-282-0593");
        Patron patron10 = new Patron("Kirk Gleeson", "100 Peach Street", "203-767-7788");

        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);
        library.addPatron(patron4);
        library.addPatron(patron5);
        library.addPatron(patron6);
        library.addPatron(patron7);
        library.addPatron(patron8);
        library.addPatron(patron9);
        library.addPatron(patron10);
    }


    /**
     * Displays the menu and handles user input for various library operations.
     * @param library The library instance to perform operations on.
     */
    private static void showMenu(Library library) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Library Management System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Search Books by Title");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Edit Book Details");
            System.out.println("6. Delete Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    // Add a Book by entering title, author, ISBN, publisher, number of copies 
                    System.out.println("Adding a new book:");
                    System.out.print("Enter the title of the book: ");
                    String newBookTitle = scanner.nextLine();
                    System.out.print("Enter the name of the author: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter the ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter the publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter the number of copies: ");
                    int numCopies = scanner.nextInt();
                    scanner.nextLine();

                    Author author = new Author(authorName, "");
                    Book newBook = new Book(newBookTitle, author, ISBN, publisher, numCopies);

                    library.addBook(newBook);

                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    //Search the books in the system by their title (can also do this with author and ISBN)
                    System.out.print("Enter the title to search: ");
                    String searchTitle = scanner.nextLine();
                    List<Book> booksByTitle = library.searchByTitle(searchTitle);
                    System.out.println("Books with title '" + searchTitle + "': ");
                    for (Book book : booksByTitle) {
                        System.out.println(book.getTitle());
                    }
                    break;

                case 3:
                    //Borrowing a book - choose the book and enter patron borrowing the book
                    System.out.print("Enter the title of the book you want to borrow: ");
                    String borrowBookTitle = scanner.nextLine();
                    Book borrowBook = library.findBookByTitle(borrowBookTitle);
                    if (borrowBook != null) {
                        System.out.print("Enter your name: ");
                        String patronName = scanner.nextLine();
                        Patron patron = library.findPatronByName(patronName);
                        if (patron != null) {
                            System.out.println("Borrowing " + borrowBook.getTitle() + " by " + patron.getName() + ":");
                            library.borrowBook(patron, borrowBook);
                        } else {
                            System.out.println("Patron with name '" + patronName + "' not found.");
                        }
                    } else {
                        System.out.println("Book with title '" + borrowBookTitle + "' not found.");
                    }
                    break;

                case 4:
                    // Return a Book (enter title and patron's name who is returning book)
                    System.out.print("Enter the title of the book you want to return: ");
                    String returnBookTitle = scanner.nextLine();
                    Book returnBook = library.findBookByTitle(returnBookTitle);
                    if (returnBook != null) {
                        System.out.print("Enter your name: ");
                        String patronName = scanner.nextLine();
                        Patron patron = library.findPatronByName(patronName);
                        if (patron != null) {
                            library.returnBook(patron, returnBook);
                            System.out.println("Book returned successfully.");
                        } else {
                            System.out.println("Patron with name '" + patronName + "' not found.");
                        }
                    } else {
                        System.out.println("Book with title '" + returnBookTitle + "' not found.");
                    }
                    break;

                case 5:
                // Editing Book Details by searching title and then entering all book information with making changes to the necessary info
                    System.out.print("Enter the title of the book you want to edit: ");
                    String editBookTitle = scanner.nextLine();
                    Book bookToEdit = library.findBookByTitle(editBookTitle);
                    if (bookToEdit != null) {
                    System.out.println("Editing details for " + bookToEdit.getTitle() + ":");
                    System.out.print("Enter the new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter the new author name: ");
                    String newAuthorName = scanner.nextLine();
                    System.out.print("Enter the new ISBN: ");
                    String newISBN = scanner.nextLine();
                    System.out.print("Enter the new publisher: ");
                    String newPublisher = scanner.nextLine();
                    System.out.print("Enter the new number of copies: ");
                    int newNumCopies = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
            
                    // Update the book with the new details
                    bookToEdit.setTitle(newTitle);
                    bookToEdit.setAuthor(new Author(newAuthorName, ""));
                    bookToEdit.setISBN(newISBN);
                    bookToEdit.setPublisher(newPublisher);
                    bookToEdit.setNumCopies(newNumCopies);
            
                    System.out.println("Book details updated successfully.");
                } else {
                    System.out.println("Book with title '" + editBookTitle + "' not found.");
                }
                break;

                case 6:
                    // Delete Book by choosing title 
                    System.out.print("Enter the title of the book you want to delete: ");
                    String deleteBookTitle = scanner.nextLine();
                    Book bookToDelete = library.findBookByTitle(deleteBookTitle);
                    if (bookToDelete != null) {
                        // Confirm with the user before deleting the book
                        System.out.println("Are you sure you want to delete the book '" + bookToDelete.getTitle() + "'? (Y/N)");
                        String confirmation = scanner.nextLine().toUpperCase();
                        if (confirmation.equals("Y")) {
                            library.deleteBook(bookToDelete);
                            System.out.println("Book deleted successfully.");
                        } else {
                            System.out.println("Deletion canceled.");
                        }
                    } else {
                        System.out.println("Book with title '" + deleteBookTitle + "' not found.");
                    }
                    break;

                case 0:
                    // Press 0 to exit then wait 2 seconds before ending the system and showing thank you message
                    System.out.println("Exiting..");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thank you for using our Library Management System!!");
                    break;
                default:
                    System.out.println("Error - please choose an option from 0-5");
            }

            try {
                //Adding pause of 5 seconds before showing the menu once the action is completed
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (choice != 0);

        scanner.close();
    }
}