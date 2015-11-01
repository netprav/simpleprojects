package pravin.pract.mockitopractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StudentManager {
	private List<Student> studentList = new ArrayList<>();
	
	public void addStudents(Student... students){
		Collection<Student> newList = Arrays.asList(students);
		studentList.addAll(newList);
		newList.forEach(each -> each.manage());
	}

}
