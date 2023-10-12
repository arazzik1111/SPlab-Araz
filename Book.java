// Book.java
import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<String> authors;
    private List<Chapter> chapters;

    public Book() {
        authors = new ArrayList<>();
        chapters = new ArrayList<>();
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }
}
