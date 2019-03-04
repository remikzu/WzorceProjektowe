package Zadanie4;

/**
 * @author Remigiusz Zudzin
 */
public class Notebook {

    static Notes note1;

    static {
        try {
            note1 = NotesFactory.createNote(NotesPriority.PRIVATE, UserType.USER, "To jest notatka wazna od uzytkownika");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Notes note2;

    static {
        try {
            note2 = NotesFactory.createNote(NotesPriority.SIMPLE, UserType.GUEST, "Zwykla notatka gościa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static Notes note3;

    static {
        try {
            note3 = NotesFactory.createNote(NotesPriority.IMPORTANT, UserType.ADMIN, "Ważny komunikat od admina");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(note1.getNoteText());
        note1.setNoteContent("Prywatna notka usera - zmieniona");
        System.out.println(note1.getNoteText());
        System.out.println();

        System.out.println(note2.getNoteText());
        note2.setNoteContent("Zwykła notka gościa - zmieniona");
        System.out.println(note2.getNoteText());
        System.out.println();

        System.out.println(note3.getNoteText());
        note3.setNoteContent("Jednak nie");
        System.out.println(note3.getNoteText());
    }
}