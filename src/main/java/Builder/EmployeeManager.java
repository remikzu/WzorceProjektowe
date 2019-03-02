package Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Remigiusz Zudzin
 */
public class EmployeeManager {
    private static EmployeeManager ourInstance = new EmployeeManager();

    public static EmployeeManager getInstance() {
        return ourInstance;
    }

    private List<Employee> allEmployees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        allEmployees.add(employee);
    }

    public List<Employee> getEmployees(EmployeeType type) {
        return allEmployees
                .stream()
                .filter(x -> x.getEmployeeType().equals(type))
                .collect(Collectors.toList());
    }

    private EmployeeManager() {
    }
}
