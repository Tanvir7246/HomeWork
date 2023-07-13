package oopExamOld;

/*
 * Interface - 
 * 1. Doesn't contain any constructor.
 * 2. Methods in interface are abstract in nature.
 * 3. Interface can inherit another interface using extends keyword, but not a regular class.
 * 4. Known as blueprint of the class.
 */

public interface Phone {

	public int age = 35;

	public abstract void interfaceInfo();

	public abstract void call();

	public abstract void message();

	public abstract void camera();

	public default void battery() {
		System.out.println(" Battery is a default void method");
	};

	public default void wireless() {
		System.out.println(" Wireless is a default void method");
	};

}
