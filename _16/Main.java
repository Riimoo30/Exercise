package javabasics._16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        System.out.println(celsiusToFahrenheit());
    }
    //Naming the function for its utility (Converting celsius to fahrenheit). And use the String method because
    //the function will return a String
     private static String celsiusToFahrenheit(){
        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";

        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        ourNames(names);
    }

    private static void ourNames (List <String> arrayNames) {
        //Function for print all names in uppercase and without spaces.
        for (String name : arrayNames) {
            boolean hasDigit = false;
            //converting the string into an array of character
            char[] charArray = name.toCharArray();
            //for each loop checking every character
            for (char ch : charArray) {
                //checking if the character has digit
                if (Character.isDigit(ch)){
                    hasDigit = true;
                }
            }
            //if the name has a digit print "Invalid"
            if(hasDigit == true){
                System.out.println("Invalid");
            }else System.out.println(name.toUpperCase().trim());
        }
    }
    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
        lunch();
    }
    private static void lunch(){
        double myLunchPrice = 5.99;
        System.out.println(myLunchPrice);
        String lunchType = "sandwich";
        System.out.println(lunchType);
        String description = "Nice big sandwich";
        System.out.println(description);
        int weightInGrams = 500;
        System.out.println(weightInGrams);
    }
}
