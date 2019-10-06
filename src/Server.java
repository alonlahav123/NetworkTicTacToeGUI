import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Scanner sc = new Scanner(System.in);
            int x, y;

            Socket client = serverSocket.accept();
            DataInputStream in = new DataInputStream(new BufferedInputStream(client.getInputStream()));
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());

            String msg = in.readLine();
            System.out.println(msg);

            while (true) {



            }

            out.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
