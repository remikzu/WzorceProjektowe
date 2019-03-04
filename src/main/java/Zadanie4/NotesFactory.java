package Zadanie4;

/**
 * @author Remigiusz Zudzin
 */
public class NotesFactory {

    public static Notes createNote(NotesPriority notesPriority, UserType userType, String text) throws Exception {
        if (NotesPriority.SIMPLE.equals(notesPriority)) {
            SimpleNote simpleNote = new SimpleNote();
            simpleNote.setAssignedUser(userType);
            simpleNote.setNoteContent(text);
            if (userType == UserType.GUEST) {
                simpleNote.setState(StateEnum.EDITABLE);
            }
            if (userType == UserType.USER) {
                simpleNote.setState(StateEnum.EDITABLE);
            }
            if (userType == UserType.ADMIN) {
                simpleNote.setState(StateEnum.EDITABLE);
            }
            return simpleNote;
        }
        if (NotesPriority.PRIVATE.equals(notesPriority)) {
            PrivateNote privateNote = new PrivateNote();
            privateNote.setAssignedUser(userType);
            privateNote.setNoteContent(text);
            if (userType == UserType.GUEST) {
                privateNote.setState(StateEnum.VIEWONLY);
            }
            if (userType == UserType.USER) {
                privateNote.setState(StateEnum.VIEWONLY);
            }
            if (userType == UserType.ADMIN) {
                privateNote.setState(StateEnum.EDITABLE);
            }
            return privateNote;
        }
        if (NotesPriority.IMPORTANT.equals(notesPriority)) {
            ImportantNote importantNote = new ImportantNote();
            importantNote.setAssignedUser(userType);
            importantNote.setNoteContent(text);
            if (userType == UserType.GUEST) {
                importantNote.setState(StateEnum.VIEWONLY);
            }
            if (userType == UserType.USER) {
                importantNote.setState(StateEnum.EDITABLE);
            }
            if (userType == UserType.ADMIN) {
                importantNote.setState(StateEnum.EDITABLE);
            }
            return importantNote;
        }
        return null;
    }

}
