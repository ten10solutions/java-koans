package test;

import com.sun.istack.internal.NotNull;
import main.MyUnit;
import main.StringsMain;
import org.junit.Ignore;
import org.junit.Test;
import org.omg.CORBA.OBJ_ADAPTER;
import org.omg.CORBA.Object;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
/**
 * Created by Jack Forman on 30/09/2016.
 */
public class checkYourWork {

    @Test
    public void printAStringTest(){
        StringsMain strings = new StringsMain();
        assertEquals("Try making the string being printed, as below","Hello World!", strings.printAString());
    }

    @Test
    public void charToStringTest(){
        StringsMain strings = new StringsMain();
        assertEquals("You'll need to add each character in to the charArray individually to make the expected below","Hello World!",strings.charToString());
    }

    @Test
    public void quoteMarksTest(){
        StringsMain strings = new StringsMain();
        assertEquals("You'll need to work out a way on including speach marks in a String",
                     "Jack said 'I love Strings in Java'",
                      strings.quoteMarks());
    }

    @Test
    public void partOfAStringTest(){
        StringsMain strings = new StringsMain();
        assertEquals("How can you just print the expected below",
                "789",
                strings.partOfAString());
    }

    @Test
    public void makeCollectionOfWordsTest(){
        StringsMain strings = new StringsMain();
        assertEquals("That's not my favourite bit!",
                "Bacon",
                strings.makeCollectionOfWords());
    }

    @Test
    public void splitWithoutCommaTest(){
        StringsMain strings = new StringsMain();
        assertEquals("That's not my favourite bit!",
                "Cucumber",
                strings.splitWithoutComma());
    }

}
