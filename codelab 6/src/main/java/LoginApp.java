import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp {
    private static JFrame loginFrame;

    public static void main(String[] args) {
        loginFrame = new JFrame("Form Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(400, 260);
        loginFrame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        loginFrame.add(panel);
        placeComponents(panel);
        loginFrame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Halaman Login");
        userLabel.setBounds(150, 10, 200, 25);
        panel.add(userLabel);

        JLabel userNameLabel = new JLabel("User Name:");
        userNameLabel.setBounds(50, 50, 80, 25);
        panel.add(userNameLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(150, 50, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 80, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 80, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Sign in");
        loginButton.setBounds(150, 110, 80, 25);
        panel.add(loginButton);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(150, 150, 300, 25);
        messageLabel.setForeground(Color.RED);
        panel.add(messageLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // akun
                if (username.equals("rizqy") && password.equals("123")) {
                    messageLabel.setText("");
                    JOptionPane.showMessageDialog(panel, "Login Sukses!");
                    loginFrame.dispose(); // Close the login frame
                    openNewWindow();
                } else {
                    messageLabel.setText("Password Atau Username Salah"); //kalau salah
                }
            }
        });
    }

    private static void openNewWindow() {
        JFrame newFrame = new JFrame("Form 2");
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(400, 260);
        newFrame.setLocationRelativeTo(null);

        JPanel newPanel = new JPanel();
        newPanel.setLayout(null);
        newFrame.add(newPanel);

        JLabel welcomeLabel = new JLabel("Halo sobat informatik", SwingConstants.CENTER);
        welcomeLabel.setBounds(100, 50, 200, 50);
        newPanel.add(welcomeLabel);

        JButton kembaliButton = new JButton("Selesai");
        kembaliButton.setBounds(150, 150, 100, 25);
        newPanel.add(kembaliButton);

        kembaliButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFrame.dispose(); // Close the new frame
                System.exit(0); // Exit the program
            }
        });

        newFrame.setVisible(true);
    }
}
