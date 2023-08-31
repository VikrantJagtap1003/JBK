package August_29.ProjectManagement;

import java.util.Set;

public class Project {
    private int projectId;
    private int projectName;

    private Set<Member> teamMembers;

    public Project()
    {

    }
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectName() {
        return projectName;
    }

    public void setProjectName(int projectName) {
        this.projectName = projectName;
    }

    public Set<Member> getTeamMembers() {
        return teamMembers;
    }

    public Project(int projectId, int projectName, Set<Member> teamMembers) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.teamMembers = teamMembers;
    }

    public void setTeamMembers(Set<Member> teamMembers) {
        this.teamMembers = teamMembers;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName=" + projectName +
                ", teamMembers=" + teamMembers +
                '}';
    }
}
