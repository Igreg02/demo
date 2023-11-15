package com.example;


import java.io.*;
import java.net.*;

public class Host {
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;
    private ServerSocket serverSocket;

    public Host() throws IOException {
        serverSocket = new ServerSocket(50000);
    }

    public void collegamento() throws IOException {
        InetAddress address = InetAddress.getLocalHost();


        //while (true) {
        clientSocket = serverSocket.accept(); // Aspetta e accetta connessioni in entrata

        System.out.println("Connessione accettata da: " + clientSocket.getInetAddress());
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        //}
    }
    public String inidirizzoserver() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        return address.getHostAddress();
    }

    public void inviomessaggio(String messaggio) {
        System.out.println("inviomessaggio() START\n");
        out.println(messaggio);
    }

    public String letturamessaggio() throws IOException {
        System.out.println("letturamessaggio() START\n");
        return in.readLine();
    }

    public void chiusura_communicazione() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    public void wait(String messaggio){

        do {
            System.out.println("Sto asppettando");

        }while("Ricevuto".equals(messaggio));

    }
}