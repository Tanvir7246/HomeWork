package oopExamOld;

public class Iphone1 extends AppleWatch implements Phone {
	private int price;
	private String info;
	private char user;
	private boolean madeInUsa;

	public int getPrice() {
		return price;
	}

	public String getInfo() {
		return info;
	}

	public char getUser() {
		return user;
	}

	public boolean isMadeInUsa() {
		return madeInUsa;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public void setMadeInUsa(boolean madeInUsa) {
		this.madeInUsa = madeInUsa;
	}

	public Iphone1() {
		System.out.println(" Default constructor from iphone class");
	}

	public Iphone1(int price, String info, char user, boolean madeInUsa) {
		super();
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUsa = madeInUsa;

	};

	public void regularClassInfo() {
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dingDong() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tinkuTinku() {
		// TODO Auto-generated method stub

	};

}
