package cscc.edu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;
public class TestGradeEnumProgramTest {
    StudentsArrayList students = new StudentsArrayList();
    @Test
    public void justTestGradeEnum(){
        students.fillStudents(students.students);
        // assertEquals(8, students.getStudentCount());
        assertEquals((long)12,(long)students.getStudentCount());
    }
    @Test
    public void justTestGradeEnumAgain(){
        students.fillStudents(students.students);
        // assertEquals(8, students.getStudentCount());
        assertNull(null,(Object)students.listAllStudents());
    }
    @Test
    public void justTestGradeEnumAgainAgain(){
        students.fillStudents(students.students);
        // assertEquals(8, students.getStudentCount());
        assertSame("D-",students.findFirstMatchingStudent("god man"));
    }
}