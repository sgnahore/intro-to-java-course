package com.cbfacademy;

public class FizzBuzz {
    public static String of(Integer number){
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 5 == 0) return "Buzz";
        if (number % 3 == 0) return "Fizz";
        
        return number.toString();
        }
}