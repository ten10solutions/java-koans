
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertTrue;
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
        FileReader file = null;
        try {
            file = new FileReader("C:\\Temp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String fileContents = file.toString();
        System.out.print(file.toString());
        assertEquals("Alter the loop to return the expected String" ,"Dum",answer);
    }

    @Test
    public void breakLoopTest(){
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.breakLoop();
        assertEquals("Try changing the message so you return the expected value" ,0,answer);
    }

    @Test
    public void continueLoopTest(){
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.continueLoop();
        assertEquals("Look carefully at the loop itself" ,11,answer);
    }

    @Test
    public void nestedLoopTest(){
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.nestedLoop();
        assertEquals("Look carefully at the loop itself" ,11,answer);
    }

}
