package MainPage;

import SignUp.Signup;

import javax.swing.*;
import java.awt.*;

public class MainPage {

    JButton signup;
    JFrame mainFrame;

    public MainPage() {
        mainFrame = new JFrame("Main Signing Form");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        Container c = mainFrame.getContentPane();
        c.setLayout(null);

        JButton login = new JButton("Login");
        login.setSize(100, 40);
        login.setLocation(100, 200);
        login.addActionListener(e -> {
            if (e.getSource() == login) {
                Timer timer = new Timer(5, e1 -> {
                    login.setLocation(login.getX() - 5, 200);
                    signup.setLocation(signup.getX() - 5, 200);
                });
                timer.start();
                this.showSignup(c);
            }
        });
        c.add(login);

        signup = new JButton("Sign Up");
        signup.setSize(100, 40);
        signup.setLocation(225, 200);
        signup.addActionListener(e -> {
            if (e.getSource() == signup) {
                Timer timer = new Timer(5, e1 -> {
                    signup.setLocation(signup.getX() - 5, 200);
                    login.setLocation(login.getX() - 5, 200);
                });
                timer.start();
            }
        });
        c.add(signup);


        mainFrame.setSize(500, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    public void showSignup(Container c) {

        Signup signup = new Signup();
        signup.setSignupInfo(c, mainFrame);

    }


}
