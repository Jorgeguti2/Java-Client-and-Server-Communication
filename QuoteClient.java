/**
 * Modified DataClient so that it requests a quote from the quote server.
 *
 */

import java.io.*;
import java.net.*;

public class QuoteClient
{
    public  static void main(String[] args){
        try {
            //Creates a stream socket called 'soc' that establishes a connection to a server using the specified host adress and port number
            Socket soc = new Socket(InetAddress.getLocalHost(), 6017);
            /*
             * Creates a 'BufferedReader' object is used to read input from the console,
             * wrapped around an 'InputStreamReader' allows us to read line by line,
             * to read inpur from the server (recieve data from the server)
             */
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            //Outputs the server data to the console, until it encounters a line terminator at the end of the stream
            System.out.println(in.readLine());
        }

        catch (IOException ioe){
            System.err.println(ioe);
        }
    }
}
