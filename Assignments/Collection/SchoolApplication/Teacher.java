package August_29.SchoolApplication;

public class Teacher {

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
    public Teacher()
    {

    }

    public Teacher(int teacherId, String name, String subject) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private int teacherId;
    private String name;

    private String subject;
}
