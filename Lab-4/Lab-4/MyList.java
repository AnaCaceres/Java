/**
* Class for representing a List.
* It has methods to add Links to the List
* and to visit each of its elements.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class MyList<T> implements Visitable<T> {
    private Link<T> list;

    /**
    * Main constructor.
    *
    * @return An instance of this class.
    */
    public MyList( ) {
        list = null;
    }

    /**
    * Adds a Link to the List of a determined item.
    *
    * @param item the item that must be added to the
    * List.
    */
    public void add( final T item ) {
        list = new Link<T>( item, list );
    }

    @Override
    /**
    * Visits all elements in the collection and
    * For each element data in the collection,
    * the method calls visitor.show( data ).
    *
    * @param visitor the visitor which applies a
    * certain function over the data
    */
    public void visitAll ( Visitor<T> visitor ) {
        Link<T> temp = list;
        while( temp != null ) {
            T data = temp.getHead( );
            visitor.show( data );
            temp = temp.getTail( );
        }
    }
}
