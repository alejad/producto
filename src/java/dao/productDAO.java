package dao;

import bean.product;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;

public class productDAO {

    private int number;
    private String prod_name;
   
    URL url = getClass().getResource("products.json");

    public productDAO() {
    }

    public productDAO(product bean) {
        number = bean.getNumber();
        prod_name = bean.getProd_name();
    }

    public JsonObject productos() {
        JsonParser parser = new JsonParser();
        JsonObject jobject = null;
        FileReader fr;
        try {
            fr = new FileReader(url.getPath());
            JsonElement datos = parser.parse(fr);
            jobject = datos.getAsJsonObject();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return jobject;
    }

   
}
