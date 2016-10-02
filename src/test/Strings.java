package test;

import com.sun.istack.internal.NotNull;
import main.MyUnit;
import org.junit.Ignore;
import org.junit.Test;
import org.omg.CORBA.OBJ_ADAPTER;
import org.omg.CORBA.Object;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by C0952235 on 30/09/2016.
 */
public class Strings {

    Boolean BLANK;
    int BLANKint;
    String printMe = "Hello World";
    String thenME = "Bonjour le monde";

//  1. Print Hello World to the console
    @Test
    public void printAString(){
        String helloWorld = "";
        System.out.print(helloWorld);
        assert (!helloWorld.equals(""));
    }

//  2. Now use a charArray to print Hello World to the console
    @Test
    public void charToString(){
        char[] helloArray = { 'H', };
        String helloString = new String(helloArray);
        System.out.println( helloString );
        assert (helloString.equals("Hello World"));

    }

//  3. Seek balance in quotation marks
    @Test
    public void quoteMarks(){
        String jacksQuote = "";
        System.out.println( jacksQuote );
        assert (jacksQuote.equals("Jack said 'I love Strings in Java'"));
}



}
