package main;

import java.text.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jack.forman on 10/10/2016.
 */
public class SimpleStatements {

//  1. Sometimes we need our code to make a decision
    public String ifStatement(){
        String name = "Jack";
        if (name.equals("Jack")){
            System.out.print("Hang on, you can't be Jack, thats my name" );
            return name;
        } else {
            System.out.print("Hi " + name);
            return name;
        }
    }

//  2. We can have as many choices as we want
    public String ifElseIfStatement() {
        String name = "Jack";
        if (name.equals("Jack")) {
            System.out.print("Hang on, you can't be Jack, thats my name");
            return name;
        } else if (name.equals("James")) {
            System.out.print("I work with another guy called James");
            return name;
        } else if (name.equals("Ryan")) {
            System.out.print("Ryans nickname is RyRy");
            return name;
        } else {
            System.out.print(String.format("Hi %s lets learn about JAVA", name));
            return name;
        }
    }

//  3. We can loop over other things as well as lists
    public int loopNotLists(){

        int countFrom = 0;
        int countUpTo = 10;
        for (int i=countFrom; i<=countUpTo ;i++){
            System.out.println(i);
        }
        return countUpTo;
    }

//  4. There's more than one way to Loop
    public int whileLoop(){
        int countFrom = 0;
        int countUpTo = 10;
        while (countFrom <= countUpTo){
            System.out.println(countFrom);
            countFrom += 1;
        }
        return countUpTo;
    }

//  5. There's more than 2 ways to Loop
    public String forEachLoop(){
        String newString = "Lets all loop in Java, duh duh de dum";
        List<String> loopStrings = new ArrayList<>(Arrays.asList("Lets", "all", "loop", "in", "Java", "duh", "duh", "de", "dum"));
        for (String word: loopStrings){
            System.out.print(word);
            if (word.equals("Dum")){
                return word;
            }
        }
        //Dont change this line of code
        return loopStrings.get(0);
    }

}
