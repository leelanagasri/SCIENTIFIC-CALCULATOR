package Demo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main implements ActionListener{
	
	
	JFrame frame;
	JTextField tf1;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField tf2;
	JButton plus;
	JButton min;
	JButton mul;
	JButton div;
	JButton mod;
	JButton Allclear;
	JButton zero;
	JButton dzero;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton sin;
	JButton cos;
	JButton tan;
	JButton sinh;
	JButton cosh;
	JButton tanh;
	JButton sqrt;
	JButton sqr;
	JButton cbrt;
	JButton cb;
	JButton fact;
	JButton log;
	JButton back;
	JButton dec;
	
	public Main() {
		frame = new JFrame("Scientific Calculator");
		frame.setResizable(false);
		frame.setSize(400, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		tf1 = new JTextField(10);
		tf1.setBounds(20, 30, 170, 50);
		tf1.setEditable(true);
		tf1.setForeground(Color.black);
		tf1.setFont(new Font("Times New Roman",Font.BOLD,16));
		
		tf2 = new JTextField(10);
		tf2.setBounds(200, 30, 170, 50);
		tf2.setForeground(Color.black);
		tf2.setFont(new Font("Times New Roman",Font.BOLD,16));
		
		l1 = new JLabel("a");
		l1.setBounds(5, 30, 20, 50);
		l1.setForeground(Color.black);
		l1.setFont(new Font("Times New Roman",Font.BOLD,16));
		
		l2 = new JLabel("b");
		l2.setBounds(190, 30, 20, 50);
		l2.setForeground(Color.black);
		l2.setFont(new Font("Times New Roman",Font.BOLD,16));
		
		l3 = new JLabel();
        l3.setBounds(70, 100, 380, 30);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l3.setForeground(Color.red);
		
		sin = new JButton("sin");
		sin.addActionListener(this);
		sin.setBounds(10, 200, 70, 50);
		sin.setFont(new Font("Raleway",Font.BOLD,20));
		sin.setFocusable(false);
		
		cos = new JButton("cos");
		cos.addActionListener(this);
		cos.setBounds(90, 200, 70, 50);
		cos.setFont(new Font("Raleway",Font.BOLD,20));
		cos.setFocusable(false);
		
		tan = new JButton("tan");
		tan.addActionListener(this);
		tan.setBounds(170, 200, 70, 50);
		tan.setFont(new Font("Raleway",Font.BOLD,20));
		tan.setFocusable(false);
		
		log = new JButton("log");
		log.addActionListener(this);
		log.setBounds(250, 200, 65, 50);
		log.setFont(new Font("Raleway",Font.BOLD,14));
		log.setFocusable(false);
		
		fact = new JButton("x!");
		fact.addActionListener(this);
		fact.setBounds(250, 260, 60, 50);
		fact.setFont(new Font("Raleway",Font.BOLD,20));
		fact.setFocusable(false);
		
		mod = new JButton("%");
		mod.addActionListener(this);
		mod.setBounds(320, 200, 60, 50);
		mod.setFont(new Font("Raleway",Font.BOLD,14));
		mod.setFocusable(false);
		
		dec = new JButton(".");
		dec.addActionListener(this);
		dec.setBounds(320, 260, 60, 50);
		dec.setFont(new Font("Raleway",Font.BOLD,23));
		dec.setFocusable(false);
		
		sinh = new JButton("sinh");
		sinh.addActionListener(this);
		sinh.setBounds(10, 260, 70, 50);
		sinh.setFont(new Font("Raleway",Font.BOLD,16));
		sinh.setFocusable(false);
		
		cosh = new JButton("cosh");
		cosh.addActionListener(this);
		cosh.setBounds(90, 260, 70, 50);
		cosh.setFont(new Font("Raleway",Font.BOLD,14));
		cosh.setFocusable(false);
		
		tanh = new JButton("tanh");
		tanh.addActionListener(this);
		tanh.setBounds(170, 260, 70, 50);
		tanh.setFont(new Font("Raleway",Font.BOLD,16));
		tanh.setFocusable(false);
		
		sqrt = new JButton("√");
		sqrt.addActionListener(this);
		sqrt.setBounds(10, 140, 70, 50);
		sqrt.setFont(new Font("Raleway",Font.BOLD,27));
		sqrt.setFocusable(false);
		
		sqr = new JButton("x²");
		sqr.addActionListener(this);
		sqr.setBounds(85, 140, 70, 50);
		sqr.setFont(new Font("Raleway",Font.BOLD,20));
		sqr.setFocusable(false);
		
		cbrt = new JButton("∛");
		cbrt.addActionListener(this);
		cbrt.setBounds(160, 140, 70, 50);
		cbrt.setFont(new Font("Raleway",Font.BOLD,27));
		cbrt.setFocusable(false);
		
		cb = new JButton("x³");
		cb.addActionListener(this);
		cb.setBounds(235, 140, 70, 50);
		cb.setFont(new Font("Raleway",Font.BOLD,20));
		cb.setFocusable(false);
		
		
		plus = new JButton("+");
		plus.addActionListener(this);
		plus.setBounds(250, 380, 130, 110);
		plus.setFont(new Font("Raleway",Font.BOLD,30));
		plus.setFocusable(false);
		
		min = new JButton("-");
		min.addActionListener(this);
		min.setBounds(250, 320, 60, 50);
		min.setFont(new Font("Raleway",Font.BOLD,33));
		min.setFocusable(false);
		
		mul = new JButton("*");
		mul.addActionListener(this);
		mul.setBounds(315, 320, 70, 50);
		mul.setFont(new Font("Raleway",Font.BOLD,27));
		mul.setFocusable(false);
		
		div = new JButton("/");
		div.addActionListener(this);
		div.setBounds(170, 500, 70, 50);
		div.setFont(new Font("Raleway",Font.BOLD,30));
		div.setFocusable(false);
		
		back = new JButton("C");
		back.addActionListener(this);
		back.setBounds(310, 140, 70, 50);
		back.setFont(new Font("Raleway",Font.BOLD,30));
		back.setFocusable(false);
		
		Allclear = new JButton("←");
		Allclear.addActionListener(this);
		Allclear.setBounds(250, 500, 130, 50);
		Allclear.setFont(new Font("Raleway",Font.BOLD,37));
		Allclear.setFocusable(false);
		
		zero = new JButton("0");
		zero.addActionListener(this);
		zero.setBounds(90, 500, 70, 50);
		zero.setFont(new Font("Raleway",Font.BOLD,30));
		zero.setFocusable(false);
		
		dzero = new JButton("00");
		dzero.addActionListener(this);
		dzero.setBounds(10, 500, 70, 50);
		dzero.setFont(new Font("Raleway",Font.BOLD,30));
		dzero.setFocusable(false);
		
		one = new JButton("1");
		one.addActionListener(this);
		one.setBounds(10, 440, 70, 50);
		one.setFont(new Font("Raleway",Font.BOLD,30));
		one.setFocusable(false);
		
		two = new JButton("2");
		two.addActionListener(this);
		two.setBounds(90, 440, 70, 50);
		two.setFont(new Font("Raleway",Font.BOLD,30));
		two.setFocusable(false);
		
		three = new JButton("3");
		three.addActionListener(this);
		three.setBounds(170, 440, 70, 50);
		three.setFont(new Font("Raleway",Font.BOLD,30));
		three.setFocusable(false);
		
		four = new JButton("4");
		four.addActionListener(this);
		four.setBounds(10, 380, 70, 50);
		four.setFont(new Font("Raleway",Font.BOLD,30));
		four.setFocusable(false);
		
		five = new JButton("5");
		five.addActionListener(this);
		five.setBounds(90, 380, 70, 50);
		five.setFont(new Font("Raleway",Font.BOLD,30));
		five.setFocusable(false);
		
		six = new JButton("6");
		six.addActionListener(this);
		six.setBounds(170, 380, 70, 50);
		six.setFont(new Font("Raleway",Font.BOLD,30));
		six.setFocusable(false);
		
		seven = new JButton("7");
		seven.addActionListener(this);
		seven.setBounds(10, 320, 70, 50);
		seven.setFont(new Font("Raleway",Font.BOLD,30));
		seven.setFocusable(false);
		
		eight = new JButton("8");
		eight.addActionListener(this);
		eight.setBounds(90, 320, 70, 50);
		eight.setFont(new Font("Raleway",Font.BOLD,30));
		eight.setFocusable(false);
		
		nine = new JButton("9");
		nine.addActionListener(this);
		nine.setBounds(170, 320, 70, 50);
		nine.setFont(new Font("Raleway",Font.BOLD,30));
		nine.setFocusable(false);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(plus);
		frame.add(min);
		frame.add(mul);
		frame.add(div);
		frame.add(mod);
		frame.add(Allclear);
		frame.add(zero);
		frame.add(dzero);
		frame.add(one);
		frame.add(two);
		frame.add(three);
		frame.add(four);
		frame.add(five);
		frame.add(six);
		frame.add(seven);
		frame.add(eight);
		frame.add(nine);
		frame.add(sin);
		frame.add(cos);
		frame.add(tan);
		frame.add(sinh);
		frame.add(cosh);
		frame.add(tanh);
		frame.add(sqrt);
		frame.add(sqr);
		frame.add(cbrt);
		frame.add(cb);
		frame.add(log);
		frame.add(back);
		frame.add(dec);
		frame.add(fact);
		frame.setVisible(true);
	}
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		boolean A = true;
		
		if(e.getSource() == one) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("1"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("1"));
			}
			A=false;
		}
		
		if(e.getSource() == two) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("2"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("2"));
			}
			A=false;
		}
		
		if(e.getSource() == three) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("3"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("3"));
			}
			A=false;
		}
		
		if(e.getSource() == four) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("4"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("4"));
			}
			A=false;
		}
		
		if(e.getSource() == five) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("5"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("5"));
			}
			A=false;
		}
		
		if(e.getSource() == six) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("6"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("6"));
			}
			A=false;
		}
		
		if(e.getSource() == seven) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("7"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("7"));
			}
			A=false;
		}
		
		if(e.getSource() == eight) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("8"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("8"));
			}
			A=false;
		}
		
		if(e.getSource() == nine) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("9"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("9"));
			}
			A=false;
		}
		
		if(e.getSource() == zero) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("0"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("0"));
			}
			A=false;
		}
		
		if(e.getSource() == dzero) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("00"));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("00"));
			}
			A=false;
		}
		
		if(e.getSource() == dec) {
			if(tf1.isFocusOwner()) {
				tf1.setText(tf1.getText().concat("."));
			}
			if(tf2.isFocusOwner()) {
				tf2.setText(tf2.getText().concat("."));
			}
			A=false;
		}
		
		String op = e.getActionCommand();
		
		
		if(op.equals("C")) {
			tf1.setText(" ");
			tf2.setText(" ");
			A=false;
		}
		
		if(A) {
			boolean B = true;
			double a=0, b=0;
			try {
				a = Double.parseDouble(tf1.getText());
			}
			catch(Exception e1) {
				JOptionPane.showMessageDialog(null,"Intialise a!!!", "Error Message",JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			if(op.equals("√")) {
				l3.setText("Result: " + (Math.sqrt(a)));
				B = false;
			}
			if(op.equals("x²")) {
				l3.setText("Result: " + (Math.pow(a, 2)));
				B = false;
			}
			if(op.equals("∛")) {
				l3.setText("Result: " + (Math.cbrt(a)));
				B = false;
			}
			if(op.equals("x³")) {
				l3.setText("Result: " + (Math.pow(a, 3)));
				B = false;
			}
			if(op.equals("log")) {
				l3.setText("Result: " + (Math.log(a)));
				B = false;
			}
			if(op.equals("x!")) {
				if(a <= 170) {
					double ans = 1;
					for(int i=1;i<=a;i++) {
						ans *= i;
					}
					l3.setText("Result: " + ans);
				}
				else {
					JOptionPane.showMessageDialog(null,"Calculation outside of accepted range.", "Error Message",JOptionPane.ERROR_MESSAGE);
				}
				B = false;
			}
			if(op.equals("sin")) {
				l3.setText("Result: " + (Math.sin(Math.toRadians(a))));
				B = false;
			}
			if(op.equals("cos")) {
				l3.setText("Result: " + (Math.cos(Math.toRadians(a))));
				B = false;
			}
			if(op.equals("tan")) {
				l3.setText("Result: " + (Math.tan(Math.toRadians(a))));
				B = false;
			}
			if(op.equals("sinh")) {
				l3.setText("Result: " + (Math.sinh(Math.toRadians(a))));
				B = false;
			}
			if(op.equals("cosh")) {
				l3.setText("Result: " + (Math.cosh(Math.toRadians(a))));
				B = false;
			}
			if(op.equals("tanh")) {
				l3.setText("Result: " + (Math.tanh(Math.toRadians(a))));
				B = false;
			}
			if(op.equals("←")) {
				if (tf1.isFocusOwner()) { 
		            backspace(tf1);
		        } else if (tf2.isFocusOwner()) { 
		            backspace(tf2);
		        }
				B=false;
			}
			if(B) {
				try {
					b = Double.parseDouble(tf2.getText());
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Intialise  a and b!!!", "Error Message",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(op.equals("+")) {
					l3.setText("Result: " + (a+b));
				}
				if(op.equals("-")) {
					l3.setText("Result: " + (a-b));
				}
				if(op.equals("*")) {
					l3.setText("Result: " + (a*b));
				}
				if(op.equals("/")) {
					l3.setText("Result: " + (a/b));
				}
				if(op.equals("%")) {
					l3.setText("Result: " + (a%b));
				}
			}
		}
		
	}
	public static void backspace(JTextField tf) {
		String str = tf.getText();
		if(!str.isEmpty()) {
			tf.setText(str.substring(0,str.length()-1));
		}
	}

	
	public static void main(String[] args) {
		new Main();
	}

}
