/**
 * An echo client. The client enters data to the server, and the
 * server echoes the data back to the client.
 *
 */

import java.io.*;
import java.net.*;
/*
 * Declares a public class called 'EchoClient'
 */

public class EchoClient
{
    /*
     * Contains main method of this program
     */
    public  static void main(String[] args){
        /*
         * Declres the main method and its entry point
         */
        try {
            //Creates a stream socket called 'soc' that establishes a connection to a server using the specified host adress and port number
            Socket soc = new Socket(InetAddress.getLocalHost(), 6007);
            /*
             * Creates a 'BufferedReader' object is used to read input from the console,
             * wrapped around an 'InputStreamReader' allows us to read line by line,
             * to send data to the server
             */

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            //Output to distinguish between Client and Server response
            System.out.println("Client: ");
            System.out.println("Server: \n" + in.readLine());
            int x = 1;
            //A true while loop that creates a new socket and Buffer object on each iteration
            while(x == 1){
                soc = new Socket(InetAddress.getLocalHost(), 6007);
                in = new BufferedReader(new InputStreamReader(System.in));
                //Output to distinguish between CLient and Server response
                System.out.println("Client: ");
                System.out.println("Server: \n" + in.readLine());
            }
        }
        // If the connection is not made
        catch (IOException ioe){
            System.err.println(ioe);
        }
    }
}
