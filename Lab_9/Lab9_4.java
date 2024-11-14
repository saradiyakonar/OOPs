package Lab_9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab9_4 extends JFrame implements ActionListener {

    private JLabel redLabel, greenLabel, blueLabel;
    private JComboBox<Integer> redComboBox, greenComboBox, blueComboBox;
    private JButton showButton;
    private JPanel colorPanel;

    public Lab9_4() {
        super("RGB Color Changer");
        redLabel = new JLabel("Red:");
        greenLabel = new JLabel("Green:");
        blueLabel = new JLabel("Blue:");

        Integer[] values = new Integer[256];
        for (int i = 0; i < 256; i++) {
            values[i] = i;
        }

        redComboBox = new JComboBox<>(values);
        greenComboBox = new JComboBox<>(values);
        blueComboBox = new JComboBox<>(values);

        showButton = new JButton("Show Color");
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        showButton.addActionListener(this);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(6, 10));
        labelPanel.add(redLabel);
        labelPanel.add(greenLabel);
        labelPanel.add(blueLabel);

        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.setLayout(new GridLayout(6, 10));
        comboBoxPanel.add(redComboBox);
        comboBoxPanel.add(greenComboBox);
        comboBoxPanel.add(blueComboBox);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(showButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(labelPanel, BorderLayout.WEST);
        getContentPane().add(comboBoxPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.EAST);
        getContentPane().add(colorPanel, BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == showButton) {

            int red = (int) redComboBox.getSelectedItem();
            int green = (int) greenComboBox.getSelectedItem();
            int blue = (int) blueComboBox.getSelectedItem();


            Color newColor = new Color(red, green, blue);
            colorPanel.setBackground(newColor);
        }
    }

    public static void main(String[] args) {
        new Lab9_4();
    }
}