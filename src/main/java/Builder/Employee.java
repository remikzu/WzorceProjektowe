package Builder;

import java.math.BigDecimal;

/**
 * @author Remigiusz Zudzin
 */
public interface Employee {

    BigDecimal getDailySalary();
    Project getCurrentProject();
    EmployeeType getEmployeeType();
    void setCurrentProject(Project currentProject);

}
