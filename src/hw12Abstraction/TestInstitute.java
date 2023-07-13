package hw12Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biology();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classsize();
		columbiaUniversity.teachers();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.lawinfo();
		columbiaUniversity.hygiene();

		System.out.println("\n ********************************** \n");

		University uni = new ColumbiaUniversity();
		uni.playGround();
		uni.teachers();
		uni.gymnassium();
		uni.laboratory();
		uni.languageClub();
		uni.dorm();
		uni.commonRoom();
		uni.emergencyRoom();
		uni.surgeryRoom();
		uni.cafeteria();
		uni.morgue();

		System.out.println("\n **********************************\n ");

		MedicalSchool medi = new ColumbiaUniversity();
		medi.anatomyLab();
		medi.biochemistryLab();
		medi.aeronauticalInfo();
		medi.caring();
		medi.hygiene();
		medi.maths();
		medi.lawinfo();
		medi.computerLab();

		/*
		 * (Please avoid comments written below)
		 * 
		 * University university = new University() {
		 * 
		 * 
		 * @Override public void surgeryRoom()
		 * {System.out.println(" Surgeryroom method from university interface."); //
		 * TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void emergencyRoom() {
		 * System.out.println(" Emergencyroom method from university interface."); //
		 * TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void cafeteria() {
		 * System.out.println(" Cafeteria method from university interface."); // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void languageClub()
		 * {System.out.println(" Languageclub method from university interface."); //
		 * TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void laboratory()
		 * {System.out.println(" Laboratory method from university interface."); // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void commonRoom()
		 * {System.out.println(" Commonroom method from university interface."); // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void teachers()
		 * {System.out.println(" Teachers method from university interface."); // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void playGround()
		 * {System.out.println(" Playground method from university interface."); // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * @Override public void classsize()
		 * {System.out.println(" Classsize method from university interface."); // TODO
		 * Auto-generated method stub
		 */

	}

}
