package com.Java8.MethodReference;

//Parse interface
interface Parser {

    public String parse(String s);
}

//Parser class
class ParseString {

    //static method for parsing
    public static String convert(String s) {
        String convertedString;

        if (s.length() >= 6) {
            convertedString = s.toUpperCase();
        } else {
            convertedString = s.toLowerCase();
        }

        return convertedString;
    }
}

//Printing class
class MyPrint {

    //its printing method
    public void print(String rawString, Parser p) {
        String convertedString = p.parse(rawString);
        System.out.println(convertedString);

    }
}

public class Test {
    public static void main(String[] args) {

        //our initial raw String
        String rawString = "Steve Rogers";

        //creating MyPrint class object to call its Print method
        MyPrint myPrint = new MyPrint();
        myPrint.print(rawString, new Parser() {

            @Override
            public String parse(String s) {
                return ParseString.convert(s);
            }
        });

    }
}
