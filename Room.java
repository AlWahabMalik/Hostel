import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Room {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(550, 300));
        frame.getContentPane().setBackground(Color.RED);
        frame.setVisible(true);
        JPanel pnl_login = new JPanel();
        JLabel lbl_login = new JLabel("Room Detail:");
        Font fnt_login = new Font("Serif", Font.BOLD, 27);
        lbl_login.setFont(fnt_login);
        pnl_login.add(lbl_login);
        JPanel pnl_fields = new JPanel();
        JLabel lbl_userroom = new JLabel("Room No:");
        JTextField txt_userroom = new JTextField();
        JLabel lbl_fees = new JLabel("Fees:");
        JTextField txt_fees = new JTextField();
        JLabel lbl_beds = new JLabel("NO of Beds");
        JTextField txt_beds = new JTextField();
        pnl_fields.add(lbl_userroom);
        pnl_fields.add(txt_userroom);
        pnl_fields.add(lbl_fees);
        pnl_fields.add(txt_fees);
        pnl_fields.add(lbl_beds);
        pnl_fields.add(txt_beds);
        pnl_fields.setLayout(new BoxLayout(pnl_fields, BoxLayout.Y_AXIS));
        JPanel pnl_btn = new JPanel();
        JButton btn_login = new JButton("Login");
        JButton btn_reset = new JButton("Reset");
        pnl_btn.add(btn_login);
        pnl_btn.add(btn_reset);
        pnl_btn.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setLayout(new BorderLayout(30, 40));
        frame.add(pnl_login, BorderLayout.NORTH);
        frame.add(pnl_fields, BorderLayout.CENTER);
        frame.add(pnl_btn, BorderLayout.SOUTH);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}