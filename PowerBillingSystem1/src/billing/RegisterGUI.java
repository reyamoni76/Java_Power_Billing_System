package billing;

import javax.swing.*;

public class RegisterGUI extends JFrame {

    public RegisterGUI() {

        setTitle("Register");
        setSize(300,200);
        setLayout(null);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20,20,80,25);
        add(l1);

        JTextField user = new JTextField();
        user.setBounds(100,20,150,25);
        add(user);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20,60,80,25);
        add(l2);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,60,150,25);
        add(pass);

        JButton regBtn = new JButton("Register");
        regBtn.setBounds(80,110,120,30);
        add(regBtn);

        regBtn.addActionListener(e -> {
            AuthService.register(user.getText(),
                    new String(pass.getPassword()));

            JOptionPane.showMessageDialog(this, "Registration Successful!");

            new LoginGUI(); // login page open
            dispose();
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
