package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            LocalTime time = LocalTime.now();
            System.out.println("ACTUAL TIME: " + time.format(formatter));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}