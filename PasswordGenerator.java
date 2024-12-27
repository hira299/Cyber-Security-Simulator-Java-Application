import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordGenerator {
    // Method to create and show the Password Generator GUI
    public static void showGUI() {
        // Create a frame
        JFrame frame = new JFrame("Password Generator");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        // Create a text field to display the password
        JTextField passwordField = new JTextField();
        passwordField.setBounds(20, 20, 250, 30);
        passwordField.setEditable(false);
        frame.add(passwordField);

        // Create a button
        JButton generateButton = new JButton("Generate Password");
        generateButton.setBounds(60, 70, 180, 30);
        frame.add(generateButton);

        // Add action listener to generate password
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = generatePassword(8); // Generate an 8-character password
                passwordField.setText(password);      // Display the password
            }
        });

        // Show the frame
        frame.setVisible(true);
    }

    // Helper method to generate a random password
    private static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
