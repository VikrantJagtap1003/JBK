package ClassCodes.Organization;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String toString()
    {
        return super.toString()+" developer of programming Language= "+this.programmingLanguage+'}';
    }
}
