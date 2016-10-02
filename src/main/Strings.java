package main;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

/**
 * Created by C0952235 on 30/09/2016.
 */
public class Strings {

// 1. print Hello World to the console
    public String printAString(){
        String helloWorld = "";
        System.out.print(helloWorld);
        return helloWorld;
    }

//  2. Now use a charArray to print Hello World to the console
    public String charToString(){
        char[] helloArray = { 'H','E' };
        String helloString = new String(helloArray);
        System.out.println( helloString );
        return helloString;
    }

//  3. Seek balance in quotation marks - print the following and replace the blanks for punctuation
// -> Jack said __ I love Strings i Java __
    public String quoteMarks(){
        String jacksQuote = "";
        System.out.println( jacksQuote );
        return jacksQuote;
    }

//  4. We can use just part of a string
    public String partOfAString(){
        String largeString = "123456789";
        String smallString = largeString.substring(2);
        System.out.print(smallString);
        return smallString;
    }

//  5. We can make a collection of words from a string
    public String makeCollectionOfWords(){
        String breakfastOrder = "Bacon,Sausage,Egg,Tomato";
        String[] splitUpOrder = breakfastOrder.split(",");
        String myFavouriteBit = splitUpOrder[2];
        System.out.print(myFavouriteBit);
        return myFavouriteBit;
    }

//  6. We don't have to split on a comma
    public String splitWithoutComma(){
        String lunchOrder = "Tuna Mayonnaise Cucumber Butter";
        String[] splitUpOrder = lunchOrder.split("a");
        String myFavouriteBit = splitUpOrder[1];
        System.out.print(myFavouriteBit);
        return myFavouriteBit;
    }

//  7. We can join collections into a string
    public String joinCollectionsToString(){
        String[] splitUpDinnerOrder = {"Fish", "Chips", "Peas", "Curry Sauce"};
        String dinnerOrder = String.join("", splitUpDinnerOrder);
        System.out.print(dinnerOrder);
        return dinnerOrder;
    }

//  8. We can recase our strings easily
    public String reCaseStrings(){
        String lowerCase = "this is a lower case string";
        String upperCase = lowerCase.toUpperCase();
        String finalString = upperCase.toUpperCase();
        System.out.print(finalString);
        return finalString;

    }




}
