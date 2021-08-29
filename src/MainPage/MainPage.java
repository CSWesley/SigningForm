package MainPage;

import Login.Login;
import SignUp.Signup;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

public class MainPage {

    JButton signup;
    JButton back;
    JFrame mainFrame;
    JButton login;
    JButton confirmLogin;
    JButton confirmSignup;

    public MainPage() {
        mainFrame = new JFrame("Main Signing Form");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        Container c = mainFrame.getContentPane();
        c.setLayout(null);

        confirmLogin = new JButton("Confirm Login");
        confirmLogin.setSize(140, 30);
        confirmLogin.setLocation(165, 185);
        confirmLogin.addActionListener(e -> {
            if (e.getSource() == confirmLogin) {
                // Check if exists.
            }
        });
        confirmLogin.setVisible(false);
        c.add(confirmLogin);

        confirmSignup = new JButton("Confirm Signup");
        confirmSignup.setSize(140, 30);
        confirmSignup.setLocation(165, 225);
        confirmSignup.addActionListener(e -> {
            if (e.getSource() == confirmSignup) {
                // Log into SQL.
            }
        });
        confirmSignup.setVisible(false);
        c.add(confirmSignup);

        login = new JButton("Login");
        login.setSize(100, 40);
        login.setLocation(100, 200);
        login.addActionListener(e -> {
            if (e.getSource() == login) {
                showLogin(c);
                confirmLogin.setVisible(true);
            }
        });
        c.add(login);

        signup = new JButton("Sign Up");
        signup.setSize(100, 40);
        signup.setLocation(225, 200);
        signup.addActionListener(e -> {
            if (e.getSource() == signup) {
                this.showSignup(c);
                confirmSignup.setVisible(true);
            }
        });
        c.add(signup);

        back = new JButton("Back");
        back.setSize(110, 30);
        back.setLocation(200, 400);
        back.setVisible(false);
        back.addActionListener(e -> {
            if (e.getSource() == back) {
                if (Signup.username != null) {
                    hideAllSignups();
                    back.setVisible(false);

                    login.setVisible(true);
                    signup.setVisible(true);
                    if (Login.password != null) {
                        hideAllLogins();
                        back.setVisible(false);

                        login.setVisible(true);
                        signup.setVisible(true);
                    }
                } else if (Login.username != null) {
                    hideAllLogins();
                    back.setVisible(false);

                    login.setVisible(true);
                    signup.setVisible(true);
                    if (Signup.password != null) {
                        hideAllSignups();
                        back.setVisible(false);

                        login.setVisible(true);
                        signup.setVisible(true);
                    }
                }
            }
        });
        c.add(back);


        mainFrame.setSize(500, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    private void hideAllLogins() {
        Login.username.setVisible(false);
        Login.password.setVisible(false);
        confirmLogin.setVisible(false);
    }

    private void hideAllSignups() {
        Signup.password.setVisible(false);
        Signup.username.setVisible(false);
        Signup.dob.setVisible(false);
        confirmSignup.setVisible(false);
    }

    public void showSignup(Container c) {
        Signup signupT = new Signup();
        signupT.setSignupInfo(c, mainFrame);
        back.setVisible(true);

        login.setVisible(false);
        signup.setVisible(false);
    }

    public void showLogin(Container c) {
        Login loginT = new Login();
        loginT.setLoginInfo(c, mainFrame);
        back.setVisible(true);

        login.setVisible(false);
        signup.setVisible(false);
    }
}