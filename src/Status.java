package src;

/**
 * Represents the status of a book in the library system.
 */
public enum Status {
    /**
     * Indicates that the book is available for borrowing.
     */
    AVAILABLE,

    /**
     * Indicates that the book has been checked out by a patron.
     */
    CHECKED_OUT,

    /**
     * Indicates that the book is overdue.
     */
    OVERDUE
}
