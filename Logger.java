package Seminars.Sem5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    public static void logData(String msg) {
        Date currentTime = new Date();
        try (FileWriter file = new FileWriter("Log.log", true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(currentTime +": " + msg + "\n");
            file.append(sb);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
