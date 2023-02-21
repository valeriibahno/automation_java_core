package homeWork16.DAO.models;

import java.util.Date;

public class WorksOnEntity {

    private Integer empNo;
    private String projectNo;
    private String job;
    private Date enterDate;

    public WorksOnEntity(Integer empNo, String projectNo, String job, Date enterDate) {
        this.empNo = empNo;
        this.projectNo = projectNo;
        this.job = job;
        this.enterDate = enterDate;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    @Override
    public String toString() {
        return String.format("%-8d %-10s %-10s %s", empNo, projectNo, job, enterDate);
    }
}
