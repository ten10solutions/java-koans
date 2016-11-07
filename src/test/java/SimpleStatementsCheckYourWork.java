import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by jack.forman on 10/10/2016.
 */
public class SimpleStatementsCheckYourWork {








    /*********************************************************************************************
     * DONT OPEN THIS FILE AS IT WILL BE LIKE OPENING ALL OF YOUR CHRISTMAS PRESENTS IN NOVEMBER
     *********************************************************************************************/
























    @Test
    public void ifStatementTest() {
        SimpleStatements statements = new SimpleStatements();
        String answer = statements.ifStatement();
        assertFalse("Try putting in your own name", "Jack".equals(answer));
    }

    @Test
    public void ifElseIfStatementTest() {
        SimpleStatements statements = new SimpleStatements();
        String answer = statements.ifElseIfStatement();
        assertFalse("Try putting in your own name", "Jack".equals(answer));
    }

    @Test
    public void loopNotListTest() {
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.loopNotLists();
        assertEquals("Lets make it count up to 150", 150, answer);
    }

    @Test
    public void whileLoopTest() {
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.whileLoop();
        assertEquals("Lets make it count from 150 to 300", 300, answer);
    }

    @Test
    public void forEachLoopTest() {
        SimpleStatements statements = new SimpleStatements();
        String answer = statements.forEachLoop();
        assertEquals("Alter the loop to return the expected String", "Dum", answer);
    }

    @Test
    public void breakLoopTest() {
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.breakLoop();
        assertEquals("Try changing the message so you return the expected value", 0, answer);
    }

    @Test
    public void continueLoopTest() {
        SimpleStatements statements = new SimpleStatements();
        int answer = statements.continueLoop();
        assertEquals("Look carefully at the loop itself", 11, answer);
    }

    @Test
    public void nestedLoopTest() {
        SimpleStatements statements = new SimpleStatements();
        ArrayList<Integer> answer = statements.nestedLoop();
        ArrayList<Integer> correctAnswer = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                correctAnswer.add(i + j);
            }
        }
        assertEquals("Look carefully at the loop itself", correctAnswer, answer);
        System.out.println("Yep, Good work");
    }

    @Test
    public void nestedIfTest() {
        SimpleStatements statements = new SimpleStatements();
        String answer = statements.nestedIf();
        assertNotEquals("That's my name, not yours!", "JackForman", answer);
        assertNotNull("Hmm, thats not right",answer);
        assertFalse("Make sure you put your own name and second name",answer.contains("Forman")||answer.contains("Jack"));
        System.out.println(String.format("Hi %s, well done, but thats only the start of Java", answer));
    }
}