package Builder;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public class Programmer implements Employee {

    private BigDecimal dailySalary;
    private Project currentProject;
    private String name;

    public Programmer(BigDecimal dailySalary, String name) {
        this.dailySalary = dailySalary;
        this.name = name;
    }

    @Override
    public Project getCurrentProject() {
        return currentProject;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.PROGRAMMER;
    }

    @Override
    public BigDecimal getDailySalary() {
        return dailySalary;
    }

    public void setCurrentProject(Project currentProject) {
        this.currentProject = currentProject;
    }
}
