package oopExamOld;



public class TestPhone {

	public static void main(String[] args) {
		
		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(750);
		iphone1.setInfo("2000");
		iphone1.setUser('M');
		iphone1.setMadeInUsa(false);
		
		System.out.println(" I bought this iphone in, " + iphone1.getInfo() + " The price was " + iphone1.getPrice() 
		+ " Users sex "+ iphone1.getUser() + " Made in usa " + iphone1.isMadeInUsa());
		
		Iphone6 iphone6 = new Iphone6();
		iphone6.regularClassInfo();
		iphone6.compass();
		iphone6.materials(50, 5000);
			/*
Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. [points: 70] . 
		 */
		
		/*
Initialize getter and setter methods here from Iphone 1 and print: "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false". [points: 70] . 
		 */

		/*
		 *  Instantiate Iphone6 in TestPhone and show how many methods they can call in TestPhone. [points: 70] . 
		 *  Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, 
		 *  and single inheritance. [points: 50].
		 */
		
		
		
	}

}
