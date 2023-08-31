package August_29.SchoolApplication;

import java.util.*;

public class SchoolManagement {
    private static Map<String, List<Object>> schoolDeatails=new HashMap<>();
    static{
        schoolDeatails.put("Students",new ArrayList<Object>());
        schoolDeatails.put("Teachers",new ArrayList<Object>());
    }

    public SchoolManagement()
    {

    }
    public void addStudent(Student student)
    {
        SchoolManagement.schoolDeatails.get("Students").add(student);
    }
    public void addTeacher(Teacher teacher)
    {
        SchoolManagement.schoolDeatails.get("Teachers").add(teacher);
    }
    public void displayStudentDetails()
    {
        List<Object> studentList=SchoolManagement.schoolDeatails.get("Students");
        for(Object student:studentList)
        {
            System.out.println(student);
        }
    }
    public void displayTeacherDetails()
    {
        List<Object> teacherList=SchoolManagement.schoolDeatails.get("Teachers");
        for(Object teacher:teacherList)
        {
            System.out.println(teacher);
        }
    }

}
