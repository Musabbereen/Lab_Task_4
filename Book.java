public class Book{
    private String title;
    private String author;
    private String genre;
    private int numberOfPages;
    private String date;

    public Book() {

    }

    public static void add_to_csv(Book b1) {
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public String getDate() {
        return date;
    }



}
