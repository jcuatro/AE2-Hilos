package es.florida;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        String path = "./out/production/AE2/";
        ProcessBuilder builderCreator = new ProcessBuilder(  "java", "-cp", path, "es.florida.MemberCreator");
        java.lang.Process processCreator = builderCreator.start();
        processCreator.getInputStream();

        ProcessBuilder builderMonitor = new ProcessBuilder("java", "-cp", path, "es.florida.MemberMonitor");
        java.lang.Process processMonitor = builderMonitor.start();
        processMonitor.getInputStream();

        ProcessBuilder builderSender = new ProcessBuilder("java", "-cp", path, "es.florida.MailSender");
        java.lang.Process processSender = builderSender.start();
        processSender.getInputStream();

        InputStreamReader isrSender = new InputStreamReader(processSender.getInputStream());
        BufferedReader readerSender = new BufferedReader(isrSender);

        String lineSender;
        while((lineSender = readerSender.readLine()) != null) {
            System.out.println(lineSender);
        }
    }
}