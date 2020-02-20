import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDirectory implements Directory{

    private HashMap<String, String> extension;
    private HashMap<String, String> initials;

    public HashMapDirectory(String csvFile) {
        CSVReader cr = new CSVReader(csvFile);
        extension = new HashMap<String, String>();
        initials = new HashMap<String, String>();

        for (int i=0; i<cr.getLines().size(); i++) {
            extension.put(cr.getLines().get(i).get(0), cr.getLines().get(i).get(2));
            initials.put(cr.getLines().get(i).get(0), cr.getLines().get(i).get(1));
        }
    }


    @Override
    public void insertEntry(Entry entry) {
        extension.put(entry.getSurname(), entry.getExtension());
        initials.put(entry.getSurname(), entry.getInitials());

    }

    @Override
    public void deleteEntryUsingName(String surname) {
        extension.remove(surname);
        initials.remove(surname);
    }

    @Override
    public void deleteEntryUsingExtension(String number) {
        String key = null;

        for (String i : extension.keySet()) {
            if (extension.get(i).equals(number)) {
                key = i;
                break;
            }
        }
        extension.remove(key);
        initials.remove(key);
    }

    @Override
    public void updateExtensionUsingName(String surname, String newNumber) {
        extension.put(surname, newNumber);

    }

    @Override
    public String lookupExtension(String surname) {
        return extension.get(surname);
    }

    @Override
    public List<Entry> toArrayList() {
        ArrayList<Entry> members = new ArrayList<>();
        for (String i : extension.keySet()) {
            members.add(new Entry(i, initials.get(i), extension.get(i)));
        }
        return members;
    }

    public HashMap<String, String> getExtension() {
        return extension;
    }

    public HashMap<String, String> getInitials() {
        return initials;
    }


}
