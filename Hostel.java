import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hostel extends JFrame implements ActionListener {
    JFrame frame = new JFrame("project");
    JButton btn_login = new JButton("Login");
    private JLabel lbl_result;
    private JButton btn_reset;

    Hostel() {
        this.setTitle("Application");
        Login obj = new Login();
        JPanel pnl_login = new JPanel();
        JLabel lbl_login = new JLabel("Hostel Management System:");
        Font fnt_login = new Font("Helvetica", Font.BOLD, 22);
        frame.getContentPane().setBackground(Color.YELLOW);
        lbl_login.setFont(fnt_login);
        pnl_login.add(lbl_login);
        JPanel pnl_fields = new JPanel();
        JLabel lbl_username = new JLabel("Enter Name:");
        JTextField txt_username = new JTextField();
        JLabel lbl_email = new JLabel("Email:");
        JTextField txt_email = new JTextField();
        JLabel lbl_phone = new JLabel("Phone NO");
        JTextField txt_phone = new JTextField();
        JLabel lbl_adress = new JLabel("Adress");
        JTextField txt_adress = new JTextField();
        JLabel lbl_room_no = new JLabel("Rooms No");
        JTextField txt_room_no = new JTextField();
        JLabel lbl_password = new JLabel("Enter Password:");
        JPasswordField txt_password = new JPasswordField();
        txt_password.setEchoChar('*');
        JCheckBox chk_rememeber = new JCheckBox("Remember Password");
        pnl_fields.add(lbl_username);
        pnl_fields.add(txt_username);
        pnl_fields.add(lbl_email);
        pnl_fields.add(txt_email);
        pnl_fields.add(lbl_phone);
        pnl_fields.add(txt_phone);
        pnl_fields.add(lbl_adress);
        pnl_fields.add(txt_adress);
        pnl_fields.add(lbl_room_no);
        pnl_fields.add(txt_room_no);
        pnl_fields.add(lbl_password);
        pnl_fields.add(txt_password);
        lbl_result = new JLabel();
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
            JOptionPane.showMessageDialog(null, "Conguration", null, JOptionPane.PLAIN_MESSAGE);
            Student s = new Student();
        }
    }

}