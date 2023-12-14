package hybrid.inheritance;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		EngineeringStudent e1=new EngineeringStudent();
		e1.name="santhosh";
		System.out.println("name of the student "+" "+e1.name);
		
		MedicalStudent m1=new MedicalStudent();
		m1.name="ghs";
		System.out.println("name of the MedicalStudetnt"+" " +m1.name);
		
		JavaTrainer j1=new JavaTrainer();
		j1.name="she";
		System.out.println("name of the javaTrainer "+" "+j1.name);
		
		SqlTrainer s1=new SqlTrainer();
		s1.name="ArunKumar";
		System.out.println("name of the SqlTrainer "+" "+s1.name);


	}

}
