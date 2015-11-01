package pravin.pract.mockitopractice;

import static org.testng.Assert.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Create the test case
     * @param testName name of the test case
     */
    public AppTest(){
        //super( testName );
    }

    @Test (enabled=true) 
    public void testApp() {
        StudentManager studentMgr = new StudentManager();
        Student mockStudent = mock(Student.class);
        studentMgr.addStudents(
        		new Student[] { new Student ("first1", "last1", "A", 2),
        						new Student ("first2", "last2", "A", 3),
        						new Student ("first3", "last3", "A", 1),
        						mockStudent
        					  });
        
        verify(mockStudent, times(1)).manage();
        
        //verify(mockStudent, times(2)).manage();
        //verify(mockStudent).unmanage();
        
        
        when(mockStudent.getCummulativeGrade()).thenReturn(100);
        
        when(mockStudent.askStudent(anyString(), anyString(), eq(4)))
        		.thenReturn("Something4");
        when(mockStudent.askStudent("hi", "hello", 4))
		.thenCallRealMethod();  // real method will return something else
        
        doNothing().when(mockStudent).getVoidMethod();
        
        Assert.assertTrue(mockStudent.getCummulativeGrade() == 100);
        Assert.assertTrue(mockStudent.askStudent("", "", 4).endsWith("4"));
        Assert.assertEquals
        	(mockStudent.askStudent("hi", "hello", 4), "QuestionHint1Hint2");
     
        when(mockStudent.askStudent(anyString(), anyString(), anyInt()))
		.thenReturn("str1xx").thenReturn("str2yy").thenReturn("str3zzz");
        
        System.out.println("1 : " + mockStudent.askStudent("", "", 1) );
        System.out.println("2 : " + mockStudent.askStudent("", "", 2) );
        System.out.println("3 : " + mockStudent.askStudent("", "", 3) );
        System.out.println("4 : " + mockStudent.askStudent("", "", 4) );
        System.out.println("5 : " + mockStudent.askStudent("", "", 5) );
        
        //reset(mockStudent);
        
        doAnswer(  (inv) -> { 	Object[] args = inv.getArguments();
        						System.out.println(" arg[0]" + args[0]);
        						System.out.println(" arg[1]" + args[1]);
        						System.out.println(" arg[2]" + args[2]);
        						if (((String)args[0]).equals("who"))
        							return "mahatma";
        						return "Error";
        					}).when(mockStudent).askStudent("who", "peace", 47);
        
        Assert.assertEquals("mahatma", 
        		mockStudent.askStudent("who", "peace", 47));
        
        }
                
}

