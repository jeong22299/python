package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing10 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	String com = String.valueOf((int)(Math.random()*10)+99);
	private JTextArea ta;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing10 frame = new MySwing10();
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
	public MySwing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("세자리 수 : ");
		lbl.setBounds(43, 47, 78, 15);
		contentPane.add(lbl);
		
		tf = new JTextField();
		tf.setBounds(143, 44, 68, 21);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn = new JButton("맞추기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(43, 75, 86, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(43, 108, 168, 218);
		contentPane.add(ta);
		
		btnReset = new JButton("리셋");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myreset();
			}

		});
		btnReset.setBounds(141, 75, 70, 23);
		contentPane.add(btnReset);
	}
	

	private void myreset() {
		ta.setText("");
		int ran = (int) ((Math.random()*10)+99);
		com = "" +ran;
	}
	
	public int getStrike(String com, String mine) {
		int cnt = 0;
		String c1 = com.substring(0, 1);
		String c2 = com.substring(1, 2);
		String c3 = com.substring(2, 3);
		
		String m1 = mine.substring(0, 1);
		String m2 = mine.substring(1, 2);
		String m3 = mine.substring(2, 3);
		
		if(c1.equals(m1)) cnt++; 
		if(c2.equals(m2)) cnt++; 
		if(c3.equals(m3)) cnt++; 
		return cnt;
	}
	public int getBall(String com, String mine) {
		int cnt = 0;
		String c1 = com.substring(0, 1);
		String c2 = com.substring(1, 2);
		String c3 = com.substring(2, 3);
		
		String m1 = mine.substring(0, 1);
		String m2 = mine.substring(1, 2);
		String m3 = mine.substring(2, 3);
		
		if(c1.equals(m2) || c1.equals(m3)) cnt++; 
		if(c2.equals(m1) || c2.equals(m3)) cnt++; 
		if(c3.equals(m1) || c3.equals(m2)) cnt++; 
		return cnt;
	}

	public void myclick() {
		String str_old = ta.getText();
		System.out.println(com);
		String mine = tf.getText();
		int s = getStrike(com, mine);
		int b = getBall(com, mine);
		String str_new = mine + " " + s + "S" + b +"B\n";
		
		ta.setText(str_old + str_new);
		tf.setText("");
		if(s == 3) {
			JOptionPane.showMessageDialog(this, mine + "을 맞췄습니다.");
		}
	}
	
}
