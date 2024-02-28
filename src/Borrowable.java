package src;
/**
 * An interface representing objects that can be borrowed and returned.
 */
interface Borrowable {
    /**
     * Borrow the item.
     */
    void borrow();

    /**
     * Return the item.
     */
    void returnBook();
}