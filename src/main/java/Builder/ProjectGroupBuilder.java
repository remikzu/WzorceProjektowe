package Builder;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Remigiusz Zudzin
 */
public class ProjectGroupBuilder {

    EmployeeManager employeeManager = EmployeeManager.getInstance();

    ProjectGroup buildProjectGroup(Project project, int nrOfProgrammers, int nrOfTesters, int nrOfPMs) {

        ProjectGroup group = new ProjectGroup(project);

        List<Employee> programmers = employeeManager.getEmployees(EmployeeType.PROGRAMMER);
        List<Employee> testers = employeeManager.getEmployees(EmployeeType.TESTER);
        List<Employee> pms = employeeManager.getEmployees(EmployeeType.ProjectManager);

        if (programmers.size() < nrOfProgrammers) {
            group.employeesInProject.addAll(programmers);
            for (int i = 0; i < nrOfProgrammers - programmers.size(); i++) {
                Programmer programmer = new Programmer(BigDecimal.valueOf(200), "Jan");
                employeeManager.addEmployee(programmer);
                programmer.setCurrentProject(project);
                group.employeesInProject.add(programmer);
            }
        } else {
            for (int i = 0; i < nrOfProgrammers; i++) {
                Employee programmer = programmers.get(i);
                programmer.setCurrentProject(project);
                group.employeesInProject.add(programmer);
            }
        }
        if (testers.size() < nrOfTesters) {
            group.employeesInProject.addAll(testers);
            for (int i = 0; i < nrOfTesters - testers.size(); i++) {
                Tester tester = new Tester(BigDecimal.valueOf(100), "Kazimierz");
                employeeManager.addEmployee(tester);
                tester.setCurrentProject(project);
                group.employeesInProject.add(tester);
            }
        } else {
            for (int i = 0; i < nrOfTesters; i++) {
                Employee tester = programmers.get(i);
                tester.setCurrentProject(project);
                group.employeesInProject.add(tester);
            }
        }
        if (pms.size() < nrOfPMs) {
            group.employeesInProject.addAll(pms);
            for (int i = 0; i < nrOfTesters - testers.size(); i++) {
                ProjectManager projectManager = new ProjectManager(BigDecimal.valueOf(300), "Zbigniew");
                employeeManager.addEmployee(projectManager);
                projectManager.setCurrentProject(project);
                group.employeesInProject.add(projectManager);
            }
        } else {
            for (int i = 0; i < nrOfPMs; i++) {
                Employee pm = programmers.get(i);
                pm.setCurrentProject(project);
                group.employeesInProject.add(pm);
            }
        }
        return null;
    }
}
