import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Set the look and feel to Nimbus
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a JFrame
        JFrame frame = new JFrame("Simple Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Create a JPanel with a specific background color
        JPanel panel = new JPanel();
        panel.setBackground(new Color(220, 220, 220)); // Light gray background
        frame.add(panel);

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Customize the button
        button.setBackground(Color.BLUE); // Button background color
        button.setForeground(Color.WHITE); // Button text color
        button.setFont(new Font("Arial", Font.BOLD, 16)); // Button font
        button.setPreferredSize(new Dimension(120, 50)); // Button size

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display a dialog on button click
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        // Add button to panel
        panel.add(button);

        // Set frame visibility
        frame.setVisible(true);
    }
}
