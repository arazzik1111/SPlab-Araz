import java.util.List; // Add this import statement

public class BookPrinter {
    public static void printAuthors(List<String> authors) {
        System.out.println("Authors: " + authors);
    }

    public static void printChapters(List<Chapter> chapters) {
        for (int i = 0; i < chapters.size(); i++) {
            System.out.println("Chapter " + (i + 1) + " - Sub-Chapters: " + chapters.get(i).getSubChapters());
        }
    }

    public static void printSubChapter(SubChapter subChapter) {
        List<Object> content = subChapter.getContent();
        for (Object item : content) {
            if (item instanceof Paragraph) {
                System.out.println("Paragraph: " + ((Paragraph) item).getText());
            } else if (item instanceof Image) {
                System.out.println("Image: " + ((Image) item).getImageUrl());
            } else if (item instanceof Table) {
                System.out.println("Table: " + ((Table) item).getTableData());
            }
        }
    }
}
