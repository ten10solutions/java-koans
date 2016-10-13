package test;

import main.Maps;
import org.junit.Test;

import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by C0952236 on 10/10/2016.
 */
public class MapsCheckYourWork {

    private static Maps maps = new Maps();

    // 1. We can see how many entries our Map has
    @Test
    public void testingMapSize(){
        int mapSize = maps.sizeOfMap();
        int answer = maps.numberOfEntries;
        assertEquals("\nTry again, the expected size of the map was not returned",mapSize,answer);
        System.out.print("CORRECT, the map size was : " + mapSize);
    }

    // 2. We can access Map keys to get the value associated
    @Test
    public void testingValuesFromMap(){
        String value = maps.valuesFromMap();
        String answer = maps.questionTwoAnswer;
        assertEquals("\nTry again, the expected value from the map was not returned",value, answer);
        System.out.print("CORRECT, the expected value was : " + value);
    }

    // 3. We can add to our Map
    @Test
    public void testingAddToMap(){
        String value = maps.addToMap("Pork and Beans");
        String answer = maps.questionThreeLunch;
        assertEquals("\nNot quite what I want for lunch, Remember I am passing what I want to you",value, answer);
        System.out.println("CORRECT, I did want " + value + " for lunch");
    }

    // 4. We can see if our dictionary has a key
    @Test
    public void testingMapHasKey(){
        Boolean trueBool = true;
        String answer = maps.questionFourAnswer;
        Boolean containsKey = maps.isKeyInMap();
        assertEquals("\n" + answer + " Is not in a key in the map, try a different key.",trueBool,containsKey);
        System.out.println("CORRECT, " + answer + " was a key in the map!!");
    }

    // 5. We can add a dictionary into another dictionary
    @Test
    public void testingAddDictionaryToDictionary(){
        String key = "Snack";
        String value = "Chocolate bar";
        Map<String, String> answerMap = maps.addMapToMap(key,value);
        assertTrue("\n Try Again, the map returned does not include the new map, try looking at the method parameters", answerMap.containsKey(key));
        String answervalue = answerMap.get(key);
        assertEquals("I LIKE CHICKEN ",value, answervalue);
    }
}
