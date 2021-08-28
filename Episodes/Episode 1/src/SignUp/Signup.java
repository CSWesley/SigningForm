package SignUp;

import javax.swing.*;
import java.awt.*;

public class Signup {

    public void setSignupInfo(Container c, JFrame frame) {

        JTextField username = new JTextField();
        username.setText("Username");
        username.setSize(110, 30);
        username.setLocation(140, 140);
        c.add(username);

        JTextField password = new JTextField();
        password.setText("Password");
        password.setSize(110, 30);
        password.setLocation(255, 140);
        c.add(password);

        JComboBox<Object> dob = new JComboBox<>();
        for (int i = 1; i < 16; i++) {
            Object object = Integer.toString(i);
            dob.addItem(object);
        }
        dob.setSize(120, 35);
        dob.setLocation(200, 185);
        c.add(dob);

        frame.setVisible(true);

    }
}
