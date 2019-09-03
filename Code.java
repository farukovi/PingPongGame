import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
//import javax.swing.JOptionPane;
public class Code extends JPanel implements  KeyListener,ActionListener
{
	public field f;
	public int r,s;
	public int x=218,y=218,xx=340,yy=240,wid=2,len=2;
	Timer t = new Timer(5,this);
	public String c,d;
	public Code(String p, String q,int pp, int qq)
	{
		t.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		c = p;
		d = q;
		r = pp;
		s = qq;
	}
	
	
	public void paintComponent(Graphics g)
	{
		Graphics g2 = (Graphics) g;
		g2.setColor(Color.yellow);
		g2.fillRect(0,0,700,500);
		
		Graphics g3 = (Graphics) g;
		g3.setColor(Color.green);
		g3.fillRect(50,50,600,400);
		
		Graphics g4 = (Graphics) g;
		g4.setColor(Color.black);
		g4.fillRect(50,45,600,5);
		
		Graphics g5 = (Graphics) g;
		g5.setColor(Color.black);
		g5.fillRect(50,450,600,5);
		
		Graphics g6 = (Graphics) g;
		g6.setColor(Color.black);
		g6.fillRect(50,50,5,150);
		
		Graphics g7 = (Graphics) g;
		g7.setColor(Color.black);
		g7.fillRect(50,300,5,150);
		
		Graphics g8 = (Graphics) g;
		g8.setColor(Color.black);
		g8.fillRect(645,50,5,150);
		
		Graphics g9 = (Graphics) g;
		g9.setColor(Color.black);
		g9.fillRect(645,300,5,150);
		
		Graphics g10 = (Graphics) g;
		g10.setColor(Color.black);
		g8.fillRect(100,y,5,75);
		
		Graphics g11 = (Graphics) g;
		g11.setColor(Color.black);
		g11.fillRect(600,x,5,75);
		
		Graphics g12 = (Graphics) g;
		g12.setColor(Color.black);
		g12.fillRect(348,50,5,400);
		
		Graphics2D g13 = (Graphics2D) g;
		Ellipse2D circle =  new Ellipse2D.Double(xx,yy,20,20);
		g13.setColor(Color.red);
		g13.fill(circle);
		t.start();
		
		Graphics g17 = (Graphics) g;
		g17.setColor(Color.red);
		g17.setFont(new Font("serif",Font.BOLD,35));
		g17.drawString(r+" : "+s,340,30);
		
		
		Graphics g14 = (Graphics) g;
		g14.setColor(Color.red);
		g14.setFont(new Font("serif",Font.BOLD,35));
		g14.drawString(c,100,30);
		
		Graphics g15 = (Graphics) g;
		g15.setColor(Color.red);
		g15.setFont(new Font("serif",Font.BOLD,35));
		g15.drawString(d,500,30);
		
		if(xx < 0)
		{
			s++;
			t.stop();
			Graphics g24 = (Graphics) g;
			g24.setColor(Color.red);
			g24.setFont(new Font("serif",Font.BOLD,50));
			g24.drawString("Game Over",250,300);
		
			g24.setColor(Color.red);
			g24.setFont(new Font("serif",Font.BOLD,35));
			g24.drawString("Winner: "+d,300,335);
		
			g24.setColor(Color.red);
			g24.setFont(new Font("serif",Font.BOLD,20));
			g24.drawString("Press Enter to Restart",250,400);
		}
		if(xx > 700)
		{	
			r++;
			t.stop();
			Graphics g24 = (Graphics) g;
			g24.setColor(Color.red);
			g24.setFont(new Font("serif",Font.BOLD,50));
			g24.drawString("Game Over",250,200);
		
			g24.setColor(Color.red);
			g24.setFont(new Font("serif",Font.BOLD,35));
			g24.drawString("Winner: "+c,300,335);
		
			g24.setColor(Color.red);
			g24.setFont(new Font("serif",Font.BOLD,30));
			g24.drawString("Press Enter to Restart",250,400);
		}
	
	}
	public void left()
	{
		if(y <= 50)
			{
				y = 50;
			}
			else
			{
				y-=10;
			}
			repaint();
	}
	public void down()
	{
		if(x <= 50)
			{
				x = 50;
			}
			else
			{
				x-=10;
			}
			repaint();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(new Rectangle(xx,yy,20,20).intersects(new Rectangle(100,y,5,75)))
		{
			wid = -wid;
		}
		if(new Rectangle(xx,yy,20,20).intersects(new Rectangle(600,x,5,75)))
		{
			wid = -wid;
		}
		if(new Rectangle(xx,yy,20,20).intersects(new Rectangle(50,50,5,150)))
		{
			wid = -wid;
		}
		if(new Rectangle(xx,yy,20,20).intersects(new Rectangle(50,300,5,150)))
		{
			wid = -wid;
		}
		if(new Rectangle(xx,yy,20,20).intersects(new Rectangle(645,50,5,150)))
		{
			wid = -wid;
		}
		if(new Rectangle(xx,yy,20,20).intersects(new Rectangle(645,300,5,150)))
		{
			wid = -wid;
		}
		/*if(xx > 630)
		{
			 wid = -wid;
		}*/
		if(yy < 50 || yy > 430)
		{
			len = -len;
		}
		xx += wid;
		yy += len;
		repaint();
	}
	public void right()
	{
		if(y >=375)
			{
				y = 375;
			}
			else
			{
				y+=10;
			}
			repaint();
	}
	public void up()
	{
		if(x >=375)
			{
				x = 375;
			}
			else
			{
				x+=10;
			}
			repaint();
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	public void keyPressed(KeyEvent e)
	{
		int z = e.getKeyCode();
		if(z == KeyEvent.VK_A)
		{
            left();
		}
		else if(z == KeyEvent.VK_W)
		{
			right();
		}
		if(z == KeyEvent.VK_UP)
		{
            up();
		}
		else if(z == KeyEvent.VK_DOWN)
		{
			down();
		}
		else if(z == KeyEvent.VK_ENTER)
		{
			Code cc = new Code(c,d,r,s);
			JFrame j = new JFrame();
			j.add(cc);
			j.setVisible(true);
			this.setVisible(false);
			j.setBounds(400,100,718,540);
			j.setBackground(Color.BLACK);
			j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			j.setTitle("Moving ball");
		}
	}
}