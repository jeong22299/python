package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MySwing09 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing09 frame = new MySwing09();
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
	public MySwing09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.RIGHT);
		tf.setBounds(26, 35, 139, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn1.setBounds(26, 66, 44, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn2.setBounds(73, 66, 44, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn3.setBounds(121, 66, 44, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn4.setBounds(26, 103, 44, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn5.setBounds(73, 103, 44, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn6.setBounds(121, 103, 44, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter()  {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn7.setBounds(26, 136, 44, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn8.setBounds(73, 136, 44, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn9.setBounds(121, 136, 44, 23);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick(e);
			}
		});
		btn0.setBounds(26, 169, 44, 23);
		contentPane.add(btn0);
		
		JButton btnCall = new JButton("CALL");
		btnCall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mycall();
			}
		});
		btnCall.setBounds(73, 169, 92, 23);
		contentPane.add(btnCall);
		
		
		// 선생님 방식!! 버튼 하나씩 누르지 않고!!
//		btn1.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {myclick(e);}});
//		btn0.addMouseListener(new MouseAdapter() {public void mouseClicked(MouseEvent e) {myclick(e);}});
	}

	
	private void myclick(MouseEvent e) {
		JButton b = (JButton) e.getSource();
		String str_new = b.getText();
		String str_old = tf.getText();
		tf.setText(str_old + str_new);
	}

	
	private void mycall() {
		String str_tel = tf.getText();
		JOptionPane.showMessageDialog(this, "calling\n" + str_tel);
	}
}
