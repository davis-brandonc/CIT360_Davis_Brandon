import java.io.File;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter; 
import java.io.IOException;

public class JSONTEST {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Sport: ");
		String sport = input.nextLine();
		System.out.print("Enter Players Name: ");
		String name = input.nextLine();
		System.out.print("Sport Card Year: ");
		String year = input.nextLine();
		System.out.print("Sport Card Brand: ");
		String brand = input.nextLine();
		System.out.print("Card Number: ");
		String number = input.nextLine();
		System.out.print("Sport Card Value: ");
		String value = input.nextLine();
		
		JSONObject player = new JSONObject();
		
		player.put("Players Name", name);
		
		JSONObject cardObject1 = new JSONObject();
		cardObject1.put("Sport", sport);
		cardObject1.put("Card Year", year);
		cardObject1.put("Card Brand", brand);
		cardObject1.put("Card Number", number);
		cardObject1.put("Card Value", value);
		
		JSONArray card = new JSONArray();
		card.add(cardObject1);
		
		player.put("Card Details", card);	
		try {  

            // Writing to a file  
            File file=new File("C:\\Users\\marni\\Desktop\\Brandon School\\JsonParseTest\\Test.txt");  
            file.createNewFile();  
            FileWriter fileWriter = new FileWriter(file);  
            System.out.println("Writing JSON object to file");  
            System.out.println("-----------------------");  
            System.out.println(player.toJSONString());

            fileWriter.write(player.toJSONString());  
            fileWriter.flush();  
            fileWriter.close();  

        } catch (IOException e) {  
            e.printStackTrace();  
		
	}	
	}
}

