package LibraryManagement2;

public class Students extends User {
    public Students(String name) {
        super(name);
    }

    public void showRole() {
        System.out.println(this.name + " is a Student.");
    }
}