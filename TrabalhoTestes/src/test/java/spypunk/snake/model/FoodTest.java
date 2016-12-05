/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spypunk.snake.model;

import java.awt.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author icorrea
 */
public class FoodTest {
    
    public FoodTest() {
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



    /**
     * Test of getType method, of class Food.
     */
    @Test
    public void testGetType1() {
        System.out.println("getType");
        
        Food instance = new Food();
        Food.Type normal = Food.Type.NORMAL;
        //Food.Type bonus = Food.Type.BONUS;
        
        Food.Type teste = Food.Type.NORMAL;
        instance.setType(teste);
        
        System.out.print("Eita: " + instance.getType());
        
        assertEquals(instance.getType(), normal);
    }
    
    @Test
    public void testGetType2() {
        System.out.println("getType");
        
        Food instance = new Food();
        //Food.Type normal = Food.Type.NORMAL;
        Food.Type bonus = Food.Type.BONUS;
        
        Food.Type teste = Food.Type.NORMAL;
        instance.setType(teste);
        
        System.out.print("Eita: " + instance.getType());
        assertEquals(instance.getType(), bonus);
    }
    
    @Test
    public void testGetScore(){
        Food instance = new Food();
        Food.Type bonus = Food.Type.BONUS;
        instance.setType(bonus);
        assertEquals(instance.getType().getPoints(), 50);
    }
}
