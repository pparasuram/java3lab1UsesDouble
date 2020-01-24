package cscc.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsArrayList {
    static final Double lowestGrade = 0.0;
    static final Double higestGrade = 100.0;
    List<studentGrades> students = new ArrayList<studentGrades>();
    private static Scanner input = new Scanner(System.in);
    public void studentsArrayListMain() {
        // write your code here
        boolean done = false;
        System.out.println("!!! Student Grades Program !!!");
        while (!done) {
            printMenu();
            switch (getValidInput()){
                case 6:
                    done = true;
                    System.out.println("Bye from Student Grade program");
                    break;
                case 5:
                    findFirst(students);
                    break;
                case 4:
                    fillStudents(students);
                    break;
                case 3:
                    listAllStudents();
                    break;
                case 2:
                    findStudent(students);
                    break;
                case 1:
                    addStudent(students);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4!");
                    break;
            } // end of switch
        } // end of while
    } // end of main

    private void findFirst(List<studentGrades> students) {
        System.out.println("\n");
        System.out.println("Enter Student Name to find (any matching regex string)");
        String str = input.nextLine();
        for (studentGrades student : students) {
            studentGrades.gradeLetter g = student.getStudentGrade();
            String name = student.getStudentName();
            String grade = student.getStudentGrade().toString(student.getStudentGrade());
            if (name.matches(str)) {
                printOneStudent(student, name);
                break;
            }
        }
    }

    public Object listAllStudents() {
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("All Students listed below:");
        students.forEach((student) -> {
            String name = student.getStudentName();
            printOneStudent(student, name);
        });
        return null;
    }

    private static void printOneStudent(studentGrades student, String name) {
        System.out.println("Student Name: " + name + " His Grade is: " + student.getStudentGrade().toString(student.getStudentGrade()));
    }

    private static void findStudent(List<studentGrades> students) {
        System.out.println("\n");
        System.out.println("Enter Student Name to find (any matching regex string)");
        String str = input.nextLine();
        students.forEach((student) -> {
            String name = student.getStudentName();
            if (name.matches(str)) {
                printOneStudent(student, name);
            }
        });
    }
    public String findFirstMatchingStudent(String str) {
        for (studentGrades student : students) {
            studentGrades.gradeLetter g = student.getStudentGrade();
            String name = student.getStudentName();
            String grade = student.getStudentGrade().toString(student.getStudentGrade());
            if (name.matches(str))
                return grade;
        }
        return null;
    }
    public void addStudent(List<studentGrades> students) {
        boolean done = false;
        String name;
        Double grade = lowestGrade;
        while (! done) {
            name = getString();
            if (name == null) continue;
            boolean gradeDone = false;
            while (!gradeDone) {
                grade = getIntegerGrade();
                if (grade == null) continue;
                gradeDone = true;
            } // while (!gradeDone)
            studentGrades student = new studentGrades("", studentGrades.gradeLetter.F);
            student.setStudentName(name);
            student.setStudentGradeDouble(grade);
            students.add(student);
            System.out.println("Do you have more students to add? Y/n?");
            String inText = input.nextLine();
            if (inText.equals("n") || inText.equals("N"))
                done = true;
        } // while (! done)
    }

    public Double getIntegerGrade() {
        Double grade;
        System.out.println("Enter Student Grade between " + lowestGrade + " and " + higestGrade + " inclusive");
        grade = getValidDoubleInput();
        if (grade < lowestGrade || grade > higestGrade) {
            System.out.println("Grade must be between "+ lowestGrade +" and " + higestGrade +" inclusive");
            return null;
        }
        return grade;
    }

    public String getString() {
        String name;
        System.out.println("Enter Student Name as First Name, Last Name");
        name = input.nextLine();
        if ((name.equals(""))
                || (name == null)
                || !(name.matches("^[a-z ,A-Z']*$"))) {
            System.out.println("Name can only contain alphabets or the apostrophe(')");
            return null;
        }
        return name;
    }
    public int getValidInput() {
        boolean done = false;
        while (!done) {
            if (!input.hasNextInt()){
                String word = input.next();
                System.out.println(word + " is not a number");
            } else {
                done = true;
                Integer i = input.nextInt();
                input.nextLine();
                return i;
            }
        }
        return 0;
    }
    public Double getValidDoubleInput() {
        boolean done = false;
        while (!done) {
            if (!input.hasNextDouble()){
                String word = input.next();
                System.out.println(word + " is not a number");
            } else {
                done = true;
                Double grade = input.nextDouble();
                input.nextLine();
                return grade;
            }
        }
        return 0.0;
    }

    public Integer getStudentCount(){
        return students.size();
    }
    public void printMenu() {
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Student Grades Program Menu!");
        System.out.println("Enter 1 for Add Student");
        System.out.println("Enter 2 for Find Student");
        System.out.println("Enter 3 for List all Students");
        System.out.println("Enter 4 to fill student data for testing with inline data");
        System.out.println("Enter 5 to find first matching student, only one");
        System.out.println("Enter 6 To end");
    } // end of printmenu
    public void fillStudents(List<studentGrades> students) {
        studentGrades student = new studentGrades("prakash parasuram", studentGrades.gradeLetter.toGradeLetter(93.0));
        students.add(student);
        student = new studentGrades("mahesh bharatan", studentGrades.gradeLetter.toGradeLetter(92.0));
        students.add(student);
        student = new studentGrades("akhil snehdesh", studentGrades.gradeLetter.toGradeLetter(87.0));
        students.add(student);
        student = new studentGrades("agil andeswari", studentGrades.gradeLetter.toGradeLetter(83.0));
        students.add(student);
        student = new studentGrades("bat man", studentGrades.gradeLetter.toGradeLetter(82.0));
        students.add(student);
        student = new studentGrades("spider man", studentGrades.gradeLetter.toGradeLetter(77.0));
        students.add(student);
        student = new studentGrades("super man", studentGrades.gradeLetter.toGradeLetter(73.0));
        students.add(student);
        student = new studentGrades("some man", studentGrades.gradeLetter.toGradeLetter(72.0));
        students.add(student);
        student = new studentGrades("mars man", studentGrades.gradeLetter.toGradeLetter(69.0));
        students.add(student);
        student = new studentGrades("true man", studentGrades.gradeLetter.toGradeLetter(66.0));
        students.add(student);
        student = new studentGrades("god man", studentGrades.gradeLetter.toGradeLetter(62.0));
        students.add(student);
        student = new studentGrades("fail man", studentGrades.gradeLetter.toGradeLetter(59.0));
        students.add(student);
    }
}
