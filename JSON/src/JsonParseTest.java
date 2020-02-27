import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

public class JsonParseTest {
  
     public static void main(String[] args) {
 
    	 File jsonInputFile = new File("C:\\Users\\marni\\Desktop\\Brandon School\\JsonParseTest\\src\\jsonTestFile.json");
         InputStream is;
         try {
             is = new FileInputStream(jsonInputFile);
             JsonReader reader = Json.createReader(is);
             JsonObject playersNameObj = reader.readObject();
             reader.close();
             System.out.println("Players Name: " + playersNameObj.getString("playersName"));
             JsonArray arrObj = playersNameObj.getJsonArray("cardDetails");
             System.out.println("\nCard Details:");
             for(JsonValue value : arrObj){
                 System.out.println(value.toString());
             }
              
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         }
     }
 }