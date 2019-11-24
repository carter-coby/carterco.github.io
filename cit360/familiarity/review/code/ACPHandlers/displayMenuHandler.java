/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.ACPHandlers;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author cobyc
 */
public class displayMenuHandler implements Handler {
    public displayMenuHandler()
    {
        
    }
    @Override
    public Object handleIt(HashMap<String, Object> data)
    {
        System.out.println("Please select an option from the menu below:");
        System.out.println("1.) View games library");
        System.out.println("2.) Add a new game to the library");
        System.out.println("3.) Exit");
        
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        return selection;
    }
}
