package com.cbfacademy.strings;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
      return word1.concat(word2).concat(word3);
        // throw new RuntimeException("Not implemented");
    }

    public static Boolean areEqual(String word1, String word2) {
      return word1.equals(word2);
        // TODO: Write code to determine whether the input parameters are equal strings
        // throw new RuntimeException("Not implemented");

    }

    public static String format(String item, int quantity, double price) {
<<<<<<< HEAD
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        // return format("Item: %s. Price: %.2f. Quantity: %d. Date %s", item, price, quantity);
        // throw new RuntimeException("Not implemented");
          // Get the current date and format it as DD/MM/YYYY
        // SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        // String formattedDate = dateFormatter.format(new Date());

        // Format the string as required
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
 
=======
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[price]. Quantity: [quantity]". The price should be formatted to two decimal places, e.g. 99.99
        throw new RuntimeException("Not implemented");
>>>>>>> aa9a8f7a9cdd6151bae5bb9bf1ca8923b5ba87de
    }
}
