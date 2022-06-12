import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home home = new Home();
					home.setLocationRelativeTo(null);
					home.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 550, 650);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(null);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		ImageIcon Dicon = new ImageIcon(Home.class.getResource("/img/dineinicon.png"));
		Image Dimg = Dicon.getImage();
		Image DImg = Dimg.getScaledInstance(50, 60, Image.SCALE_SMOOTH);
		ImageIcon dicon = new ImageIcon(DImg);
		JButton DineInButton = new JButton("Dine In", dicon);
		DineInButton.setFocusPainted(false);
		DineInButton.setForeground(new Color(0, 0, 0));
		DineInButton.setBackground(new Color(255, 255, 255));
		DineInButton.setFont(new Font("Arial", Font.PLAIN, 17));
		panel.add(DineInButton);
		setVisible(true);
		
		ImageIcon Ticon = new ImageIcon(Home.class.getResource("/img/takeouticon.png"));
		Image Timg = Ticon.getImage();
		Image TImg = Timg.getScaledInstance(50, 60, Image.SCALE_SMOOTH);
		ImageIcon ticon = new ImageIcon(TImg);
		JButton TakeOutButton = new JButton("Take Out",ticon);
		TakeOutButton.setFocusPainted(false);
		TakeOutButton.setFont(new Font("Arial", Font.PLAIN, 17));
		TakeOutButton.setBackground(new Color(255, 255, 255));
		panel.add(TakeOutButton);
		
		DineInButton.addActionListener(e -> { //주문페이지 이동
				Main main = new Main();
				main.setLocationRelativeTo(null);
				main.setVisible(true);
				setVisible(false);
		});
		
		TakeOutButton.addActionListener(e -> { //주문페이지 이동
			Main main = new Main();
			main.setLocationRelativeTo(null);
			main.setVisible(true);
			setVisible(false);
		});
	}
}
