package Zadanie4;

/**
 * @author Remigiusz Zudzin
 */
public class SimpleNote implements Notes {

    private String noteContent;
    private StateEnum state;
    private UserType assignedUser;

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @Override
    public String getNoteText() {
        return noteContent;
    }

    @Override
    public UserType getAssignedUser() {
        return assignedUser;
    }

    @Override
    public void setNoteContent(String text) throws Exception {
        this.noteContent = text;
    }

    @Override
    public void setAssignedUser(UserType assignedUser) {
        this.assignedUser = assignedUser;
    }
}
