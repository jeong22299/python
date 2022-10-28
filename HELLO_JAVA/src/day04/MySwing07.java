package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MySwing07 extends JFrame {

	private JPanel contentPane;
	private JTextField tfCom;
	private JTextField tfMine;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing07 frame = new MySwing07();
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
	public MySwing07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMine = new JLabel("나 :");
		lblMine.setBounds(32, 32, 57, 15);
		contentPane.add(lblMine);
		
		JLabel lblCom = new JLabel("컴 :");
		lblCom.setBounds(32, 68, 57, 15);
		contentPane.add(lblCom);
		
		JLabel lblResult = new JLabel("결과 : ");
		lblResult.setBounds(32, 106, 57, 15);
		contentPane.add(lblResult);
		
		tfCom = new JTextField();
		tfCom.setBounds(101, 65, 57, 21);
		contentPane.add(tfCom);
		tfCom.setColumns(10);
		
		tfMine = new JTextField();
		tfMine.setColumns(10);
		tfMine.setBounds(101, 29, 57, 21);
		contentPane.add(tfMine);
		
		tfResult = new JTextField();
		tfResult.setColumns(10);
		tfResult.setBounds(101, 103, 57, 21);
		contentPane.add(tfResult);
		
		JButton btn = new JButton("게임하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}

		});
		btn.setBounds(32, 143, 126, 23);
		contentPane.add(btn);
	}
	private void myclick() {
		String mine = tfMine.getText();
		String com;
		String result;
		int game = (int)Math.random();
		
		if(game > 0.66) {
			com = "가위";
		}else if(game >0.33) {
			com = "바위";
		}else {
			com = "보";
		}
		
		if(com.equals(mine)) {
			result = "비김";
		}else if(com.equals("가위")&& mine.equals("바위")||
				 com.equals("바위") && mine.equals("보") ||
				 com.equals("보") && mine.equals("가위")) {
			result = "이김";
		}else {
			result = "짐";
		}
		
//		if(com.equals("가위")&& mine.equals("가위"))  result = "비김";
//		if(com.equals("가위")&& mine.equals("바위"))  result = "이김";
//		if(com.equals("가위")&& mine.equals("보"))    result = "짐";
//		
//		if(com.equals("바위")&& mine.equals("가위"))  result = "짐";
//		if(com.equals("바위")&& mine.equals("바위"))  result = "비김";
//		if(com.equals("바위")&& mine.equals("보"))    result = "이김";
//		
//		if(com.equals("보")&& mine.equals("가위"))  result = "이김";
//		if(com.equals("보")&& mine.equals("바위"))  result = "짐";
//		if(com.equals("보")&& mine.equals("보"))    result = "비김";
		
		
		tfCom.setText(com);
		tfResult.setText(result);
		
	}
}



















