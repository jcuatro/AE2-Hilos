package es.florida;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MemberCreator {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("ListaCorreos.txt");
        FileWriter writer = new FileWriter(file);
        PrintWriter printer = new PrintWriter(writer);
        for (int i = 1; i < 4; i++) {
            printer.println("ejemplo"+i+"@gmail.com");
            System.out.println("ejemplo"+i+"@gmail.com");
            Thread.sleep(3000);
        }
        printer.close();
    }
}