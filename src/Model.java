import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
    * Skapat mars 2022-03-28 - 08:48
    * Model
    * Skriven av coolingen
    */
public class Model {
    public void Server() throws IOException {
        int port = 3444;
        ServerSocket serverSocket;
        Socket socket;
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                System.out.println("Waiting for connections!");
                socket = serverSocket.accept();
            }

            } catch(Exception e){
                System.out.println("Server fail");
            }
        }

}