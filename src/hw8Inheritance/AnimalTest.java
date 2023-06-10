package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		System.out.println

		("\n*****BullDog*****\n");
        //Multilevel Inheritance.
		Bulldog doggo = new Bulldog();
		doggo.BulldogInfo();//Child class
		doggo.dogInfo();
		doggo.mammalInfo();
		doggo.animalInfo(); //Parent Class.

		System.out.println

		("\n*****Cobra*****\n");

		Cobra hish = new Cobra();
		hish.cobraInfo();
		hish.snakeInfo();
		hish.reptileinfo();
		hish.animalInfo();

		System.out.println
		
		("\n*****Robin*****\n");

		Robin doyel = new Robin();
		doyel.robinInfo();
		doyel.birdsinfo();
		doyel.animalInfo();

	}

}
