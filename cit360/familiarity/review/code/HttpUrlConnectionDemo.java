package familiarity.review.code;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.OutputStream;

/**
 *
 * @author cobyc
 */
public class HttpUrlConnectionDemo {
    public static void main(String[] args) throws MalformedURLException, IOException
    {
        URL url = new URL("http://google.com");
        URL giturl = new URL("https://raw.githubusercontent.com/carter-coby/carterco.github.io/master/cit360/Model.java");
        String firsturl = url.toString();
        System.out.println("Your first URL is: " + firsturl);
        System.out.println("Your second URL is: " + giturl);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(giturl.openStream()))) {
                String inputLine;
                while((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
            } catch (IOException ioe) {
                ioe.printStackTrace(System.err);
            }
        /*
        This is the post part of the HttpsURLConnection. I can't actually post
        but the idea here is the same, and is what you would use
        if you had valid API's to use for posting content on a website.
        I'm using a dummy website that has fake data for this test.
        */
        URL apiurl = new URL("https://jsonplaceholder.typicode.com/posts/1");
        HttpURLConnection postCon = (HttpURLConnection)apiurl.openConnection();
        postCon.setDoOutput(true);
        postCon.setRequestMethod("PUT");
        try (OutputStreamWriter out = new OutputStreamWriter(
                postCon.getOutputStream())) {
            out.write("Content");
        }
    }
        
}
