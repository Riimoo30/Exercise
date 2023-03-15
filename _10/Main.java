package javabasics._10;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * AND = &&
     * OR = ||
     * XOR = ^
     */

    /**
     * 1: Using an if statement, print: "Comfortable clothes" if the following conditions are met:
     * <p>
     * isWarm is true and wearingShorts is true
     * isWarm is false and wearingShorts is false
     * <p>
     * If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 30;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = true;
        //if is warm and you have short you are wearing comfortable clothes
        if (isWarm && wearingShorts) {
            System.out.println("Comfortable Clothes");
        //if you is not cold and you don't wear short or vice versa you aren't wearing comfortable clothes
        } else if (isWarm || wearingShorts){
            System.out.println("Uncomfortable Clothes");
        } else System.out.println("Comfortable Clothes");
    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with an if statement with the && (and)
     *    to check if someone is able to enter the club.
     *
     *    Their shoeType must be "fancy" AND they must be over 18 AND they must have at least 10 euros in their pocket
     *
     *    Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     *    or "stay out" if they don't.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";

        int age = 17;
        double eurosInPocket = 17.5;
        double eurosForEntry = 10;
        //declaring the condition if have enough money to enter
        boolean enoughMoney = eurosInPocket > eurosForEntry;
        //declaring if you are old enough to enter
        boolean enoughAge = age >= 18;
        //declaring the type of shoe needed to enter
        String requestedShoeType = "fancy";
       if(requestedShoeType.equals(shoeType) && enoughMoney && enoughAge){
           System.out.println("come in");
       } else System.out.println("stay out");


    }

    /**
     * 3: Write an if else statement to calculate our grade
     *
     *    If our grade is 90%+ of the total, we print "A"
     *    If our grade is 80%+ of the total, we print "B"
     *    If our grade is 70%+ of the total, we print "C"
     *    If our grade is 60%+ of the total, we print "D"
     *    If our grade is under 60% of the total, we print "F"
     *
     *    If 'isTestRetry' we cap the maximum grade at C
     *
     *    Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */
    private static void exercise3() {
        System.out.println("\nExercise 3 - Test Grader:");
        double ourTestScore = 9;
        double maxTestScore = 10;
        boolean isTestRetry = false;
        //setting the percentage operation for the test score
        double result = ourTestScore / maxTestScore * 100;
       //If the test was a retry you can't obtain more than a "C"
        if(result >= 90 && !isTestRetry){
            System.out.println("A");
        }else if(result >= 80 && !isTestRetry){
            System.out.println("B");
        }else if (result >= 70){
            System.out.println("C");
        }else if (result >= 60){
            System.out.println("D");
        }else System.out.println("F");
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ---------------------------------------------------------------------------------
     *    Write a XOR condition, print "safe" if only one car is driving down the road,
     *    print "CRASH! or No cars" if not.
     *
     *    XOR = ^
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = true;
        if(carIsDrivingFromRightToLeft ^ carIsDrivingFromLeftToRight){
            System.out.println("Is safe");
        }else System.out.println("CRASH! or no cars");

    }
}
