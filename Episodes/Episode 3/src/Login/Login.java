package Login;

import javax.swing.*;
import java.awt.*;

public class Login {

    public static JTextField username;
    public static JTextField password;

    public void setLoginInfo(Container c, JFrame frame) {

        username = new JTextField();
        username.setText("Username");
        username.setSize(110, 30);
        username.setLocation(140, 140);
        c.add(username);

        password = new JTextField();
        password.setText("Password");
        password.setSize(110, 30);
        password.setLocation(255, 140);
        c.add(password);

        frame.setVisible(true);

    }
}
