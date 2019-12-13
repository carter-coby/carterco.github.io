/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Model;
import java.util.ArrayList;
/**
 *
 * @author cobyc
 */
public class Pokemon {

    private String name;
    private ArrayList<String> types;
    private ArrayList<String> moves;
    
    public Pokemon(String name, ArrayList<String> types, ArrayList<String> moves) {
        this.name = name;
        this.types = types;
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> type) {
        this.types = type;
    }

    public ArrayList<String> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<String> moves) {
        this.moves = moves;
    }
}
