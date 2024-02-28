package src;
import java.util.List;

/**
 * Represents authors who wrote books in the library - will connect with Books and Library
 */

public class Author {
    /**Properties */
    private String name; /** Name of the author */
    private String dateOfBirth; /** Author's date of birth */
    private List<Book> booksWritten; /** List of books they have written */

    /**Constructor 
     * Constructs an author with the specified name and date of birth
     * @param name The name of the author
     * @param dateofBirth Author's date of birth
    */
    public Author (String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    /** Getters and Setters 
     * Returns the name of the author
     * @return The name of the author
    */
    public String getName() {
        return name;
    }

    /** 
     * Sets the name of the author
     * @param name The name of the author
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the date of birth of the author
     * @return the date of birth of the author
     */

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the author
     * @param dateOfBirth The date of birth of the author
     */

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Returns the list of books author has written
     * @return The list of books author has written
     */

    public List<Book> getBooksWritten() {
        return booksWritten;
    }

    /**
     * Sets the list of books the author has written
     * @param booksWritten The list of books the author has written
     */

    public void setBooksWritten(List<Book> booksWritten) {
        this.booksWritten = booksWritten;
    }
}

