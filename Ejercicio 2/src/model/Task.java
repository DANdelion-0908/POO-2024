package model;

public class Task {
    private String taskName;
    private String taskType;
    private String estimateWorkHours;
    private String currentState;
    private Developer asignedDeveloper;
    
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getTaskType() {
        return taskType;
    }
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
    public String getEstimateWorkHours() {
        return estimateWorkHours;
    }
    public void setEstimateWorkHours(String estimateWorkHours) {
        this.estimateWorkHours = estimateWorkHours;
    }
    public String getCurrentState() {
        return currentState;
    }
    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }
    public Developer getAsignedDeveloper() {
        return asignedDeveloper;
    }
    public void setAsignedDeveloper(Developer asignedDeveloper) {
        this.asignedDeveloper = asignedDeveloper;
    }
    
    
    
}
