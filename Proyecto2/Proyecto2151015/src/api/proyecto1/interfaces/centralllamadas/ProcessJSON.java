package api;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.stream .JsonReader;
import com.google.gson.stream.JsonToken;
import java.util.Scanner;
//copia de CentralVehiculos para cambiar
//TODO

//File archJson = new File("...");
//InputStream inputStream = new FileInputStream(archJson);
//Reader fileReader = new InputStreamReader(inputStream);
//JsonReader reader = new JsonReader(fileReader);
public class ProcessJSON 
{
  public void readFromLine()
  {
    Gson gson = new Gson();
    
    try
    {
      //recibir input
      Scanner scanner = new Scanner(System.in);
      System.out.print("Escriba la locación dekl JSON completa:");
      String rutaJSON = scanner.next();
      //tomar el file del JSON
      File archJson = new File(rutaJSON);
      InputStream inputStream = new FileInputStream(archJson);
      Reader fileReader = new InputStreamReader(inputStream);
      JsonReader reader = new JsonReader(fileReader);
      // BufferedReader br = new BufferedReader(
      //                                      new FileReader("c:\\file.json"));
      
      //convert the json string back to object
      DataObject obj = gson.fromJson(JsonReader, DataObject.class);
      
      System.out.println(obj);
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public void readAsParser(File archivo)
  {
    //odio esto
    
    Gson gson = new Gson();
    
    try
    {
      //tomar el file del JSON
      File archJson = new File(archivo);
      InputStream inputStream = new FileInputStream(archJson);
      Reader fileReader = new InputStreamReader(inputStream);
      JsonReader reader = new JsonReader(fileReader);
      // BufferedReader br = new BufferedReader(
      //                                      new FileReader("c:\\file.json"));
      
      //convert the json string back to object
      DataObject obj = gson.fromJson(JsonReader, DataObject.class);
      
      System.out.println(obj);
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
