package com.example.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingUtility {
    private static final String LOG_FILE = "log.txt";

    public static void log(String message) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            printWriter.println(timeStamp + " - " + message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
