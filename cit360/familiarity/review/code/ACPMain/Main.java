/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.ACPMain;
import java.util.HashMap;
import java.util.Scanner;
import familiarity.review.code.ACPHandlers.Handler;
import familiarity.review.code.ACPModel.Games;
import java.util.ArrayList;
/**
 *
 * @author cobyc
 */
public class Main {
    public static void main(String[] args) {
        ApplicationController controller = new ApplicationController();
        Scanner scanner = new Scanner(System.in);
        Games myGames = new Games();
        int choice = -1;
        while (choice != 3)
        {
            choice = (int)controller.selectOption("displayMenu",GetChoice("scanner",scanner));
            switch(choice)
            {
                case 1: controller.selectOption("viewGames",GetChoice("Games",myGames));
                break;
                case 2: HashMap<String, Object>choiceInfo = GetChoice("scanner",scanner);
                choiceInfo.put("Games",myGames);
                controller.selectOption("addGame", choiceInfo);
                break;
                case 3: System.out.println("Now exiting...");
                break;
                default: System.out.println("Not a valid selection. Try again.");
                break;
            }
        }
        scanner.close();
    }
    public static HashMap<String, Object> GetChoice(String key, Object value) {
	HashMap<String, Object> data = new HashMap<String, Object>();
	data.put(key, value);
	return data;
    }
}
