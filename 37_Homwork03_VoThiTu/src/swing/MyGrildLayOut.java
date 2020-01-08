package swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGrildLayOut extends JFrame{
	private JButton b1,b2,b3,b4,b5;
	public MyGrildLayOut() {
		super();
		super.setTitle("hello");
		super.setSize(500, 200);
		super.setLocationRelativeTo(null); //Frame nam giua man hinh
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close program
		super.setVisible(true);// hien thi JFrame ra man hinh
		super.setLayout(new GridLayout(2,3)); //default layout cua frame la BoorderLayout
		
		// doan lenh 2: thiet lap cac components
		b1 = new JButton("press me");
		b2 = new JButton("Im a button");
		b3 = new JButton("3");
		b4 = new JButton("button 4");
		b5 = new JButton("Hello 5");
	
		//doan lenh 3: dua cac components vao container
		super.add(b1);
		super.add(b2);
		super.add(b3);
		super.add(b4);
		super.add(b5);
		}
	
	
	
	public static void main(String[] args) {
		MyGrildLayOut t= new MyGrildLayOut();
		

	}

}
