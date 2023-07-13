package hw12Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister(10, 20);
		sister.sister("50", 50);
		sister.sister(10, 20, 30);
		sister.sister(20, 30, 40, 50);

		System.out.println("\n***********************************\n");

		Niece niece = new Niece();
		niece.sister(10, 50);
		niece.sister("100", 50);
		niece.sister(20, 30, 50);
	}

}
