package Zadanie4;

/**
 * @author Remigiusz Zudzin
 */
public class ImportantNote implements Notes {

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
        if(assignedUser == UserType.ADMIN) {
        this.noteContent = text;
        } else throw new Exception("Tylko administrator może zmieniać i ustawiać ważność notatki!");

    }

    @Override
    public void setAssignedUser(UserType assignedUser) {
        this.assignedUser = assignedUser;
    }
}
