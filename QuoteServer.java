/**
 * Quote server listening to port 6017.
 *
 */

/* import necessary libraries with appropriate methods to create server class */
import java.net.*;
import java.io.*;

public class QuoteServer {
    public static void main(String[] args){
        try {
            /* Open up a port on a new socket to receive connections through that port */
            ServerSocket sock = new ServerSocket(6017);

            /* now listen for connections */
            while (true) {
                /* Accepts connections to the 6017 port, connecting the client and server */
                Socket client = sock.accept();

                /* Use PrintWriter to write the quote below in the form of text on the console */
                PrintWriter pout = new
                        PrintWriter(client.getOutputStream(), true);

                /* write the Quote to the socket */
                pout.println("I LOVE CS!!!");

                /* close the socket and resume */
                /* listening for connections */
                client.close();

                /* close the server after it sends the quote and the client disconnects */
                break;
            }
        }
        catch (IOException ioe){
            System.err.println(ioe);
        }
    }
}
