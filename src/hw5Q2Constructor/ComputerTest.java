package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {

		// Default Constructor Initialized
		Computer Computer = new Computer();

		// Parameterized Constructor initialized.
		Computer Computer2 = new Computer("Apple", 2, 2000, 'A', true);
     System.out.println();
		Computer computer3 = new Computer("b", 3, 5000, 'v', false);
	}
}
