/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarity.review.code.ACPHandlers;
import familiarity.review.code.ACPModel.Games;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author cobyc
 */
public class viewGamesHandler implements Handler {
    @Override
    public Object handleIt(HashMap<String, Object>data)
    {
        Games gamesList = (Games)data.get("Games");
        gamesList.print();
        return null;
    }
}
