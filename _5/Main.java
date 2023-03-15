package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        //declaring the initial value
        int num = 10;
        //adding 1
        num++;
        System.out.println(num);
        //removing 1
        num--;
        System.out.println(num);

    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //declaring the initial value
        double num = 10;
        //multipling by 2
        num = num  * 2;
        System.out.println(num);
        //dividing by 2
        double divideNum = num / 2;
        System.out.println(divideNum);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and Fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //setting the temperature value in celsius
        double celsius = 20;
        // declaring the operation to convert celsius to fahrenheit
        double fahrenheit = celsius * 1.8 + 32;
        //out the temperature in celsius
        System.out.println(celsius);
        //out the temperature in fahrenheit
        System.out.println(fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        //declaring the initial value
        int age = 10;
        age++;
        age++;
        age++;              //adding 1 value to age variable until reach 15
        age++;
        age++;
        //out the final age result
        System.out.println(age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        //declaring the iniatial age value
        int age = 50;
        //setting the operation
        age -= 50;
        //printing the final result
        System.out.println(age);
        //declaring the second age value
        int secondAge = 50;
        //setting the value for the next operation
        int changeValue = 25;
        //dividing the value secondAge with the changeValue
        secondAge /= changeValue;
        //removing the last unit to obtain 0
        secondAge--;
        secondAge--;
        //printing the result
        System.out.println(secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 5;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
