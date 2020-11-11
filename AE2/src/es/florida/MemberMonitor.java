package es.florida;

import java.io.IOException;

public class MemberMonitor {
    public static void main(String[] args) throws IOException, InterruptedException {
        String file = "ListaCorreos.txt";
        new MailSender(file);
    }
}