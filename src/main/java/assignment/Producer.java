package assignment;

/**
 * Produces a value without dependencies.
 * @author I.A
 */
@FunctionalInterface
public interface Producer<T> {
	/**
	 * Produces the value.
	 */
	T produce();
}
