package Builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class ProjectGroup {

    Project project;
    List<Employee> employeesInProject = new ArrayList<>();

    public ProjectGroup(List<Employee> employeesInProject) {
        this.employeesInProject = employeesInProject;
    }

    public ProjectGroup(Project project) {
        this.project = project;
    }

    public BigDecimal sumDailySalary() {
        BigDecimal sum = new BigDecimal(0);
        for (Employee employee : employeesInProject) {
            sum.add(employee.getDailySalary());
        }
//        employeesInProject.stream().forEach(x -> sum.add(x.getDailySalary()));
        return sum;
    }

}
