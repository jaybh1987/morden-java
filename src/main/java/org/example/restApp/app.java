package org.example.restApp;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class app {

    public static void main(String arg[]) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);


        server.setExecutor(null); // default executor
        server.start();

        System.out.println("Server started on port 8080");
    }

}
