package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing03 extends JFrame {

	private JPanel contentPane;
	private JTextField tf01;
	private JTextField tf02;
	private JTextField tf03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing03 frame = new MySwing03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MySwing03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf01 = new JTextField();
		tf01.setBounds(86, 142, 45, 21);
		contentPane.add(tf01);
		tf01.setColumns(10);
		
		tf02 = new JTextField();
		tf02.setColumns(10);
		tf02.setBounds(170, 142, 45, 21);
		contentPane.add(tf02);
		
		tf03 = new JTextField();
		tf03.setColumns(10);
		tf03.setBounds(305, 142, 45, 21);
		contentPane.add(tf03);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(143, 145, 35, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				int su1 = Integer.parseInt(tf01.getText());
//				int su2 = Integer.parseInt(tf02.getText());
//				int su3 = su1 + su2;
//				tf03.setText(String.valueOf(su3));
				myclick();
			}

		});
		btnNewButton.setBounds(241, 141, 45, 23);
		contentPane.add(btnNewButton);
	}
	private void myclick() {
		String a = tf01.getText();
		String b = tf02.getText();
		
		int aa =Integer.parseInt(a); 
		int bb =Integer.parseInt(b); 
		int sum = aa + bb;
		
		tf03.setText(sum+"");
	}
}
