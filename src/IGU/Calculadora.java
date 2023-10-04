package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	float nro1=0;
	float nro2=0;
	String op;
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		txtValor = new JTextField();
		txtValor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtValor.setToolTipText("");
		panel.add(txtValor);
		txtValor.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btn7 = new JButton("7");
		panel_1.add(btn7);
		btn7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"7");
				
			}
			
		});
		
		JButton btn8 = new JButton("8");
		panel_1.add(btn8);
		btn8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"8");
				
			}
			
		});
		
		JButton btn9 = new JButton("9");
		panel_1.add(btn9);
		btn9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"9");
				
			}
			
		});
		
		JButton btnsum = new JButton("+");
		panel_1.add(btnsum);
		btnsum.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			try {
			System.out.println(txtValor.getText());
			nro1=Float.parseFloat(txtValor.getText());
			op="+";
			txtValor.setText("");
			}catch(Exception ex){
				ex.printStackTrace();
				ex.getCause();
				ex.getClass();
			}
			}
			
		});
		JButton btn4 = new JButton("4");
		panel_1.add(btn4);
		btn4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"4");
				
			}
			
		});
		
		JButton btn5 = new JButton("5");
		panel_1.add(btn5);
		btn5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"5");
				
			}
			
		});
		
		JButton btn6 = new JButton("6");
		panel_1.add(btn6);
		btn6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"6");
				
			}
			
		});
		
		JButton btnres = new JButton("-");
		panel_1.add(btnres);
		btnres.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			nro1=Float.parseFloat(txtValor.getText());
			op="-";
			txtValor.setText("");
			}
			
		});
		
		JButton btn1 = new JButton("1");
		panel_1.add(btn1);
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"1");
				
			}
			
		});
		
		JButton btn2 = new JButton("2");
		panel_1.add(btn2);
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"2");
				
			}
			
		});
		
		JButton btn3 = new JButton("3");
		panel_1.add(btn3);
		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"3");
				
			}
			
		});
		
		JButton btnmult = new JButton("*");
		panel_1.add(btnmult);
		btnmult.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			nro1=Float.parseFloat(txtValor.getText());
			op="*";
			txtValor.setText("");
			}
			
		});
		
		
		JButton btn0 = new JButton("0");
		panel_1.add(btn0);
		btn0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			txtValor.setText(txtValor.getText()+"0");
				
			}
			
		});
		
		JButton btndec = new JButton(".");
		panel_1.add(btndec);
		
		JButton btndiv = new JButton("/");
		panel_1.add(btndiv);
		btndiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			nro1=Float.parseFloat(txtValor.getText());
			op="/";
			txtValor.setText("");
			}
			
		});
		
		JButton btnequal = new JButton("=");
		panel_1.add(btnequal);
		btnequal.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			float result=0;
			try {
			nro2=Float.parseFloat(txtValor.getText());
			switch(op) {
			case "+":
				result=nro1+nro2;
				txtValor.setText(Float.toString(result));
				break;
			case "-":
				result=nro1-nro2;
				txtValor.setText(Float.toString(result));
				break;
			case "/":
				try {
					result=nro1/nro2;
					txtValor.setText(Float.toString(result));
				}catch(ArithmeticException ex) {
					txtValor.setText("MATH ERROR");
				}
				break;
			case "*":
				result=nro1*nro2;
				txtValor.setText(Float.toString(result));
				break;
			}
			}catch(Exception ex){
				ex.printStackTrace();
				txtValor.setText("Sintaxis Error");
			}
				
			}
			
		});
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText("");
			}
		});
		panel_2.add(clear);
	}

}
