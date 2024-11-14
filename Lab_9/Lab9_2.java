package Lab_9;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class Lab9_2 extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JTextField input1, input2, result;
    private JButton addButton, subButton, multiplyButton, resetButton;

    public Lab9_2() {
        super("Simple Calculator");
        label1 = new JLabel("Enter First Number:");
        input1 = new JTextField(10);
        label2 = new JLabel("Enter Second Number:");
        input2 = new JTextField(10);
        label3 = new JLabel("Result:");
        result = new JTextField(10);
        result.setEditable(false);
        addButton = new JButton("Add");
        subButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        resetButton = new JButton("Reset");
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        resetButton.addActionListener(this);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 5, 5));
        panel.add(label1);
        panel.add(input1);
        panel.add(label2);
        panel.add(input2);
        panel.add(label3);
        panel.add(result);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(multiplyButton);
        panel.add(resetButton);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2, res;

        try {
            num1 = Double.parseDouble(input1.getText());
            num2 = Double.parseDouble(input2.getText());
            if (e.getSource() == addButton) {
                res = num1 + num2;
            } else if (e.getSource() == subButton) {
                res = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                res = num1 * num2;
            } else {
                res = 0;
            }
            result.setText(String.valueOf(res));
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter numbers only.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Lab9_2();
    }
}
