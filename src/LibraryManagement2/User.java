package LibraryManagement2;

abstract class User {
    protected String name;
    public User(String name) { this.name = name; }
    public abstract void showRole();
}