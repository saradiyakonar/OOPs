package Lab_9;
import javax.swing.*;
import java.awt.*;

public class Lab9_1 extends JFrame {

    public Lab9_1() {
        super("Registration Form");
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        JLabel descriptionLabel = new JLabel("Description:");
        JTextArea descriptionArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(descriptionArea);
        JCheckBox agreeCheckbox = new JCheckBox("I agree to terms and conditions");
        JLabel subscribeLabel = new JLabel("Subscribe:");
        ButtonGroup group = new ButtonGroup();
        JRadioButton yesRadio = new JRadioButton("Yes");
        JRadioButton noRadio = new JRadioButton("No");
        group.add(yesRadio);
        group.add(noRadio);
        JButton registerButton = new JButton("Register");
        ImageIcon imageIcon = new ImageIcon("image.png");
        JLabel imageLabel = new JLabel(imageIcon);

        // Layout components
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        constraints.gridx = 0;
        constraints.gridy = 0;
        formPanel.add(nameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        formPanel.add(nameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        formPanel.add(emailLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        formPanel.add(emailField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        formPanel.add(descriptionLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        formPanel.add(scrollPane, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        formPanel.add(agreeCheckbox, constraints);

        constraints.gridwidth = 1;
        constraints.gridx = 0;
        constraints.gridy = 4;
        formPanel.add(subscribeLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        formPanel.add(yesRadio, constraints);

        constraints.gridx = 2;
        constraints.gridy = 4;
        formPanel.add(noRadio, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.CENTER;
        formPanel.add(registerButton, constraints);

        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTH;
        formPanel.add(imageLabel, constraints);
        add(formPanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab9_1();
    }
}