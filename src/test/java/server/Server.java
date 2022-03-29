package server;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        int portNum = 4446;
//        int portNum = Integer.parseInt(System.getProperty("Server"));

        HttpServer server = null;

        try {
            server = HttpServer.create();
            server.bind(new InetSocketAddress(portNum),0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpContext context = server.createContext("/", new Server.EchoHendler());
        HttpContext context2 = server.createContext("/text", new Server.EchoHendler2());

        server.setExecutor(null);
        server.start();
    }
    //страница 1
    static class EchoHendler implements HttpHandler{
        @Override
        public void handle(HttpExchange exchange) throws IOException{
            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s -> headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("header = " + o));

            for (String a : headers){
                if(a.contains("Hello")){
                    builder.append("Hello to, my friend");
                }
            }

            int a = 4;
            int b = 5;
            int context1 = a + b;
            String context2 = "This Server does sum a + b and this = ";

            builder.append(context2 + context1);
            byte [] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            exchange.close();
        }
    }

    static class EchoHendler2 implements HttpHandler{
        @Override
        public void handle(HttpExchange exchange) throws IOException{
            StringBuilder builder = new StringBuilder();
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(s -> headers.add(s.toString()));
            exchange.getRequestHeaders().values().forEach(o-> System.out.println("header = " + o));

            for (String a : headers){
                if(a.contains("Hello")){
                    builder.append("Hello to, my friend");
                }
            }

            String context3 = "This Server for Text";

            builder.append(context3);
            byte [] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(bytes);
            exchange.close();
        }
    }
}
