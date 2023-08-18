package ClassCodes.OtherCodes.StudentManagementSystem;

public class Student {
    private int studentId;
    private String studentName;
    private static int totalStudents=0;

    public Student(int studentId,String studentName)
    {
        this.studentId=studentId;
        this.studentName=studentName;
    }

    public  void enroll()
    {
        totalStudents++;
        System.out.println("enrolled");
    }
    public void drop()
    {
        if(totalStudents==0)
        {
            System.out.println("Cannot drop student..");
            return;
        }
        totalStudents--;
        System.out.println("dropped Student");
    }

}
