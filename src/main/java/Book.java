public class Book {
    private String author;
    private String title;
    Book book = new Book();

    private static Book of(String isaac_asimov, String the_galaxy) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
return book;
    }
}

