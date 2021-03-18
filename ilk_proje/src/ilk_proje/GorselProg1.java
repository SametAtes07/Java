package ilk_proje;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GorselProg1 extends JFrame {

	private JPanel contentPane;
	
	int x,y;
	int a,b;
	int hizx = 1;
	int hizy = 1;
	int hiza = 1;
	int hizb = 1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GorselProg1 frame = new GorselProg1();
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
	public GorselProg1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("X");
		btn1.setBounds(148, 0, 50, 50);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Y");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBounds(0, 125, 50, 50);
		contentPane.add(btn2);
		
		
		Timer myTimer = new Timer();
		
	    TimerTask gorev1 = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				x = (int) btn1.getBounds().getX();							
				y = (int) btn1.getBounds().getY();
				
				x += hizx;
				y += hizy;
				
				btn1.setBounds(x, y, 50, 50);
				
				
				if(x>=450 || x<=0) hizx = hizx*-1;
				if(y>=220 || y<=0) hizy = hizy*-1;	
				
	
									
			}
		};
			
		TimerTask gorev2 = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				a = (int) btn2.getBounds().getX();
				b = (int) btn2.getBounds().getY();
				
				a += hiza;
				b += hizb;
				
				btn2.setBounds(a, b, 50, 50);
				
				
				if(a>=450 || a<=0) hiza = hiza*-1;
				if(b>=220 || b<=0) hizb = hizb*-1;	
				
											
			}
			
		};
		
		
				
		myTimer.schedule(gorev1,0,5 );
		myTimer.schedule(gorev2,0,5);
				
		
	}
}
