package check;

import constants.Constants;



	//課題①
	public class Check {
	private static	String firstName = "髙木";
	private static String lastName = "彩希";
	
	//課題②
	private static void  printName  (String firstName, String lastName) {
		  System.out.println("printNameメソッド→" + firstName  + lastName);
   }
	
	//課題③
	public static void main(String[] args) { 
		Check check = new Check();
		check.printName(firstName, lastName);
		
		
		
		
	Pet pet = new Pet(Constants. CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	pet.introduce();
	
	
	RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	robotpet.introduce();

	}}
