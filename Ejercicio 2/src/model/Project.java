package model;
import java.util.Date;

public class Project {

    private String ProjectName;
    private String ProjectID;
    private Developer JuniorDev;
    private Developer SeniorDev;
    private Date LimitDate;
    
    public String getProjectName() {
        return ProjectName;
    }
    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }
    public String getProjectID() {
        return ProjectID;
    }
    public void setProjectID(String projectID) {
        ProjectID = projectID;
    }
    public Developer getJuniorDev() {
        return JuniorDev;
    }
    public void setJuniorDev(Developer juniorDev) {
        JuniorDev = juniorDev;
    }
    public Developer getSeniorDev() {
        return SeniorDev;
    }
    public void setSeniorDev(Developer seniorDev) {
        SeniorDev = seniorDev;
    }
    public Date getLimitDate() {
        return LimitDate;
    }
    public void setLimitDate(Date limitDate) {
        LimitDate = limitDate;
    }

    
}
