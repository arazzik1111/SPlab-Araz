// Chapter.java
import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private List<SubChapter> subChapters;

    public Chapter() {
        subChapters = new ArrayList<>();
    }

    public void addSubChapter(SubChapter subChapter) {
        subChapters.add(subChapter);
    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }
}
