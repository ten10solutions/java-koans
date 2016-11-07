

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



/**
 * Created by jack.forman on 05/10/2016.
 */
public class ArraysAndLists {

    /*****************************************************************
     *1. We can assign a new array full of values
     *****************************************************************/
    public int newArray(){
        int[] myNewArray = {1,2,3,4};
        int theThirdNumber = myNewArray[3];
        System.out.print(theThirdNumber);
        return theThirdNumber;
        }

    /*****************************************************************
     *2. We can create an Array by its size
     *****************************************************************/
    public int[] newArrayBySize(){
        int[] myNewArray = new int[10];
        myNewArray[0] = 1;
        myNewArray[1] = 2;
        return myNewArray;
    }

    /*****************************************************************
     *3. We can do something with each element of a list
     *****************************************************************/
    public int[] iterateThroughArray(){
        int[] myNewArray = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i<=9; i++){

            System.out.print(myNewArray[i]);
        }
        return myNewArray;
    }

    /*****************************************************************
     *4. We can sort the elements in an array
     *****************************************************************/
    public int[] sortArray(){
        int[] myUnsortedArray = {1,6,5,9,2,4,3,7,10};
        Arrays.sort(myUnsortedArray);
        return myUnsortedArray;
    }

    /*****************************************************************
     *5. We can't add to an Array - introducing the List
     *****************************************************************/
    public List<Integer> addToAList(){
        List<Integer> myNewList = new ArrayList<>();
        myNewList.add(1);
        System.out.print(myNewList);
        return myNewList;
    }

    /*****************************************************************
     *6. We can access the values of a List
     *****************************************************************/
    public int accessListValues(){
        List<Integer> mySimpleList = Arrays.asList(1, 3, 5, 7, 9);
        int theFourthValue = mySimpleList.get(2);
        System.out.print(theFourthValue);
        return theFourthValue;
    }

    /*****************************************************************
     *7. We can remove a value from a List
     *****************************************************************/
    public ArrayList<Integer> removeFromList() {
        ArrayList<Integer> myNewList = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        myNewList.remove(1);
        System.out.print("myNewList = " + myNewList);
        return myNewList;
    }

    /*****************************************************************
     *8. We can iterate through a list easily
     *****************************************************************/
    public ArrayList<Integer> iterateThroughArrayList(){
        ArrayList<Integer> myNewList = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        for (int i = 0; i<=4; i++){
            int value = myNewList.get(i);

        }
        System.out.print(myNewList);
        return myNewList;

    }

    /*****************************************************************
     *9. Or we can use an Iterator
     *****************************************************************/
    public ArrayList<Integer> useAnIterator(){
        ArrayList<Integer> myNewList = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        Iterator newIterator = myNewList.iterator();
        while(newIterator.hasNext()){
            System.out.print(newIterator.next());
        }
        return myNewList;
    }







}
