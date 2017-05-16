package assignment;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * An {@link Option} container that contains a value and can transform the contained
 * value through a {@link Function}.
 * @author I.A
 */
public final class Some<T> implements Option<T> {
	/**
	 * The contained value.
	 */
	private final T value;

	/**
	 * Creates a new {@link Some}.
	 */
	public Some(T value) {
		this.value = value;
	}

	@Override
	public <U> U visit(Supplier<U> onNone, Function<T, U> onSome) {
		return onSome.apply(value);
	}
}
