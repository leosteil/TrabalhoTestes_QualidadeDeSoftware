/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spypunk.snake.factory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import spypunk.snake.model.Snake;

/**
 *
 * @author icorrea
 */
public class SnakeFactoryImplTest {
    
    SnakeFactoryImpl instance;
    Snake expResult;
    Snake result;
    
    public SnakeFactoryImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("createSnake");
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createSnake method, of class SnakeFactoryImpl.
     */
    @Test
    public void testCreateSnake() {
        instance = new SnakeFactoryImpl();
        result = instance.createSnake();
        assertNotNull(result.getClass());
    }
        
    /*Teste que verifica se a instância principal do jogo foi criada*/
    
}
