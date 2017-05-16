package assignment;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * An {@link Option} container that produces a default value through a {@link Producer}.
 * @author I.A
 */
public final class None<T> implements Option<T> {
	@Override
	public <U> U visit(Supplier<U> onNone, Function<T, U> onSome) {
		return onNone.get();
	}
}
