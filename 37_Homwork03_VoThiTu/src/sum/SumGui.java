package sum;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SumGui extends JFrame implements ActionListener,KeyListener
{
	private JLabel lbA,lbB,lbResult;
	private JTextField txtA,txtB,txtResult;
	private JButton btnSum,btnReset,btnExit;
	private JPanel pA,pB,pResult,pBtn;
	
	public SumGui() {
		// 1.thiet lap cho Frame
		super("Sum of two integer");
		super.setSize(300,200);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new GridLayout(4,1));
		
	
		
		//2.tao cac panels components
		pA = new JPanel();
		//pA.setLayout(new FlowLayout()); //default layout cua JPanel la FlowLayout
		lbA= new JLabel("Enter a");
		txtA= new JTextField(10);
		pA.add(lbA);
		pA.add(txtA);
		
		pB = new JPanel();
		lbB= new JLabel("Enter b");
		txtB= new JTextField(10);
		pB.add(lbB);
		pB.add(txtB);
		
		pResult = new JPanel();
		lbResult= new JLabel("Enter result");
		txtResult= new JTextField(10);
		txtResult.setEnabled(false);
		pResult.add(lbResult);
		pResult.add(txtResult);
		
		pBtn= new JPanel();
		btnSum= new JButton("Sum");
		btnReset= new JButton("Reset");
		btnExit= new JButton("Exit");
		pBtn.add(btnSum);
		pBtn.add(btnReset);
		pBtn.add(btnExit);
		
		//3.them cac components vao Frame
		super.add(pA);
		super.add(pB);
		super.add(pResult);
		super.add(pBtn);
		
		//4. dang ki su kien 
		btnSum.addActionListener(this);
		btnSum.addKeyListener(this);
		btnReset.addActionListener(this);
		btnExit.addActionListener(this);
		
		txtA.addKeyListener(this);
		txtB.addKeyListener(this);
		btnSum.addKeyListener(this);
		
		super.validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSum) {
			int a= Integer.parseInt( txtA.getText());
			int b= Integer.parseInt( txtB.getText());
			int c= a+b;
			txtResult.setText(c+"");
		}
		else if(e.getSource()== btnReset) {
			txtA.setText("");
			txtResult.setText("");
			txtB.setText("");
		}
		else if(e.getSource()== btnExit)
			System.exit(0);
		
	}
	public static void main(String[] args) {
		SumGui tu = new SumGui();
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource() == txtA) 
			if(e.getKeyCode()== KeyEvent.VK_ENTER) {
				txtB.requestFocus();
		}
		if(e.getSource() == txtB) 
			if(e.getKeyCode()== KeyEvent.VK_ENTER) {
				btnSum.requestFocus();
		}
		if(e.getSource() == btnSum) 
			if(e.getKeyCode()== KeyEvent.VK_ENTER) {
				int a= Integer.parseInt( txtA.getText());
				int b= Integer.parseInt( txtB.getText());
				int c= a+b;
				txtResult.setText(c+"");
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
