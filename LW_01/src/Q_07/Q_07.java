package Q_07;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class Q_07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);

        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalTime now = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedTime = now.format(formatter);
                frame.setTitle(formattedTime);
            }
        }, 0, 1000); // Update every 1 second

        // Make frame visible
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
