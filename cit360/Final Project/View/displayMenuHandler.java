/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.View;
import FinalProject.PokemonHandler;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author cobyc
 */
public class displayMenuHandler implements PokemonHandler {
    public displayMenuHandler()
    {
        
    }
    @Override
    public Object handleIt(HashMap<String, Object> data)
    {
        System.out.println("Please select an option from the menu below:");
        System.out.println("1.) View the Pokemon in your current party");
        System.out.println("2.) Add a new Pokemon to your party");
        System.out.println("3.) Remove a pokemon from your party");
        System.out.println("4.) Exit");
        
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        return selection;
    }
}
