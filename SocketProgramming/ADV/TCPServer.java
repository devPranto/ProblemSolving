package BackendEngineering.src.SocketProgramming.ADV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private  final int port;

    public TCPServer(int port){
        this.port=port;
    }
    public void start() throws IOException {
        ServerSocket ss= new ServerSocket(this.port);
        System.out.println("Server Started");
        Socket client=ss.accept();
        System.out.println("client connected");

        //client request
        BufferedReader request= new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter response = new PrintWriter(client.getOutputStream());
        String str= request.readLine();
        while (!str.isEmpty()){
            System.out.println("From Client : "+str);
            response.println(str);
            str=request.readLine();
        }

    }
    public void releaseDisconnectedClient(BufferedReader req, PrintWriter res , Socket client ) throws Exception{
        if (req!=null) req.close();
        if (res!=null)res.close();
        if (client!=null) client.close();
    }

    public static void main(String[] args) throws IOException {
        TCPServer tcpServer= new TCPServer(9999);
        tcpServer.start();

    }
}
