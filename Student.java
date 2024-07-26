import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Student implements ActionListener {
    JFrame frame = new JFrame("Project");
    JButton btn_login = new JButton("login");

    Student() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(550, 300));
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setVisible(true);
        JPanel pnl_login = new JPanel();
        JLabel lbl_login = new JLabel("Student Detail:");
        Font fnt_login = new Font("Serif", Font.BOLD, 27);
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
        pnl_fields.add(lbl_username);
        pnl_fields.add(txt_username);
        pnl_fields.add(lbl_email);
        pnl_fields.add(txt_email);
        pnl_fields.add(lbl_phone);
        pnl_fields.add(txt_phone);
        pnl_fields.add(lbl_adress);
        pnl_fields.add(txt_adress);
        pnl_fields.setLayout(new BoxLayout(pnl_fields, BoxLayout.Y_AXIS));
        JPanel pnl_btn = new JPanel();
        btn_login.addActionListener(this);
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

    public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn_login) {
			JOptionPane.showMessageDialog(null,"Conguration",null, JOptionPane.PLAIN_MESSAGE);
}
	}