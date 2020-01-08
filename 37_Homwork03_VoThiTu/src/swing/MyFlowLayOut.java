package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayOut extends JFrame{
	private JButton b1,b2,b3,b4,b5;
	public MyFlowLayOut() {
		super();
		super.setTitle("wellcome to GUI");
		super.setSize(500, 200);
		super.setLocationRelativeTo(null); //Frame nam giua man hinh
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close program
		super.setVisible(true);// hien thi JFrame ra man hinh
		super.setLayout(new FlowLayout());
		
	// doan lenh 2: thiet lap cac components
	b1 = new JButton("I'm a button 1");
	b2 = new JButton("Click me 2");
	b3 = new JButton("I'm a button 3");
	b4 = new JButton("Click me 4");
	b5 = new JButton("I'm a button 5");
	
	//doan lenh 3: dua cac components vao container
	super.add(b1);
	super.add(b2);
	super.add(b3);
	super.add(b4);
	super.add(b5);
	}
	
	
	
	public static void main(String[] args) {
		MyFlowLayOut t= new MyFlowLayOut();
		

	}

}