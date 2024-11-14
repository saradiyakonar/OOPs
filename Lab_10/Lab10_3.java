package Lab_10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab10_3 extends JFrame implements ActionListener {

    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private long startTime;
    private boolean isRunning;

    public Lab10_3(){
        super("Stop Watch");

        timeLabel = new JLabel("00:00:00.000", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");


        timer = new Timer(100, this);
        timer.setInitialDelay(0);


        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);


        setLayout(new GridLayout(4, 1));
        add(timeLabel);
        add(startButton);
        add(stopButton);
        add(resetButton);


        isRunning = false;
        startTime = 0;

        startButton.setEnabled(true);
        stopButton.setEnabled(false);
        resetButton.setEnabled(false);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startButton) {
            isRunning = true;
            startTime = System.currentTimeMillis() - timer.getDelay();
            timer.start();


            startButton.setEnabled(false);
            stopButton.setEnabled(true);
            resetButton.setEnabled(false);

        } else if (source == stopButton) {
            isRunning = false;
            timer.stop();


            startButton.setEnabled(true);
            stopButton.setEnabled(false);
            resetButton.setEnabled(true);

        } else if (source == resetButton)
        {
            isRunning = false;
            timer.stop();
            timeLabel.setText("00:00:00.000");


            startTime = 0;
            startButton.setEnabled(true);
            stopButton.setEnabled(false);
            resetButton.setEnabled(false);

        }


        long elapsedTime = System.currentTimeMillis() - startTime;
        long seconds = elapsedTime / 1000;
        long milliseconds = elapsedTime % 1000;
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        timeLabel.setText(String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds % 60, milliseconds));

    }

    public static void main(String[] args) {
        new Lab10_3();
    }

}