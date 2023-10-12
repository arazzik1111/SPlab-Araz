// Main.java
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.addAuthor("Author 1");
        myBook.addAuthor("Author 2");

        Chapter chapter1 = new Chapter();

        SubChapter subChapter1 = new SubChapter();
        subChapter1.addParagraph("This is a sub-chapter.");
        subChapter1.addImage("image1.jpg");
        subChapter1.addTable("Table data goes here.");

        chapter1.addSubChapter(subChapter1);

        myBook.addChapter(chapter1);

        BookPrinter.printAuthors(myBook.getAuthors());
        BookPrinter.printChapters(myBook.getChapters());
        BookPrinter.printSubChapter(subChapter1);
    }
}
