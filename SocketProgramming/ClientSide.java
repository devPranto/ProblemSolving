package BackendEngineering.src.SocketProgramming;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {
    public static void main(String[] args) throws Exception{
        String ip="localhost";
        int port = 9999;
        Socket s= new Socket(ip,port);
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter ps= new PrintWriter(os);
        os.write("HI IAM DADDY");//buffered reader or input stream reader
os.flush();
    }
}
