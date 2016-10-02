package test;

/**
 * Created by C0952235 on 30/09/2016.
 */

import main.MyUnit;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyUnitTest {


        @Test
        public void testConcatenate() {
            MyUnit newInstanceOfMyUnit = new MyUnit();

            String result = newInstanceOfMyUnit.concatenate("one", "two");

            assertEquals("onetwo", result);

        }


}
