package familiarity.review.code;

import java.io.File;
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import org.json.simple.JSONObject;

public class JSONExample
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //First we create the JSONObject and write it to a json file
        JSONObject jsonobj = new JSONObject();
        jsonobj.put("firstname","Joseph");
        jsonobj.put("lastname","Smith");
        jsonobj.put("age",32);
        jsonobj.put("occupation","prophet");
        //Create a test folder to place the json file in
        new File("C:\\test").mkdir();
        try (PrintWriter pw = new PrintWriter("C:\\test\\Sample.json")) {
            pw.write(jsonobj.toJSONString());
            pw.flush();
        }
        //Next we pull the data that we got from the jsonObj
        //And put it into a variable to use
        String firstname = (String) jsonobj.get("firstname");
        String lastname = (String) jsonobj.get("lastname");
        System.out.println("The First Name is: " + firstname);
        System.out.println("The Last Name is: " + lastname);
    }
}

