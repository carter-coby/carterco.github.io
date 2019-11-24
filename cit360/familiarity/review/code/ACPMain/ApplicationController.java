/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.ACPMain;

import java.util.HashMap;
import familiarity.review.code.ACPHandlers.Handler;
import familiarity.review.code.ACPHandlers.addGameHandler;
import familiarity.review.code.ACPHandlers.displayMenuHandler;
import familiarity.review.code.ACPHandlers.viewGamesHandler;
/**
 *
 * @author cobyc
 */
public class ApplicationController {
    private HashMap<String, Handler> options;
    
    public ApplicationController()
    {
        options = new HashMap<String, Handler>();
        options.put("addGame", new addGameHandler());
        options.put("viewGames", new viewGamesHandler());
        options.put("displayMenu", new displayMenuHandler());
    }
    
    public Object selectOption(String option, HashMap<String, Object> optionData)
    {
        Handler action = options.getOrDefault(option, null);
        return action.handleIt(optionData);
    }
}
