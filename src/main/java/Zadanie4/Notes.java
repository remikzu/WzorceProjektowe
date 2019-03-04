package Zadanie4;

/**
 * @author Remigiusz Zudzin
 */
public interface Notes {

    String getNoteText();
    UserType getAssignedUser();
    void setNoteContent(String noteContent) throws Exception;
    void setAssignedUser(UserType assignedUser);

}
