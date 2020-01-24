package cscc.edu;

/**
 * @author Prakash Parasuram, Java 3
 * @version 1.0
 */
public class studentGrades {
    private String studentName;
    private gradeLetter studentGrade;
    public studentGrades(String studentName, gradeLetter studentGrade) {
        this.studentName = studentName;

        this.studentGrade = studentGrade;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public gradeLetter getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(gradeLetter studentGrade) {
        this.studentGrade = studentGrade;
    }
    public void setStudentGradeDouble(Double grade) {
        this.studentGrade = gradeLetter.toGradeLetter(grade);
    }
    enum gradeLetter {
        A, AM, BP, B, BM, CP, C, CM, DP, D, DM, F;
        public static gradeLetter toGradeLetter(Double grade) {
            if (grade >= 93)
                return A;
            if (grade >= 90)
                return AM;
            if (grade >= 87)
                return BP;
            if (grade >= 83)
                return B;
            if (grade >= 80)
                return BM;
            if (grade >= 77)
                return CP;
            if (grade >= 73)
                return C;
            if (grade >= 70)
                return CM;
            if (grade >= 67)
                return DP;
            if (grade >= 63)
                return D;
            if (grade >= 60)
                return DM;
            else
                return F;
        }
        public static String toString(gradeLetter grade) {
            switch (grade) {
                case A:
                    return ("A");
                case AM:
                    return ("A-");
                case BP:
                    return ("B+");
                case B:
                    return ("B");
                case BM:
                    return ("B-");
                case CP:
                    return ("C+");
                case C:
                    return ("C");
                case CM:
                    return ("C-");
                case DP:
                    return ("D+");
                case D:
                    return ("D");
                case DM:
                    return ("D-");
                case F:
                    return ("F");
                default:
                    return ("F");
            } // end of switch(grade)
        }; // end of method toString
    } // end of enum gradeLetters {}
} // end of class studentGrades
