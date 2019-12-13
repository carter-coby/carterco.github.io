/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cobyc
 */
public class PokemonTest {
    
    public ArrayList types = new ArrayList();
    public ArrayList moves = new ArrayList();
    public Pokemon pikachu = new Pokemon("Pikachu", types, moves);
    private void buildPokemon()
    {
        types.add("electric");
        moves.add("protect");
        moves.add("rock slide");
        moves.add("thunderbolt");
        moves.add("thunder wave");
    }
    
    public PokemonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        System.out.println("GETNAME TESTING");
        buildPokemon();
        String expResult = "Pikachu";
        String result = pikachu.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetName() {
        System.out.println("SETNAME TESTING");
        buildPokemon();
        String name = "golem";
        Pokemon instance = new Pokemon("Pikachu", types, moves);
        instance.setName(name);
        String oldName = pikachu.getName();
        String newName = instance.getName();
        assertNotNull(newName);
        assertNotEquals(newName, oldName);
    }

    @Test
    public void testSetTypes() {
        System.out.println("SETTYPES TESTING");
        buildPokemon();
        ArrayList<String> type = new ArrayList();
        type.add("water");
        type.add("ground");
        Pokemon instance = new Pokemon("Pikachu", types, moves);
        instance.setTypes(type);
        ArrayList oldTypes = pikachu.getTypes();
        ArrayList newTypes = instance.getTypes();
        assertNotNull(newTypes);
        assertNotEquals(newTypes, oldTypes);
    }

    @Test
    public void testGetMoves() {
        System.out.println("GETMOVES TESTING");
        buildPokemon();
        ArrayList<String> expResult = null;
        ArrayList<String> result = pikachu.getMoves();
        boolean Bool = false;
        if (expResult == result)
        {
            Bool = true;
        }
        assertFalse(Bool);
    }
    
}
