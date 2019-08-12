package ACADAssignments;

public class Assignment5_1_1 extends Assignment5_1 {

	public static void main(String[] args) {

		Assignment5_1_1 a5111 = new Assignment5_1_1();
		
		a5111.breath();
		a5111.talk();
		a5111.walk();
		
	}

	@Override
	public void walk() {
System.out.println("Is walking...")	;	
	}

	@Override
	public void talk() {

		System.out.println("Is talking...");
	}

	@Override
	public void breath() {

		System.out.println("Is breathing...");
	}

}
