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
 * Created by C0952235 on 30/09/2016.
 */
public class checkYourWork {

    @Test
    public void printAString(){
        StringsMain strings = new StringsMain();
        assertEquals("Try making the string being printed, as below","Hello World!", strings.printAString());
    }

    @Test
    public void charToStringTest(){
        StringsMain strings = new StringsMain();
        assertEquals("You'll need to add each character in to the charArray individually as below","Hello World!",strings.charToString());
    }
}
