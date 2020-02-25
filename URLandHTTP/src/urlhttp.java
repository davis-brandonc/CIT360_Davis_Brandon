import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.net.URLEncoder;

public class urlhttp
{
  public static void main(String[] args)
  throws Exception {
    new urlhttp();
  }
  
  public urlhttp()
  {
    try {
      String myBYUI = "https://davisd-brandonc.github.io/topic1.html";
      String results = doHttpUrlConnectionAction(myBYUI); //Can be used for input or output
      System.out.println(results);
    }
    catch (Exception test)     {
    	System.out.println("Your URL is not a valid URL due to Exception = "+test);
      }
  }

  private String doHttpUrlConnectionAction(String byuiUrl)
  throws Exception
  {
    URL byui2 = null;
    BufferedReader reader = null;
    StringBuilder stringBuilder;

    try
    {
      byui2 = new URL(byuiUrl);
      HttpURLConnection con1 = (HttpURLConnection) byui2.openConnection();
      con1.setRequestMethod("GET");
      //con1.setDoOutput(true);
      
      con1.connect();

      reader = new BufferedReader(new InputStreamReader(con1.getInputStream())); //Reads the output
      stringBuilder = new StringBuilder();

      
      String line = null;
      while ((line = reader.readLine()) != null)
      {
        stringBuilder.append(line + "\n");
      }
      return stringBuilder.toString();
    }
    catch (Exception test1) {
      {
      test1.printStackTrace();
      throw test1;
      
    }
    }
    //CLOSE THE READER AND CATCH ANY ISSUES
    finally
    {

      if (reader != null)
      {
        try
        {
          reader.close();
        }
        catch (IOException ioe)
        {
          ioe.printStackTrace();
          System.out.println("Your URL connection had issues closing.");
        }
      }
    }
  }
}