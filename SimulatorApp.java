import javax.swing.*;
import java.awt.event.*;

public class SimulatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cyber Security Simulator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Buttons for different features
        JButton passwordButton = new JButton("Password Strength Checker");
        JButton cipherButton = new JButton("Encrypt/Decrypt");
        JButton attackButton = new JButton("Password Generator"); // Updated button text

        // Set layout and add buttons
        JPanel panel = new JPanel();
        panel.add(passwordButton);
        panel.add(cipherButton);
        panel.add(attackButton);

        frame.add(panel);

        // Add Action Listeners for buttons
        passwordButton.addActionListener(e -> PasswordStrengthChecker.showGUI());
        cipherButton.addActionListener(e -> CipherSimulator.showGUI());
        attackButton.addActionListener(e -> PasswordGenerator.showGUI()); // Linked to PasswordGenerator

        frame.setVisible(true);
    }
}
