
import javax.swing.*;

public class CipherSimulator {
    public static void showGUI() {
        JFrame frame = new JFrame("Encrypt/Decrypt");
        frame.setSize(400, 300);

        JLabel inputLabel = new JLabel("Enter Text:");
        JTextField inputField = new JTextField(20);
        JButton encryptButton = new JButton("Encrypt");
        JButton decryptButton = new JButton("Decrypt");
        JTextArea resultArea = new JTextArea(5, 20);

        encryptButton.addActionListener(e -> {
            String text = inputField.getText();
            String encrypted = caesarCipher(text, 3);
            resultArea.setText("Encrypted: " + encrypted);
        });

        decryptButton.addActionListener(e -> {
            String text = inputField.getText();
            String decrypted = caesarCipher(text, -3);
            resultArea.setText("Decrypted: " + decrypted);
        });

        JPanel panel = new JPanel();
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(encryptButton);
        panel.add(decryptButton);
        panel.add(new JScrollPane(resultArea));

        frame.add(panel);
        frame.setVisible(true);
    }

    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + shift + 26) % 26 + base);
            }
            result.append(c);
        }
        return result.toString();
    }
}
