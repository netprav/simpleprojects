package pravin.pract.mockitopractice;

public class Student {
	private final String firstName;
	private final String lastName;
	private final String division;
	private final int grade;
	private boolean isManaged = false;
	
	public Student( String firstName, 
					String lastName,
					String division,
					int grade){
		this.firstName = firstName;
		this.lastName = lastName;
		this.division = division;
		this.grade = grade;
	}
	
	public void manage(){
		this.isManaged = true;
	}
		
	public void unmanage(){
		this.isManaged = false;
	}	
	
	public int getCummulativeGrade(){
		System.out.println(" *** getCummulativeGrade invoked *** ");
		return -99;
	}
	
	public String askStudent(String question, String hint1, int hint2){
		return "QuestionHint1Hint2";
	}
	
	public void getVoidMethod(){
		System.out.println(" *** void method invoked *** ");		
	}	
	
}
