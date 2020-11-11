package es.florida;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MailSender {
    MailSender(String nombreFichero) throws IOException, InterruptedException {
        FileReader reader = new FileReader(nombreFichero);
        BufferedReader bReader = new BufferedReader(reader);
        String line;
        while ((line = bReader.readLine()) != null) {
            Thread.sleep(3000);
            System.out.println("Gracias por registrarte, "+line+"!");
        }
    }
}