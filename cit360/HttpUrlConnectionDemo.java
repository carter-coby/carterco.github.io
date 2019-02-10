package familiarity.review.code;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        }
    }
