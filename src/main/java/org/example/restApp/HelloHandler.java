package org.example.restApp;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import jdk.jfr.ContentType;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {


    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String response = "{\"message\": \"Hello World\"}";

        exchange.getResponseHeaders().add("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, response.length());

        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
