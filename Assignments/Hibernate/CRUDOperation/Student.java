package Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private int studentAge;
    private String studentName;

    public Student(int studentId, int studentAge, String studentName) {
        this.studentId = studentId;
        this.studentAge = studentAge;
        this.studentName = studentName;
    }

    public Student()
    {

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentAge=" + studentAge +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
