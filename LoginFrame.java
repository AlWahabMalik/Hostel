import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    JButton btn_login;
    JButton btn_reset;
    JTextField txt_userid;
    JPasswordField txt_password;
    Dialog d;
    Login obj;
    JLabel lbl_result;

    LoginFrame() {
        this.setTitle("Application");
        obj = new Login();
        JPanel pnl_login = new JPanel();
        JLabel lbl_login = new JLabel("LOGIN");
        Font fnt_login = new Font("Helvetica", Font.BOLD, 22);
        lbl_login.setFont(fnt_login);
        pnl_login.add(lbl_login);
        JPanel pnl_fields = new JPanel();
        JLabel lbl_userid = new JLabel("Enter ID:");
        txt_userid = new JTextField();
        JLabel lbl_password = new JLabel("Enter Password:");
        txt_password = new JPasswordField();
        txt_password.setEchoChar('*');
        JCheckBox chk_rememeber = new JCheckBox("Remember Password");
        lbl_result = new JLabel();
        pnl_fields.add(lbl_userid);
        pnl_fields.add(txt_userid);
        pnl_fields.add(lbl_password);
        pnl_fields.add(txt_password);
        pnl_fields.add(chk_rememeber);
        pnl_fields.setLayout(new BoxLayout(pnl_fields, BoxLayout.Y_AXIS));
        JPanel pnl_btn = new JPanel();
        btn_login = new JButton("Login");
        btn_reset = new JButton("Reset");
        pnl_btn.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnl_btn.add(lbl_result);
        pnl_btn.add(btn_login);
        pnl_btn.add(btn_reset);
        btn_login.addActionListener(this);
        btn_reset.addActionListener(this);
        this.setLayout(new BorderLayout(0, 20));
        this.add(pnl_login, BorderLayout.NORTH);
        this.add(pnl_fields, BorderLayout.CENTER);
        this.add(pnl_btn, BorderLayout.SOUTH);
        this.setSize(400, 260);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_login) {
            char p[] = txt_password.getPassword();
            String password = new String(p);
            String userid = txt_userid.getText();
            boolean result = obj.validate(userid, password);
            if (result) {
                lbl_result.setForeground(Color.GREEN);
                lbl_result.setText("Login Successful.");
                Hostel h = new Hostel();

            } else {
                lbl_result.setForeground(Color.RED);
                lbl_result.setText("Invalid username or password.");
            }
        }
        if (e.getSource() == btn_reset) {
            txt_password.setText(null);
            txt_userid.setText(null);
            lbl_result.setText(null);
        }
    }
}