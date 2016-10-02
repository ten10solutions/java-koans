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
        assertEquals("You are stupid", strings.printAString(),("Hello World"));
    }

    @Test
    public void charToStringTest(){
        StringsMain strings = new StringsMain();
        assert (strings.charToString().equals("HEL"));
    }
}
