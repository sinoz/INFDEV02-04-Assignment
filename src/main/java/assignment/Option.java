package assignment;

import java.util.function.Function;

/**
 * An optional value.
 * @author I.A
 */
public interface Option<T> {
	/**
	 * Visits the optional value.
	 */
	<U> U visit(Producer<U> onNone, Function<T, U> onSome);
}
