package Builder;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class ProjectManager implements Employee{

    private BigDecimal dailySalary;
    private Project currentProject;
    private String name;

    public ProjectManager(BigDecimal dailySalary, String name) {
        this.dailySalary = dailySalary;
        this.name = name;
    }

    @Override
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    @Override
    public Project getCurrentProject() {
        return currentProject;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.ProjectManager;
    }

    public void setCurrentProject(Project currentProject) {
        this.currentProject = currentProject;
    }
}
