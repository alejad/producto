package dao;

import bean.coupon;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.net.URL;

public class couponDAO {

    private int id;
    private String name;
    private String description;
    private int product_id;
    private String valid_since;
    private String valid_until;
    URL url = getClass().getResource("bono.json");

    public couponDAO() {
    }

    public couponDAO(coupon bean) {
        id = bean.getId();
        name = bean.getName();
        description = bean.getDescription();
        product_id = bean.getProduct_id();
        valid_since = bean.getValid_since();
        valid_until = bean.getValid_until();

    }

    public JsonObject coupon() {
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
