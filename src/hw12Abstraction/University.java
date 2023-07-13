package hw12Abstraction;

public interface University extends College, Hospital{

	public void classsize();

	public void playGround();

	public void teachers();

	
	public default void gymnassium () {};
	
	public static void library() {};
	
	// Its not possible to create a constructor inside interface.
	
	
	// Question- How many keywords are used for the inheritance in Interface?
	// Answer- One.(Extends)
	
	/*
	 * Question- Can an interface inherit other Interfaces, or a regular class or
	 * abstract class by extends keyword? How many inheritances are possible?
	 * 
	 * Answer- Interface can inherit other interfaces using extends keyword. but it
	 * can`t inherit abstract or regular class by using extends keyword.
	 */
	
	
}
