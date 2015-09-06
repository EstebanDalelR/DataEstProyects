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
public class ProcessJSON {
  
  Gson gson = new Gson();
  
  try {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Escriba la locaci�n dekl JSON completa:");
    String rutaJSON = scanner.next();
    File archJson = new File(rutaJSON);
    InputStream inputStream = new FileInputStream(archJson);
    Reader fileReader = new InputStreamReader(inputStream);
    JsonReader reader = new JsonReader(fileReader);
    // BufferedReader br = new BufferedReader(
    //                                      new FileReader("c:\\file.json"));
    
    //convert the json string back to object
    DataObject obj = gson.fromJson(br, DataObject.class);
    
    System.out.println(obj);
    
  } catch (IOException e) {
    e.printStackTrace();
  }
  
}