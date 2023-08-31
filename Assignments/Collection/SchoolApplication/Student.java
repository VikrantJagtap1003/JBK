package August_29.SchoolApplication;

public class Student {
    private int studentId;
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public Student(int studentId, String studentName, int standard) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.standard = standard;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", standard=" + standard +
                '}';
    }

    private int standard;

    public Student()
    {

    }

}
