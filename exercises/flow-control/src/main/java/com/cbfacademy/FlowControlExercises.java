package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        // it creates a list where for each element of the input list ${numbers}
        List<String> result = new ArrayList<>();

        for (Integer number : numbers) {
            // - if the ${element} is divisible by 3, it adds “Fizz” to the list

            if (number % 5 == 0 && number % 3 == 0) {
                result.add("FizzBuzz");

            } else if (number % 3 == 0) {
                result.add("Fizz");
            }
            // - if the ${element} is divisible by 5, it adds “Buzz” to the list

            else if (number % 5 == 0) {
                result.add("Buzz");
            }

            // - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the

            // - it adds the element to the list in any other case
            else {
                result.add(number.toString());
            }
            // - it returns the constructed list

        }

        return result;
    }

}

    public String whichMonth(Integer number) {
        //switch statement

        // TODO - Implement this method such that
        List<String> months = new ArrayList<>();
        months.add(0, "Invalid month number");
        months.add(1, "January");
        months.add(2, "February");
        months.add(3, "March");
        months.add(4, "April");
        months.add(5, "May");
        months.add(6, "June");
        months.add(7, "July");
        months.add(8, "August");
        months.add(9, "September");
        months.add(10, "October");
        months.add(11, "November");
        months.add(12, "December");

        if (number <= 0 || number >= 13) {
            return months.get(0);
        } else {
            return months.get(number);
        }

    // create a list of months
    // we then
    // if i => 13 or i <=0 then return invalid
    // else
    // for (int i = 0; i < numbers; i++){
    // - it returns the month corresponding to the input ${number}
    // - if the ${number} is invalid, the method should return "Invalid month
    // number"
    
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        // - creates and initialises a list of 100 numbers - from 1 to 100
        // - determines the sum of all the even numbers in the list
        // - determines the sum of all the odd numbers in the list
        // - returns a map with two entries:
        // {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        // - it takes an array list of integers
        // - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
