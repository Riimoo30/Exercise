package javabasics._6;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * 1: Create a double variable called value, create another double variable called valueSquareRoot
     *
     *    Use Math.sqrt to find the square root of value and assign it to valueSquareRoot
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        //setting the initial value
        double value = 16;
        //setting the square root operation from the 'value' variable
        double valueSquareRoot = Math.sqrt(value);
        //printing the square root of the initial value
        System.out.println(valueSquareRoot);
    }

    /**
     * 2: See the code below
     *
     *    Print out the highest value using Math.max()
     *
     *    Then print out the lowest value using Math.min()
     *
     *    You must put your variables into these methods and separate them with a comma
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int valueA = 5;
        int valueB = 10;
        //printing the highest value
        System.out.println("Max=" + Math.max(valueA, valueB));
        //printing the lowest value
        System.out.println("Min=" + Math.min(valueA, valueB));

    }

    /**
     * 3: Use Modulus (%) to calculate the remaining amount of money if we buy as many burgers as possible, print remainder
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //Total money we have for lunch
        int totalMoney = 50;
        //The cost for each burger
        int costPerBurger = 9;
        //setting the operation to calculate how many burgers we can buy
        int moneyLeft = totalMoney % costPerBurger;
        //printing the money left after buying burgers
        System.out.println("Remainder=" + moneyLeft);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * I've chosen loads of methods from the Math Library, write comments above each line to guess what they do!
     *
     * You do not need to write any code
     *
     * Answers can be found in resources
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Bonus!):");

        double ourValue = 4.5;

        //Approssima il numero decimale per eccesso
        System.out.println(ourValue + " after using ceiling=" + Math.ceil(ourValue));
        //Approssima il numero decimale per difetto
        System.out.println(ourValue + " after using floor=" + Math.floor(ourValue));
        //Arrotonda il numero decimale in un intero
        System.out.println(ourValue + " after using round=" + Math.round(ourValue));
        //Viene effettuata la potenza del nostro valore iniziale alla seconda
        System.out.println(ourValue + " after using powerOf with the value of 2=" + Math.pow(ourValue, 2));
        //Viene effettuata la potenza del nostro valore iniziale alla terza
        System.out.println(ourValue + " after using powerOf with the value of 3=" + Math.pow(ourValue, 3));
        //Da un numero casuale tra il valore impostato e 0
        System.out.println(ourValue + " times random =" + Math.random() * ourValue);
    }
}