
/**
* Class for representing a Link.
* It has methods to get the head and the tail
* of a list.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Link<T> {
    private T head; 
    private Link<T> tail;
    
    /**   
    * Construct an instance of this class.
    *
    * @param item Item that has to be added.
    * @param list List where the item has to be added.
    * @return An instance of this class.
    */
    public Link( final T item, final Link<T> list ) {
        head = item;
        tail = list;
    }
    
    /**
    * Gets the head of the List.
    * @return the head of the List.
    */
    public T getHead( ) {
        return head;
    }

    /**
    * Gets the tail of the List.
    * @return the tail of the List.
    */
    public Link<T> getTail( ) {
        return tail;
    }
}