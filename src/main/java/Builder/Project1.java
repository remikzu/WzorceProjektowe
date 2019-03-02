package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class Project1 implements Project {
    @Override
    public String getName() {
        return "P1";
    }

    private List<Employee> employeesInProject = new ArrayList<>();

    public List<Employee> getEmployeesInProject() {
        return employeesInProject;
    }
}
