/**
* Class for representing an element Holder.
* It has methods to get the element that its holding
* and to set it.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public class Holder<T> {
    T data;
    
    /**   
    * Construct an instance of this class.
    *
    * @param data The objects that has to be hold.
    * @return An instance of this class.
    */
    public Holder( T data ) {
        this.data = data;
    }
    
    /**
    * Sets the object. 
    *
    * @param data the new data of the object.
    */
    public void setData( T data ) {
        this.data = data;
    }
    
    /**
    * Gets the object.
    *
    * @return the object.
    */
    public T getData( ) {
        return data;
    }
}