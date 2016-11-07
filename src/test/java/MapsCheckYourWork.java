

import org.junit.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by C0952236 on 10/10/2016.
 */
public class MapsCheckYourWork {








    /*********************************************************************************************
     * DONT OPEN THIS FILE AS IT WILL BE LIKE OPENING ALL OF YOUR CHRISTMAS PRESENTS IN NOVEMBER
     *********************************************************************************************/
























    private static Maps maps = new Maps();

    // 1. We can see how many entries our Map has
    @Test
    public void mapSizeTest(){
        int mapSize = maps.sizeOfMap();
        int answer = maps.numberOfEntries;
        assertEquals("\nTry again, the expected size of the map was not returned",mapSize,answer);
        System.out.print("CORRECT, the map size was : " + mapSize);
    }

    // 2. We can access Map keys to get the value associated
    @Test
    public void valuesFromMapTest(){
        String value = maps.valuesFromMap();
        String answer = "Toast";
        assertEquals("\nTry again, the expected value from the map was not returned",value, answer);
        System.out.print("CORRECT, the expected value was : " + value);
    }

    // 3. We can add to our Map
    @Test
    public void addToMapTest(){
        String value = maps.addToMap("Pork and Beans");
        String answer = maps.questionThreeLunch;
        assertEquals("\nNot quite what I want for lunch, Remember I am passing what I want to you",value, answer);
        System.out.println("CORRECT, I did want " + value + " for lunch");
    }

    // 4. We can see if our dictionary has a key
    @Test
    public void mapHasKeyTest(){
        Boolean trueBool = true;
        Boolean containsKey = maps.isKeyInMap();
        String answer = maps.questionFourAnswer;
        assertEquals("\n" + answer + " Is not a key in the map: " + maps.hashMap + " try a different key.",trueBool,containsKey);
        System.out.println("CORRECT, " + answer + " was a key in the map!!");
    }

    // 5. We can add a dictionary into another dictionary
    @Test
    public void addMapToMapTest(){
        String key = "Snack";
        String value = "Chocolate bar";
        Map<String, String> answerMap = maps.addMapToMap(key,value);
        assertEquals("\n Try Again, the 'Snack' within the map returned was not as expected: ",
                value, answerMap.get(key));
        System.out.print("CORRECT, you added a map into another");
    }

    // 6. We can list the keys of a map
    @Test
    public void keysOfMapTest(){
        Set<String> resultSet = maps.keysOfMap();
        assertEquals("\n Key set returned was not the key set of 'hashMap': ", maps.hashMap.keySet(), resultSet);
        System.out.print("CORRECT, that was the expected key set");
    }

    //7. We can also list the values of a map
    @Test
    public void valueOfMapTest(){
        Collection<String> resultCollection = maps.valuesOfMap();
        assertEquals("\n Values returned were not the values of 'hashMap': ", maps.hashMap.values(), resultCollection);
        System.out.print("CORRECT, that was the expected values collection");
    }
}
