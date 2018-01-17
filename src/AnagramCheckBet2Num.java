import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.*;

public class AnagramCheckBet2Num extends JPanel implements ActionListener, KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JButton jb1, jb2, jb3;
	static JTextArea jt1, jt2,jt3;
	static JLabel jl1,jl2,jl3,jl4;
	static String nums="", num1,num2;
	static String keyString;
	
	public void init() {
//        this.setPreferredSize(new Dimension(500, 500));
        this.addKeyListener(this);
    }
//	Timer tm=new Timer(5, this);
	public AnagramCheckBet2Num() {
//		tm.start();
//		addKeyListener(this);
//		setFocusable(true);
//		setFocusTraversalKeysEnabled(false);
	}

	public static void main(String[] args) {
		Font font = new Font("Arial", Font.PLAIN, 30);
		JFrame jf = new JFrame("ANAGRAM CHECKER");
		jf.getContentPane().setLayout(new GridLayout(5, 1));
//		jf.setFont(new Font("Arial", Font.BOLD, 50));
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.darkGray);
		jp1.setBounds(50, 50, 20, 68);
		jf.getContentPane().add(jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.darkGray);
		jp2.setBounds(50, 50, 20, 68);
		jf.getContentPane().add(jp2);
		
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.darkGray);
		jp3.setBounds(50, 50, 20, 68);
		jf.getContentPane().add(jp3);
		
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.darkGray);
		jp4.setBounds(50, 50, 20, 68);
		jf.getContentPane().add(jp4);
		
		JPanel jp5 = new JPanel();
		jp5.setBackground(Color.darkGray);
		jp5.setBounds(50, 50, 20, 68);
		jf.getContentPane().add(jp5);
		
// JLebel
		jl1=new JLabel("Input1" );
		jl1.setFont(new Font("Serif", Font.BOLD, 30));
		jl1.setForeground(Color.GREEN);
		jp1.add(jl1);
		
		jl2=new JLabel("Input2" );
		jl2.setFont(new Font("Serif", Font.BOLD, 30));
		jl2.setForeground(Color.GREEN);
		jp2.add(jl2);
		
		jl3=new JLabel("Output" );
		jl3.setFont(new Font("Serif", Font.BOLD, 30));
		jl3.setForeground(Color.GREEN);
		jp3.add(jl3);
		
		jl4=new JLabel("BIPRO " + (char)169 + " 2018" );
		jl4.setFont(new Font("Serif", Font.BOLD, 30));
		jl4.setForeground(Color.GREEN);
		jp5.add(jl4);
		
		jt1 = new JTextArea(1, 10);
		jt1.setBounds(00, 00, 00, 00);
		jt1.setFont(font);
//		jt1.setEditable(false);
		jt1.setLineWrap(true);
		jp1.add(jt1);
		
		jt2 = new JTextArea(1, 10);
		jt2.setBounds(00, 00, 00, 00);
		jt2.setFont(font);
//		jt1.setEditable(false);
		jt2.setLineWrap(true);
		jp2.add(jt2);
		
		jb1 = new JButton(" Check Anagram ");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String str1 = null, str2 = null;
				if (e.getSource() == jb1) {
					
					if((jt1.getText() == null) || (jt1.getText().equals(""))){
					jt3.setText("Fields cannot be empty");
					} else {
						str1 = jt1.getText();
					}
				
					if((jt2.getText() == null) || (jt2.getText().equals(""))){
					jt3.setText("Fields cannot be empty");
					} else {
						str2 = jt2.getText();
					}
						char[] ch1 = str1.toCharArray();
						char[] ch2 = str2.toCharArray();
						
						int sum1 = 0;
						for (int i = 0; i < ch1.length; i++) {
							sum1 += ch1[i];
						}
						
						int sum2 = 0;
						for (int j = 0; j < ch2.length; j++) {
							sum2 += ch2[j];
						}
						
						if (sum1 == sum2) {
							jt3.setText(" Anagram");
						} else {
							jt3.setText(" Not Anagram");
						}
						
					}	
				} catch (Exception e1) {
					// TODO: handle exception
				}
			} 
		});
		 jb1.setFont(font);
		jp4.add(jb1);
		
		jt3 = new JTextArea(1, 15);
		jt3.setBounds(00, 00, 00, 00);
		Font font2 = new Font("Arial", Font.PLAIN, 30);
		jt3.setFont(font2);
		jt3.setEditable(false);
		jt3.setLineWrap(true);
		jp3.add(jt3);
		
		
///////////////////////KeyKistener for Button
//		System.out.println(jt1.getText());
	   
		
	///////////////////////JButtons///////////////////////////////////////////////////

		
		//////////////////////JButtons Ends///////////////////////////
		jf.setSize(800, 400);
		jf.setLocation(500, 300);
		jf.setVisible(true);
		// jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == jb1) {
			JOptionPane.showConfirmDialog(jb3, "Hello from Dialog");
//		}
//
//		if (e.getActionCommand() == "1") {
//			JOptionPane.showConfirmDialog(jb1, "Hello from Dialog");
//		}
		
//		repaint();

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		keyString = "key code = " + keyCode + " (" + KeyEvent.getKeyText(keyCode) + ")";
        System.out.println(keyString);
		if (keyCode == KeyEvent.VK_ENTER || keyCode == KeyEvent.VK_ENTER) {
//			jb1.addActionListener(this);
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
