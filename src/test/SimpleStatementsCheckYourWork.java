package test;

import main.ArraysAndLists;
import main.SimpleStatements;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertFalse;

/**
 * Created by jack.forman on 10/10/2016.
 */
public class SimpleStatementsCheckYourWork {

    @Test
    public void ifStatementTest(){
        SimpleStatements statements = new SimpleStatements();
        String answer = statements.ifStatement();
        assertFalse("Try putting in your own name" ,"Jack".equals(answer));
    }

    @Test
    public void ifElseIfStatementTest(){
        SimpleStatements statements = new SimpleStatements();
        String answer = statements.ifElseIfStatement();
        assertFalse("Try putting in your own name" ,"Jack".equals(answer));
    }

    @Test
    public void loopNotListTest(){
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.loopNotLists();
        assertEquals("Lets make it count up to 150" ,150,answer);
    }

    @Test
    public void whileLoopTest(){
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.whileLoop();
        assertEquals("Lets make it count from 150 to 300" ,300,answer);
    }

    @Test
    public void forEachLoopTest(){
        SimpleStatements statements = new SimpleStatements();
        String answer = statements.forEachLoop();
        assertEquals("Alter the loop to return the expected String" ,"Dum",answer);
    }

}
