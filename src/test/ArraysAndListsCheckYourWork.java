package test;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import main.ArraysAndLists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by jack.forman on 05/10/2016.
 */
public class ArraysAndListsCheckYourWork {

    @Test
    public void newArrayTest(){
        ArraysAndLists arrays = new ArraysAndLists();
        int answer = arrays.newArray();
        assertEquals("That doesnt look right? you think the third number == " + answer,3,answer);
    }

    @Test
    public void newArrayBySizeTest(){
        ArraysAndLists arrays = new ArraysAndLists();
        int[] answer = {1,2,3,4,5,6,7,8,9,10};
        int[] result = arrays.newArrayBySize();
        try {
            assertTrue(Arrays.equals(answer, result));
        } catch (AssertionError e){
            System.out.println("Try adding some more values to your array, so it matches this: ");
            for(int val:answer){
                System.out.print(val+",");
            }
            fail();
        }
    }


    @Test
    public void addToAListTest(){
        ArraysAndLists arrays = new ArraysAndLists();
        List<Integer> result = arrays.addToAList();
        List<Integer> answer = Arrays.asList(1, 3, 5, 7, 9);
        assertEquals("Good list, but not quite what I am looking for ",answer,result);
    }

    @Test
    public void accessListValues(){
        ArraysAndLists arrays = new ArraysAndLists();
        int result = arrays.accessListValues();
        assertEquals("So you think the fourth value is " + result,7,result);
    }

    @Test
    public void iterateThroughArrayTest(){
        ArraysAndLists arrays = new ArraysAndLists();
        int[] answer = {2,3,4,5,6,7,8,9,10,11};
        int[] result = arrays.iterateThroughArray();
        try {
            assertTrue(Arrays.equals(answer, result));
        } catch (AssertionError e){
            System.out.println("\nTry adding in some code, to produce the following values - ");
            for(int val:answer){
                System.out.print(val);
            }
            fail();
        }
    }

    @Test
    public void sortArrayTest(){
        ArraysAndLists arrays = new ArraysAndLists();
        int[] answer = {1,2,3,4,5,6,7,8,9,10};
        int[] result = arrays.sortArray();
        try {
            assertTrue(Arrays.equals(answer, result));
            System.out.print("Yep!  You just needed to add an 8");
        } catch (AssertionError e){
            System.out.print("Are you sure there are enough values in your array?\n I'm looking for - ");
            for(int val:answer){
                System.out.print(val);
            }
            fail();
        }
    }

    @Test
    public void removeFromListTest() {
        ArraysAndLists arrays = new ArraysAndLists();
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 3, 7, 9));
        ArrayList<Integer> result = arrays.removeFromList();
        assertEquals("Try removing one value from the list so it matches the below",answer,result);
    }

    @Test
    public void iterateThroughArrayListTest() {
        ArraysAndLists arrays = new ArraysAndLists();
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayList<Integer> result = arrays.iterateThroughArrayList();

        assertEquals("I am using list.get() to get a value, maybe experiment with list.set() to change them " +
                "to match the below", answer,result);
    }

    @Test
    public void useAnIteratorTest() {
        ArraysAndLists arrays = new ArraysAndLists();
        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        ArrayList<Integer> result = arrays.useAnIterator();
        assertEquals("Try altering the values so they match the below", answer,result);
    }

}
