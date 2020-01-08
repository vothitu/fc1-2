
package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyBoLayOut extends JFrame{
	private JButton b1,b2,b3,b4,b5;
	public MyBoLayOut() {
		super();
		super.setTitle("hello");
		super.setSize(500, 200);
		super.setLocationRelativeTo(null); //Frame nam giua man hinh
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close program
		super.setVisible(true);// hien thi JFrame ra man hinh
		super.setLayout(new BorderLayout()); //default layout cua frame la BoorderLayout
		
		// doan lenh 2: thiet lap cac components
		b1 = new JButton("press me");
		b2 = new JButton("Im a button");
		b3 = new JButton("3");
		b4 = new JButton("button 4");
		b5 = new JButton("Hello 5");
	
		//doan lenh 3: dua cac components vao container
		super.add(b1,BorderLayout.NORTH);
		super.add(b2,BorderLayout.SOUTH);
		super.add(b3,BorderLayout.EAST);
		super.add(b4,BorderLayout.WEST);
		super.add(b5,BorderLayout.CENTER);
		}
	
	
	
	public static void main(String[] args) {
		MyBoLayOut t= new MyBoLayOut();
t.show();
	}

}
