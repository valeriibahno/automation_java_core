package homeWork16.DAO.models;

public class ProjectEntity {

    private String projectNo;
    private String projectName;
    private Float budget;

    public ProjectEntity(String projectNo, String projectName, Float budget) {
        this.projectNo = projectNo;
        this.projectName = projectName;
        this.budget = budget;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Float getBudget() {
        return budget;
    }

    public void setBudget(Float budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %.2f", projectNo, projectName, budget);
    }
}
