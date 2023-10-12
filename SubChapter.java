// SubChapter.java
import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    private List<Object> content;

    public SubChapter() {
        content = new ArrayList<>();
    }

    public void addParagraph(String text) {
        content.add(new Paragraph(text));
    }

    public void addImage(String imageUrl) {
        content.add(new Image(imageUrl));
    }

    public void addTable(String tableData) {
        content.add(new Table(tableData));
    }

    public List<Object> getContent() {
        return content;
    }
}
