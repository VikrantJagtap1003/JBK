package August_29.ProjectManagement;

import java.util.HashMap;
import java.util.Map;

public class ProjectHandler {

    private static Map<Integer,Project> projectDetails=new HashMap<>();

    public ProjectHandler()
    {

    }
    public void addProject(Project project)
    {
        ProjectHandler.projectDetails.put(project.getProjectId(),project);
    }

    public void addTeamMemberToProject( int projectId,Member teamMember)
    {
        ProjectHandler.projectDetails.get(projectId).getTeamMembers().add(teamMember);
    }

    public void viewSpecificProjectDetails(int projectId)
    {
        Project project=ProjectHandler.projectDetails.get(projectId);
        System.out.println(project);
    }

    public void listProjectDetails()
    {
        for(Integer projectId:ProjectHandler.projectDetails.keySet())
        {
            System.out.println(ProjectHandler.projectDetails.get(projectId));
        }
    }
}
