package familiarity.review.code;

import java.io.FileReader; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*;

/**
 *
 * @author cobyc
 */
public class ReadJSON {
    public static void main(String[] args) throws Exception
    {
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\cobyc\\Documents\\github\\cit360\\Sample.json"));
        JSONObject json = (JSONObject) obj;
        String firstname = (String) json.get("firstname");
        String lastname = (String) json.get("lastname");
        long age = (long) json.get("age");
        String occupation = (String) json.get("occupation");
        System.out.println("Name:" + firstname + " " + lastname);
        System.out.println("Age:" + age);
        System.out.println("Occupation:" + occupation);
    }
}
