package assignment;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * An optional value.
 * @author I.A
 */
public interface Option<T> {
	/**
	 * Visits the optional value.
	 */
	<U> U visit(Supplier<U> onNone, Function<T, U> onSome);
}
