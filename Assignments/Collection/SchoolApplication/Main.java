package August_29.SchoolApplication;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(1,"vikrant",12);
        Teacher teacher1=new Teacher(123,"SagarSir","Java");

        SchoolManagement schoolManagement=new SchoolManagement();

        schoolManagement.addStudent(student1);
        schoolManagement.addTeacher(teacher1);
        schoolManagement.displayStudentDetails();
        schoolManagement.displayTeacherDetails();
    }
}
