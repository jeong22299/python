package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing06 extends JFrame {

	private JPanel contentPane;
	private JTextField tfDan;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing06 frame = new MySwing06();
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
	public MySwing06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("출력단수 : ");
		lbl.setBounds(46, 48, 79, 15);
		contentPane.add(lbl);
		
		tfDan = new JTextField();
		tfDan.setBounds(137, 45, 75, 21);
		contentPane.add(tfDan);
		tfDan.setColumns(10);
		
		JButton btn = new JButton("출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(46, 73, 166, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(46, 106, 166, 180);
		contentPane.add(ta);
	}
	
	private void myclick() {
		String a = tfDan.getText();
		int dan = Integer.parseInt(a);
		String result = "";
		for(int i=1; i<10; i++) {
			result += String.format("%d X %d = %d\n", dan, i, dan*i);
			
			
		}
		//선생님방식
//			result += dan+"X"+1+"="+(dan*1)+"\n";
//			result += dan+"X"+2+"="+(dan*2)+"\n";
//			result += dan+"X"+3+"="+(dan*3)+"\n";
//			result += dan+"X"+4+"="+(dan*4)+"\n";
//			result += dan+"X"+5+"="+(dan*5)+"\n";
//			result += dan+"X"+6+"="+(dan*6)+"\n";
//			result += dan+"X"+7+"="+(dan*7)+"\n";
//			result += dan+"X"+8+"="+(dan*8)+"\n";
//			result += dan+"X"+9+"="+(dan*9)+"\n";
		ta.setText(result);			
		
	}
}
















