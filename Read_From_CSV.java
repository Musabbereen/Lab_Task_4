import java.io.*;

public class Read_From_CSV {

    public static void add_to_csv(Book book) {
       try {
           FileWriter fw = new FileWriter("C:/Users/USER/OneDrive/Desktop/DATA/LAB_TASK_JSON/src/DATA.txt",true);

           fw.write(book.getTitle()+","+book.getAuthor()+","+book.getGenre()+","+Integer.toString(book.getNumberOfPages())+"\n");
           fw.close();
       }
       catch(IOException e) {
           System.out.println("There is an error in your file");
       }

    }
    public static void read_from_csv() throws IOException {
        FileReader fr = new FileReader("C:/Users/USER/OneDrive/Desktop/DATA/LAB_TASK_JSON/src/DATA.txt");
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()){
            String line = br.readLine();
            System.out.println(line);
        }
    }
}
