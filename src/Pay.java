import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pay extends JFrame {

	private static int orderNum;
	
	private JPanel contentPane;

	public Pay(Main main) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		ImageIcon Cicon = new ImageIcon(Home.class.getResource("/img/card.png"));
		Image Cimg = Cicon.getImage();
		Image CImg = Cimg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon cicon = new ImageIcon(CImg);
		
		ImageIcon Sicon = new ImageIcon(Home.class.getResource("/img/star.png"));
		Image Simg = Sicon.getImage();
		Image SImg = Simg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon sicon = new ImageIcon(SImg);
		
		ImageIcon Picon = new ImageIcon(Home.class.getResource("/img/phone.png"));
		Image Pimg = Picon.getImage();
		Image PImg = Pimg.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		ImageIcon picon = new ImageIcon(PImg);
		
		ImageIcon Ricon = new ImageIcon(Home.class.getResource("/img/receipt.jpg"));
		Image Rimg = Ricon.getImage();
		Image RImg = Rimg.getScaledInstance(80, 70, Image.SCALE_SMOOTH);
		ImageIcon ricon = new ImageIcon(RImg);
		
		JButton CardButton = new JButton(cicon);
		CardButton.setBackground(new Color(255, 255, 255));
		CardButton.setBorderPainted(false);
		CardButton.setFocusPainted(false);
		CardButton.setFont(new Font("Arial", Font.PLAIN, 17));
		CardButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				int input = JOptionPane.showConfirmDialog(null, "포인트 적립을 하시겠습니까?", "포인트 적립",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, sicon);

			   	if (input==0) {
			   		String num = (String) JOptionPane.showInputDialog(null,"전화번호를 입력해주세요.","전화번호", JOptionPane.QUESTION_MESSAGE,picon,null,"");
			   		if(num == null) {
			   			JOptionPane.showMessageDialog(null, "포인트 적립을 실패하셨습니다.",
			   			      "적립 실패", JOptionPane.ERROR_MESSAGE);
			   			dispose();
				   		JOptionPane.showMessageDialog(null, "<주문번호> \n "+ orderNum++ +"번", "주문완료", JOptionPane.PLAIN_MESSAGE);
			   		}
			   		else {
			   		JOptionPane.showMessageDialog(null, num+ " 님 포인트 적립되셨습니다.","적립완료",JOptionPane.PLAIN_MESSAGE,sicon);
			   		dispose();
			   		JOptionPane.showMessageDialog(null, "<주문번호> \n "+ orderNum++ +"번", "주문완료", JOptionPane.PLAIN_MESSAGE,ricon);
			   	}
			   	}
			   	else {
			   		JOptionPane.showMessageDialog(null, "<주문번호> \n "+ orderNum++ +"번", "주문완료", JOptionPane.PLAIN_MESSAGE,ricon);
			   		
			   	}
				Home home = new Home();
				home.setLocationRelativeTo(null);
				home.setVisible(true);
				setVisible(false);
				main.setVisible(false);			}
		});
		CardButton.setBounds(0,0,300,300);
		panel.add(CardButton);
	}

	public static int getOrderNum() {
		return orderNum;
	}
	
}
