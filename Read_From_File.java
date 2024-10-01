import java.io.File;
import java.io.IOException;

public class Read_From_File {
        public void File_Selector(String File_Type) throws IOException {
                if(File_Type=="JSON"){
                    Read_From_Json.read_from_json();
                }
                else if(File_Type=="CSV"){
                    Read_From_CSV.read_from_csv();
                }
                else if(File_Type=="XML"){

                }


        }

}
