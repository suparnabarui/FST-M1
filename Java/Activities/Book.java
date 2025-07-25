package activities;

public abstract class Book {

    String title;

    // Abstract method to be implemented by subclass
    abstract void setTitle(String title);

    // Concrete method to return the title
    String getTitle() {
        return title;
    
    }
}
