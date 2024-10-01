public class TASK{
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("The Great Gatsby");
        b1.setAuthor("F. Scott Fitzgerald");
        b1.setGenre("Classic");
        b1.setNumberOfPages(180);
        b1.setDate("2023-01-05");
        Book b2 = new Book();
        b2.setTitle("Atomic Habits");
        b2.setAuthor("James Clear");
        b2.setGenre("Self_Help");
        b2.setNumberOfPages(320);
        b2.setDate("2023-02-14");
        Book.add_to_csv(b1);
        Book.add_to_csv(b2);
    }
}