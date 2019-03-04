package Builder;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void main(String[] args) {
        Project1 project1 = new Project1();
        ProjectGroup group = ProjectGroupBuilder.buildProjectGroup(project1, 5, 3, 1);
    }

}
