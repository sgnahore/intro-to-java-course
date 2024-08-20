package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
//io = input  output
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URLConnection;
import java.net.HttpURLConnection;

public class cbfWebsite {
    public static void main(String[] args) throws Exception {
        try {
            // specify content request
            //URL here is an objext, we are instantiating myURL

            URL myURL = new URI("https://codingblackfemales.com/").toURL();

            // takes open connection and converts it to its class type
            //casting
            //.openConnection() - identification, in place, not actually connected (think phone and cable)

            HttpURLConnection myURLConnection = (HttpURLConnection) myURL.openConnection();
            // extend its class
            //http method to retrieve, ref line 25
            myURLConnection.setRequestMethod("GET");

            //cable plugged in
            myURLConnection.connect();

            // process the information back
            // requests on the internet come back as a stream over the internet
            // InputStreamReader = input of type stream - live reading of input
            // bufferedreader = puts everything together in buffered packets
            try (BufferedReader in = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                    //print until nothing left in the buffer
                }
                // close the connection
                myURLConnection.disconnect();
            }

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}
