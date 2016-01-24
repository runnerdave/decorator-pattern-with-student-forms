package studentForms;

public class Context {

	public static void main(String[] args) {
		StudentForm replacementTestamurViaNormalMail = 
				new PlusNormalMail(new ReplacementTestamur());
		System.out.println("Replacement testamur via normal mail costs:");
		System.out.println(replacementTestamurViaNormalMail.calculatePrice());
		System.out.println("##########");
		StudentForm replacementTestamurViaRegisteredMail = 
				new RegisteredMail(new ReplacementTestamur());
		System.out.println("Replacement testamur via registered mail costs:");
		System.out.println(replacementTestamurViaRegisteredMail.calculatePrice());
		System.out.println("##########");
		StudentForm replacementTestamurViaRegisteredMailFramed = 
				new FramedMail(new RegisteredMail(new ReplacementTestamur()));
		System.out.println("Replacement testamur framed via registered mail costs:");
		System.out.println(replacementTestamurViaRegisteredMailFramed.calculatePrice());
	}

}
