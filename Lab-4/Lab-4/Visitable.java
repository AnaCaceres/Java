/**
* Interface for representing that an object
* can be visited.
*
* @author Ana de Lorenzo-Caceres Luis(117106251)
*/
public interface Visitable<T> {
    public void visitAll ( Visitor<T> visitor );
}
