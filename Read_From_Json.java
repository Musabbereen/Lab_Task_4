import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Read_From_Json {
    static JSONParser parser = new JSONParser();
        public static void read_from_json() {
            try {
                Object obj = parser.parse(new FileReader("C://Users//USER//OneDrive//Desktop//DATA//LAB_TASK_JSON//src//DATA.txt"));

                JSONObject jsonObject = (JSONObject) obj;

                String title = (String) jsonObject.get("Title");
                System.out.println(title);

                String author = (String) jsonObject.get("Author");
                System.out.println(author);

                String genre = (String) jsonObject.get("genre");
                System.out.println(genre);

                String num_of_pages = (String) jsonObject.get("num_of_pages");
                System.out.println(num_of_pages);

                String pages = (String) jsonObject.get("Pages");
                System.out.println(pages);

                String date = (String) jsonObject.get("date");
                System.out.println(date);

                JSONArray Book = (JSONArray) jsonObject.get("Book");
                Iterator<Object> iterator = Book.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                } catch (FileNotFoundException e) {
                e.printStackTrace();
                } catch (IOException e) {
                e.printStackTrace();
                } catch (ParseException e) {
                e.printStackTrace();
                }
        }
        public void write_to_JSON(){
                

        }
    }