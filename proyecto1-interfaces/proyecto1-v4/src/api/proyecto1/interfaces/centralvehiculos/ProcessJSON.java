<<<<<<< HEAD
package api.proyecto1.interfaces.centralvehiculos;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;

import com.google.gson.stream .JsonReader;
import com.google.gson.stream.JsonToken;


public class ProcessJSON {

    public static void main(String[] args) throws MalformedURLException, IOException
    {        
        JsonReader reader = new JsonReader(new StringReader("[{\"atributo\":\"valor\", \"lista\":[{\"item\":\"item1\"}]}]"));
        handleArray(reader); // En este caso porque sabemos que siempre nos va a llegar una lista de objetos

    }

    /**
     * Cuando identifica que encontr� un objeto se procesa los atributos at�micos y compuestos (como listas)
     * @param reader
     * @throws IOException
     */
    private static void handleObject(JsonReader reader) throws IOException
    {
        reader.beginObject();
        
        while (reader.hasNext()) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.evento_control))
            {
          system.out.println(""(evento_control" : "INICIAR_CENTRAL_VEHICULO)"");
            }
                controlHandleArray(reader);
            else if (token.equals(JsonToken.evento_vehiculo)) {
               {
          system.out.println(token);
                 vehiculoHandleArray(reader);
            }
                 
             if (token.equals(JsonToken.evento_datos)) {
                 datosHandleArray(reader);
              
            } else
                handleNonArrayToken(reader, token);
        }

    }
//
    /**
     * Cuando detecta que hay un arreglo de tipo vehiculo es llamado este m�todo
     * Los arreglos pueden contener objetos o elementos primitivos
     *
     * @param reader
     * @throws IOException
     */
    public static void vehiculoHandleArray(JsonReader reader) throws IOException
    {
        reader.beginArray();
        while (reader.hasNext()) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.TipoEventoControl)){
              CentralVehiculos.iniciar(datos);}
            else if (token.equals(JsonToken.CREAR_VEHICULO)){
              CentralVehiculos.crearVehiculo(datosVehiculo);}
            else if (token.equals(JsonToken.AGREGAR_RUTA)){
                CentralVehiculos.agregarRuta(datosRuta);      }                 
            } else
                handleNonArrayToken(reader, token);
        }

        while (true) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.END_ARRAY)) {
                reader.endArray();
                break;
            } else if (token.equals(JsonToken.BEGIN_OBJECT)) {
                handleObject(reader);
            } else if (token.equals(JsonToken.END_OBJECT)) {
                reader.endObject();
            } else
                handleNonArrayToken(reader, token);
        }
    }
  //  
    /**
     * Cuando detecta que hay un arreglo de tipo control es llamado este m�todo
     * Los arreglos pueden contener objetos o elementos primitivos
     *
     * @param reader
     * @throws IOException
     */
    public static void handleArray(JsonReader reader) throws IOException
    {
        reader.beginArray();
        while (true) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.END_ARRAY)) {
                reader.endArray();
                break;
            } else if (token.equals(JsonToken.BEGIN_OBJECT)) {
                handleObject(reader);
            } else if (token.equals(JsonToken.END_OBJECT)) {
                reader.endObject();
            } else
                handleNonArrayToken(reader, token);
        }
    }

    /**
     * Cuando identific� que no son ni arreglos ni objetos sino tokens (primitivas) concretos
     *
     * @param reader
     * @param token
     * @throws IOException
     */
    public static void handleNonArrayToken(JsonReader reader, JsonToken token) throws IOException
    {
        if (token.equals(JsonToken.NAME))
            System.out.println(reader.nextName());
        else if (token.equals(JsonToken.STRING))
            System.out.println(reader.nextString());
        else if (token.equals(JsonToken.NUMBER))
            System.out.println(reader.nextDouble());
        else if (token.equals(JsonToken.BOOLEAN))
            System.out.println(reader.nextBoolean());
        else
            reader.skipValue();
    }

}
||||||| merged common ancestors
=======
package api.proyecto1.interfaces.centralvehiculos;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;

import com.google.gson.stream .JsonReader;
import com.google.gson.stream.JsonToken;


public class ProcessJSON {

    public static void main(String[] args) throws MalformedURLException, IOException
    {        
        JsonReader reader = new JsonReader(new StringReader("[{\"atributo\":\"valor\", \"lista\":[{\"item\":\"item1\"}]}]"));
        handleArray(reader); // En este caso porque sabemos que siempre nos va a llegar una lista de objetos

    }

    /**
     * Cuando identifica que encontr� un objeto se procesa los atributos at�micos y compuestos (como listas)
     * @param reader
     * @throws IOException
     */
    private static void handleObject(JsonReader reader) throws IOException
    {
        reader.beginObject();
        while (reader.hasNext()) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.evento_control))
                controlHandleArray(reader);
            else if (token.equals(JsonToken.evento_vehiculo)) {
                 vehiculoHandleArray(reader);
             if (token.equals(JsonToken.evento_datos)) {
                 datosHandleArray(reader);
              
            } else
                handleNonArrayToken(reader, token);
        }

    }
//
    /**
     * Cuando detecta que hay un arreglo de tipo vehiculo es llamado este m�todo
     * Los arreglos pueden contener objetos o elementos primitivos
     *
     * @param reader
     * @throws IOException
     */
    public static void vehiculoHandleArray(JsonReader reader) throws IOException
    {
        reader.beginArray();
        while (reader.hasNext()) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.TipoEventoControl)){
              CentralVehiculos.iniciar(datos);}
            else if (token.equals(JsonToken.CREAR_VEHICULO)){
              CentralVehiculos.crearVehiculo(datosVehiculo);}
            else if (token.equals(JsonToken.AGREGAR_RUTA)){
                CentralVehiculos.agregarRuta(datosRuta);      }                 
            } else
                handleNonArrayToken(reader, token);
        }

        while (true) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.END_ARRAY)) {
                reader.endArray();
                break;
            } else if (token.equals(JsonToken.BEGIN_OBJECT)) {
                handleObject(reader);
            } else if (token.equals(JsonToken.END_OBJECT)) {
                reader.endObject();
            } else
                handleNonArrayToken(reader, token);
        }
    }
  //  
    /**
     * Cuando detecta que hay un arreglo de tipo control es llamado este m�todo
     * Los arreglos pueden contener objetos o elementos primitivos
     *
     * @param reader
     * @throws IOException
     */
    public static void handleArray(JsonReader reader) throws IOException
    {
        reader.beginArray();
        while (true) {
            JsonToken token = reader.peek();
            if (token.equals(JsonToken.END_ARRAY)) {
                reader.endArray();
                break;
            } else if (token.equals(JsonToken.BEGIN_OBJECT)) {
                handleObject(reader);
            } else if (token.equals(JsonToken.END_OBJECT)) {
                reader.endObject();
            } else
                handleNonArrayToken(reader, token);
        }
    }

    /**
     * Cuando identific� que no son ni arreglos ni objetos sino tokens (primitivas) concretos
     *
     * @param reader
     * @param token
     * @throws IOException
     */
    public static void handleNonArrayToken(JsonReader reader, JsonToken token) throws IOException
    {
        if (token.equals(JsonToken.NAME))
            System.out.println(reader.nextName());
        else if (token.equals(JsonToken.STRING))
            System.out.println(reader.nextString());
        else if (token.equals(JsonToken.NUMBER))
            System.out.println(reader.nextDouble());
        else if (token.equals(JsonToken.BOOLEAN))
            System.out.println(reader.nextBoolean());
        else
            reader.skipValue();
    }

}
>>>>>>> intentoUnir
