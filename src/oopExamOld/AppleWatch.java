package oopExamOld;

/*
 * Abstract class is a superclass.
 * It Contains both abstract and non abstract methods.
 * Abstract method can not be implemented, can be defined only
 * Non abstract methods can be implemented, but can not be defined .
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public String name = "Tofael";

	public void abstractClassInfo() {
	}

	public abstract void appleWatchInfo();

	/*
	 * Can you create a variable and constructor inside Abstract Class? Can you
	 * instantiate it? YES.
	 */

}
