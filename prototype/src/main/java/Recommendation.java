import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books = new ArrayList<>();

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation copy = (Recommendation) super.clone();
            copy.books = new ArrayList<>();
            for (Book book : this.books) {
                copy.books.add(book.clone());
            }
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Target Audience: " + targetAudience + "\nBooks: " + books;
    }
}
