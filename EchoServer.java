/**
 * An echo server listening on port 6007. This server reads from the client
 * and echoes back the result
 *
 */

/* import necessary libraries with appropriate methods to create server class */
import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args){
        try {
            /* Open up a port on a new socket to receive connections through that port */
            ServerSocket sock = new ServerSocket(6007);

            /* now listen for connections */
            while (true) {
                /* Accepts connections to the 6007 port, connecting the client and server */
                Socket client = sock.accept();

                /*
                 * Creates a 'BufferedReader' object used to read output from the console,
                 * wrapped around an 'InputStreamReader' which allows us to read line by line,
                 * to send data to the client
                 */
                BufferedReader out = new BufferedReader(new InputStreamReader(client.getInputStream()));

                /* Check to see if the client has closed its end of the socket connection */
                if(out.read() == -1) {
                    /* Close the server if the client disconnects */
                    break;
                }

                /* close the socket and resume */
                /* listening for connections */
                client.close();
            }
        }
        catch (IOException ioe){
            System.err.println(ioe);
        }
    }

}
