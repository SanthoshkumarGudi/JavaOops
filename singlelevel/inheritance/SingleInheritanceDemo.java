package singlelevel.inheritance;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Builiding b1=new Builiding();
		Builiding b2=new Builiding();
		House h1=new House();
		
		b1.name="Mannat";
		b1.home_no=89;
		
		b2.name="Galaxy";
		b2.home_no=9;
		
		h1.name="Gudi";
		h1.home_no=89;
		
		
		
		
		System.out.println("building name is"+" "+b1.name);
		System.out.println("Building no is"+" "+b1.home_no);
		
		System.out.println("building name is"+" "+b2.name);
		System.out.println("Building no is"+" "+b2.home_no);
		
		
		System.out.println("House name is"+" "+h1.name);
		System.out.println("House no is"+" "+h1.home_no);
		
		

	}

}
