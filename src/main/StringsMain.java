package main;

/**
 * Created by C0952235 on 30/09/2016.
 */
public class StringsMain {
// 1. print Hello World to the console
    public String printAString(){
        String helloWorld = "";
        System.out.print(helloWorld);
        return helloWorld;
    }

    public String charToString(){
        char[] helloArray = { 'H','E' };
        String helloString = new String(helloArray);
        System.out.println( helloString );
        return helloString;
    }

    public static void main(String [] args){
        StringsMain myClass = new StringsMain();
        myClass.printAString();
    }
}
