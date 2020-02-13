public class Entry {

    String surname, initials;
    int extension;

    public Entry(String surname, String initials, int extension){
        this.surname = surname;
        this.initials = initials;
        this.extension = extension;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public String toString(){
        return (this.surname + " " + this.initials + " " + this.extension);
    }

    public static void main(String[] args) {

    }
}