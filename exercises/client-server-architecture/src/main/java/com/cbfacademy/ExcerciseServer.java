package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.DocFlavor.STRING;

//aim is to listen on port 4040, next excercise will commuunicate with port 4040. application client runs and exits, server is constantly listening
//think of apartments and numbers, communicating by entering and exiting
public class ExcerciseServer {
   public static void main(String[] args) {
    try (ServerSocket serverSocket = new ServerSocket(4040)) {
        System.out.println("Server is listening on port 4040...");
        while (true) {
            try(Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){
            String message = in.readLine();

            System.out.println("Received message from client: " + message);
           
            
            
        }
    }
    } catch (IOException e) {
        e.printStackTrace();
    }
   }

    //use .close 
}
