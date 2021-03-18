package ilk_proje;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField KullaniciAdi;
	private JPasswordField Sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131 :");
		lblNewLabel.setBounds(10, 77, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u015Eifre :");
		lblNewLabel_1.setBounds(10, 133, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		KullaniciAdi = new JTextField();
		KullaniciAdi.setBounds(119, 74, 86, 20);
		contentPane.add(KullaniciAdi);
		KullaniciAdi.setColumns(10);
		
		JButton btnGiris = new JButton("Giri\u015F");
		btnGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String k_ad = "Samet";
				String password = "1234";
				
				if (KullaniciAdi.getText().equals(k_ad) && Sifre.getText().equals(password) ) {
					
					JOptionPane.showMessageDialog(null, "Giriþ Yapýldý ");
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Hatalý Giriþ !! ");
					
				}
				
				
				
			}
		});
		btnGiris.setBounds(172, 183, 89, 23);
		contentPane.add(btnGiris);
		
		Sifre = new JPasswordField();
		Sifre.setBounds(119, 125, 86, 20);
		contentPane.add(Sifre);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u015Eifre G\u00F6ster");
		chckbxNewCheckBox.setBounds(320, 107, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		

		
		
	}
}
