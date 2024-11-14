package Lab_9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab9_3 extends JFrame implements ActionListener {

    private JList<String> colorList;
    private JButton changeButton;
    private JPanel colorPanel;

    public Lab9_3() {
        super("Color Changer");
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorList = new JList<>(colors);
        changeButton = new JButton("Change Color");
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);
        changeButton.addActionListener(this);
        JPanel listPanel = new JPanel();
        listPanel.add(colorList);
        listPanel.add(changeButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(listPanel, BorderLayout.WEST);
        getContentPane().add(colorPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeButton) {
            String selectedColor = (String) colorList.getSelectedValue();
            Color newColor = getColorByName(selectedColor);
            colorPanel.setBackground(newColor);
        }
    }

    private Color getColorByName(String colorName) {
        switch (colorName) {
            case "Red":
                return Color.RED;
            case "Green":
                return Color.GREEN;
            case "Blue":
                return Color.BLUE;
            case "Yellow":
                return Color.YELLOW;
            default:
                return Color.WHITE;
        }
    }

    public static void main(String[] args) {
        new Lab9_3();
    }
}
