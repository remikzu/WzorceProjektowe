package Zadanie4;

/**
 * @author Remigiusz Zudzin
 */
public class PrivateNote implements Notes {

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
        if (assignedUser == UserType.USER) {
            return null;
        }
        return noteContent;
    }

    @Override
    public UserType getAssignedUser() {
        return assignedUser;
    }

    @Override
    public void setNoteContent(String noteContent) throws Exception {
        if (assignedUser == UserType.GUEST) {
            throw new Exception("Gość nie może zmieniać prywatnych notatek!");
        }
        this.noteContent = noteContent;
    }

    @Override
    public void setAssignedUser(UserType assignedUser) {
        this.assignedUser = assignedUser;
    }
}
