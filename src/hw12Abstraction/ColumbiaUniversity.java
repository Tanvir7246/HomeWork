package hw12Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	// its not possible to create an abstract method inside a regular class.
	// public abstract void chemistry ();

	public void biology() {
		System.out.println(" Hi, I am annoying biology.");
	};

	public ColumbiaUniversity() {
		System.out.println(" Columbia university method from ColumbiaUniversity class.");
	}

	@Override
	public void commonRoom() {System.out.println(" Common room method from ColumbiaUniversity class.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() { System.out.println(" Laboratory method from ColumbiaUniversity class.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() { System.out.println(" Language club  method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() { System.out.println(" Emergency room method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() { System.out.println(" Surgery room method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() { System.out.println(" Cafeteria method from ColumbiaUniversity class");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() { System.out.println(" Vocational info method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classsize() { System.out.println(" Classsize method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {System.out.println(" Playground method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teachers() { System.out.println(" Teachers method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() { System.out.println(" Anatomylab method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawinfo() { System.out.println(" Lawinfo method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {System.out.println(" Hygiene method from ColumbiaUniversity class. ");
		// TODO Auto-generated method stub
		
	};
}
