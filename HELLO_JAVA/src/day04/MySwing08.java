package day04;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing08 extends JFrame {

	private JPanel contentPane;
	private JTextField tfFirst;
	private JTextField tfLast;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing08 frame = new MySwing08();
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
	public MySwing08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 245, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirst = new JLabel("첫 별수 :");
		lblFirst.setBounds(41, 37, 57, 15);
		contentPane.add(lblFirst);
		
		JLabel lblLast = new JLabel("끝 별수  :");
		lblLast.setBounds(41, 73, 57, 15);
		contentPane.add(lblLast);
		
		tfFirst = new JTextField();
		tfFirst.setBounds(123, 34, 57, 21);
		contentPane.add(tfFirst);
		tfFirst.setColumns(10);
		
		tfLast = new JTextField();
		tfLast.setColumns(10);
		tfLast.setBounds(123, 70, 57, 21);
		contentPane.add(tfLast);
		
		JButton btn = new JButton("별 출력하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btn.setBounds(41, 101, 139, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(29, 134, 167, 193);
		contentPane.add(ta);
	}
	public String drawStar(int cnt) {
		String ret = "";
		for(int i=0; i<cnt; i++) {
			ret += "★";
		}
		ret+="\n";
		return ret;
	}

	private void myclick() {
		String firstStar = tfFirst.getText();
		String LastStar = tfLast.getText();
		int oneStar = Integer.parseInt(firstStar);
		int endStar = Integer.parseInt(LastStar);
		

		String star = "";
		for (int i= oneStar; i<endStar; i++) {
			star += drawStar(i);
			
		}
		ta.setText(star);
		
		
	}
}














