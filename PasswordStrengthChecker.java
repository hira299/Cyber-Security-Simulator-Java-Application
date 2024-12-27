
import javax.swing.*;

public class PasswordStrengthChecker {
    public static void showGUI() {
        JFrame frame = new JFrame("Password Strength Checker");
        frame.setSize(400, 300);

        JLabel label = new JLabel("Enter Password:");
        JTextField passwordField = new JTextField(20);
        JButton checkButton = new JButton("Check Strength");
        JTextArea resultArea = new JTextArea(5, 20);

        checkButton.addActionListener(e -> {
            String password = passwordField.getText();
            String strength = checkStrength(password);
            resultArea.setText("Password Strength: " + strength);
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(passwordField);
        panel.add(checkButton);
        panel.add(new JScrollPane(resultArea));

        frame.add(panel);
        frame.setVisible(true);
    }

    public static String checkStrength(String password) {
        if (password.length() < 6) return "Weak";
        if (password.matches("[a-zA-Z]+")) return "Moderate";
        if (password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*].*")) return "Strong";
        return "Moderate";
    }
}
