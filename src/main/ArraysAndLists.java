package main;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by jack.forman on 05/10/2016.
 */
public class ArraysAndLists {

//  1. We can assign a new array full of values
    public int newArray(){
        int[] myNewArray = {1,2,3,4};
        int theThirdNumber = myNewArray[3];
        System.out.print(theThirdNumber);
        return theThirdNumber;
        }

//  2. We can create an Array by its size
    public void newArrayBySize(){
        int[] myNewArray = new int[10];
        System.out.print(myNewArray);
    }

//  2. We can't add to an Array - introducing the List

    public List<Integer> addToAList(){
        List<Integer> myNewList = new ArrayList<>();
        myNewList.add(1);

        System.out.print(myNewList);
        return myNewList;
    }

//  3. We can access the values of a List
    public int accessListValues(){
        List<Integer> mySimpleList = Arrays.asList(1, 3, 5, 7, 9);
        int theFourthValue = mySimpleList.get(2);
        System.out.print(theFourthValue);
        return theFourthValue;
    }



}
