import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class field extends JFrame implements ActionListener
{
	JLabel title, idLabel,id;
	 JTextField idTF,TF;
	 JButton login, exit;
	 JPanel panel;
	 public String x, y;
	 private JRadioButton r1, r2, r3;
	 private ButtonGroup bg1,bg2;
	 
	public field()
	{
		super("Home Page");
		this.setBounds(400,100,400,450);
		this.setBackground(Color.GREEN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.CYAN);

		title = new JLabel("Welcome to Game!!!");
		title.setFont(new Font("Consolas",Font.ITALIC+Font.BOLD,30));
		title.setBounds(50,50,350,50);
		panel.add(title);
		
		idLabel = new JLabel("Enter 1st Player name: ");
		idLabel.setBounds(50,100,300,30);
		panel.add(idLabel);
		
		idTF = new JTextField();
		idTF.setBounds(50, 150, 200, 30);
		//idTF.setBackground(Color.YELLOW);
		panel.add(idTF);
		
		id = new JLabel("Enter 2nd Player name: ");
		id.setBounds(50,200,200,30);
		panel.add(id);
		
		TF = new JTextField();
		TF.setBounds(50, 250, 200, 30);
		//TF.setBackground(Color.YELLOW);
		panel.add(TF);
		
		r1 = new JRadioButton("Easy");
		r1.setBackground(Color.CYAN);
		r1.setBounds(50,300,80,30);
		panel.add(r1);
		
		
		r3 = new JRadioButton("Hard");
		r3.setBackground(Color.CYAN);
		r3.setBounds(250,300,80,30);
		panel.add(r3);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		//bg1.add(r2);
		bg1.add(r3);
		
		login = new JButton("Start");
		login.setBounds(50, 350, 120, 40);
		login.setBackground(Color.GREEN);
		login.addActionListener(this);
		panel.add(login);
		
		exit = new JButton("Exit");
		exit.setBounds(220, 350, 120, 40);
		exit.setBackground(Color.RED);
		exit.addActionListener(this);
		panel.add(exit);
		
		
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String elementText = ae.getActionCommand();
		if(elementText.equals(login.getText()) && r1.isSelected())
		{
			String z = idTF.getText();
			String zz = TF.getText();
			Code c = new Code(z,zz,0,0);
			JFrame j = new JFrame();
			j.add(c);
			j.setVisible(true);
			this.setVisible(false);
			j.setBounds(400,100,718,540);
			//j.setBackground(Color.BLACK);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			j.setTitle("Moving ball");
		}
		if(elementText.equals(login.getText()) && r3.isSelected())
		{
			String z = idTF.getText();
			String zz = TF.getText();
			prio c = new prio(z,zz,0,0);
			JFrame j = new JFrame();
			j.add(c);
			j.setVisible(true);
			this.setVisible(false);
			j.setBounds(400,100,718,540);
			j.setBackground(Color.BLACK);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			j.setTitle("Moving ball");
		}
		else if(elementText.equals(exit.getText()))
		{
			System.exit(0);
		}
	}
}