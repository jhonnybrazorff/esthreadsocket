package com.threadsocket;

import java.net.Socket;
import java.io.*;
import java.net.*;
import java.util.Scanner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Server {
    
    private static final int PORT = 12345;
    public static void main(String[] args) {
        try(ServerSocket socket = new ServerSocket(PORT)){
         System.out.println("Server in ascolto sulla porta: " + PORT);
        
        while (true) {
            
            Socket clientSocket = socket.accept();

            ClientHandler ch = new ClientHandler(clientSocket);

            Thread th = new Thread(ch);
            th.start();

        }

        


        }catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }
}
