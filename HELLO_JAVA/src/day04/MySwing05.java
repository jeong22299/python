package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing05 extends JFrame {

	private JPanel contentPane;
	private JTextField tf_mine;
	private JTextField tf_com;
	private JTextField tf_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing05 frame = new MySwing05();
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
	public MySwing05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_mine = new JLabel("나");
		lbl_mine.setBounds(32, 27, 57, 21);
		contentPane.add(lbl_mine);
		
		JLabel lbl_result = new JLabel("결과");
		lbl_result.setBounds(32, 89, 57, 21);
		contentPane.add(lbl_result);
		
		JLabel lbl_com = new JLabel("컴");
		lbl_com.setBounds(32, 58, 57, 21);
		contentPane.add(lbl_com);
		
		tf_mine = new JTextField();
		tf_mine.setBounds(101, 27, 116, 21);
		contentPane.add(tf_mine);
		tf_mine.setColumns(10);
		
		tf_com = new JTextField();
		tf_com.setColumns(10);
		tf_com.setBounds(101, 58, 116, 21);
		contentPane.add(tf_com);
		
		tf_result = new JTextField();
		tf_result.setColumns(10);
		tf_result.setBounds(101, 89, 116, 21);
		contentPane.add(tf_result);
		
		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}

		});
		btn.setBounds(32, 131, 188, 23);
		contentPane.add(btn);
	}
	
	private void myclick() {
//		String a = tf_mine.getText();
//		int com = (int) (Math.random());
//		if (com>0.5) {
//			tf_com.setText("홀");
//		}else {
//			tf_com.setText("짝");
//		}
//		if(a.equals(tf_com.getText())) {
//			tf_result.setText("승리");
//		}else {		
//			tf_result.setText("패배");
//		}
		
		String mine = tf_mine.getText();
		String com = "";
		String result = "";
		
		double rnd = Math.random();
		if(rnd>0.5) {
			com = "홀";
		}else {
			com = "짝";
		}
		if(com.equals(mine)) {
			result ="승리";
		}else {
			result = "패배";
		}
		tf_com.setText(com);
		tf_result.setText(result);
		
	}
}





