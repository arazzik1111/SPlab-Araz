public class Main {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        Image img1 = new Image("Pamela Anderson");
        Image img2 = new Image("Kim Kardashian");
        Image img3 = new Image("Kirby Griffin");
        Chapter playboyS1 = new Chapter("Front Cover");
        playboyS1.add(img1);
        Chapter playboyS2 = new Chapter("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");
        playboy.addChapter(playboyS1);
        playboy.addChapter(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime - startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the chapter 1 took " + (endTime - startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the chapter 1 took " + (endTime - startTime) + " milliseconds");
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