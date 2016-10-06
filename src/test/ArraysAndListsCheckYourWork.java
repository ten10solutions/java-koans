package test;

import junit.framework.Assert;
import main.ArraysAndLists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

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
        arrays.newArrayBySize();
        //assertEquals("That doesnt look right? you think the third number == " + answer,3,answer);
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

}
