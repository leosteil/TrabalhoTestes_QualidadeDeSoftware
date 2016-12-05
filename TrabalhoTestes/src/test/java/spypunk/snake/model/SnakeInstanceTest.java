/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spypunk.snake.model;

import java.awt.Point;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
public class SnakeInstanceTest {
    
    public SnakeInstanceTest() {
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
    public void testGetStatus(){
        System.out.println("Teste de Status");
        
        SnakeInstance instance = new SnakeInstance();
        
        SnakeInstance.State running  = SnakeInstance.State.RUNNING;
        SnakeInstance.State paused = SnakeInstance.State.PAUSED;
        
        SnakeInstance.State teste = SnakeInstance.State.GAME_OVER;
        
        System.out.println("Verifica diferença");
        
        instance.setState(teste);
        
        assertNotEquals(instance.getState(), running);
    }
    
    @Test
    public void testGetScore(){
        SnakeInstance instance = new SnakeInstance();
        instance.setScore(-20000000);
        boolean teste = false;
        if(instance.getScore() == -20000000)
            teste = true;
        assertTrue(teste);
    }
}
