import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLayeredPane;

public class Main extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton seasonButton;
	private JButton coffeeButton;
	private JButton non_coffeeButton;
	private JButton dessertButton;
	private JPanel seosonPanel;
	private JPanel coffeePanel;
	private JPanel noncoffeePanel;
	private JPanel dessertPanel;
	private JTable table;

	public Main() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 550, 650);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(null);
		panel.setBackground(new Color(255, 127, 80));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		// ----------------------------- 메뉴판을 보여주는 패널 ------------------------------------------
		seosonPanel = new JPanel();
		seosonPanel.setBackground(new Color(255, 255, 255));
		seosonPanel.setBounds(22, 79, 480, 289);
		panel.add(seosonPanel);
		
		coffeePanel = new JPanel();
		coffeePanel.setBackground(new Color(255, 255, 255));
		coffeePanel.setBounds(22, 79, 480, 289);
		panel.add(coffeePanel);
		
		noncoffeePanel = new JPanel();
		noncoffeePanel.setBackground(new Color(255, 255, 255));
		noncoffeePanel.setBounds(22, 79, 480, 289);
		panel.add(noncoffeePanel);
		
		dessertPanel = new JPanel();
		dessertPanel.setBackground(new Color(255, 255, 255));
		dessertPanel.setBounds(22, 79, 480, 289);
		panel.add(dessertPanel);
		
		coffeePanel.setVisible(false);
		noncoffeePanel.setVisible(false);
		dessertPanel.setVisible(false);
		
		// ----------------------------- 상단 메뉴바 버튼 ------------------------------------------
		seasonButton = new JButton("SEASON");
		seasonButton.setBackground(new Color(255, 218, 185));
		seasonButton.setBorderPainted(false);
		seasonButton.setBounds(22, 40, 120, 40);
		panel.add(seasonButton);		
		seasonButton.addActionListener(e -> selectMenubar(seasonButton, seosonPanel)); // 시즌 메뉴 보여줌
		
		coffeeButton = new JButton("COFFEE");
		coffeeButton.setBackground(new Color(255, 127, 80));
		coffeeButton.setBorderPainted(false);
		coffeeButton.setBounds(142, 40, 120, 40);
		panel.add(coffeeButton);
		coffeeButton.addActionListener(e -> selectMenubar(coffeeButton, coffeePanel)); // 커피 메뉴 보여줌

		non_coffeeButton = new JButton("NON-COFFEE");
		non_coffeeButton.setBackground(new Color(255, 127, 80));
		non_coffeeButton.setBorderPainted(false);
		non_coffeeButton.setBounds(262, 40, 120, 40);
		panel.add(non_coffeeButton);
		non_coffeeButton.addActionListener(e -> selectMenubar(non_coffeeButton, noncoffeePanel)); // 논커피 메뉴 보여줌
		
		dessertButton = new JButton("DESSERT");
		dessertButton.setBackground(new Color(255, 127, 80));
		dessertButton.setBorderPainted(false);
		dessertButton.setBounds(382, 40, 120, 40);
		panel.add(dessertButton);
		dessertButton.addActionListener(e -> selectMenubar(dessertButton, dessertPanel)); // 디저트 보여줌
		
		// ----------------------------- 메뉴 각각의 버튼 ------------------------------------------
		JButton watermelon = new JButton("");
		JButton blueberry = new JButton("");
		JButton raspberry = new JButton("");
		JButton espresso = new JButton("");
		JButton americano = new JButton("");
		JButton latte = new JButton("");
		JButton cappuccino = new JButton("");
		JButton irish = new JButton("");
		JButton cake = new JButton("");
		JButton cupcake = new JButton("");
		JButton donut1 = new JButton("");
		JButton donut2 = new JButton("");
		JButton muffin = new JButton("");
		JButton blacksugar = new JButton("");
		JButton bubblegreen = new JButton("");
		JButton bubblechoco = new JButton("");
		JButton strawberry = new JButton("");
		
		createMenu(seosonPanel, watermelon, "/img/menu/seoson/seoson1.jpg");
		createMenu(seosonPanel, blueberry, "/img/menu/seoson/seoson2.jpg");
		createMenu(seosonPanel, raspberry, "/img/menu/seoson/seoson3.jpg");
		createMenu(coffeePanel, espresso, "/img/menu/coffee/espresso.jpg");
		createMenu(coffeePanel, americano, "/img/menu/coffee/americano.jpg");
		createMenu(coffeePanel, latte, "/img/menu/coffee/latte.jpg");
		createMenu(coffeePanel, cappuccino, "/img/menu/coffee/cappuccino.jpg");
		createMenu(coffeePanel, irish, "/img/menu/coffee/irish.jpg");
		createMenu(noncoffeePanel, blacksugar, "/img/menu/non_coffee/blacksugar.jpg");
		createMenu(noncoffeePanel, bubblegreen, "/img/menu/non_coffee/bubblegreen.jpg");
		createMenu(noncoffeePanel, bubblechoco, "/img/menu/non_coffee/bubblechoco.jpg");
		createMenu(noncoffeePanel, strawberry, "/img/menu/non_coffee/strawberry.jpg");
		createMenu(dessertPanel, cake, "/img/menu/dessert/cake.png");
		createMenu(dessertPanel, cupcake, "/img/menu/dessert/cupcake.png");
		createMenu(dessertPanel, donut1, "/img/menu/dessert/donut1.png");
		createMenu(dessertPanel, donut2, "/img/menu/dessert/donut2.png");
		createMenu(dessertPanel, muffin, "/img/menu/dessert/muffin.png");
		
		watermelon.addActionListener(e ->selectMenu("수박 주스", "6500원")); 
		blueberry.addActionListener(e ->selectMenu("블루베리 주스", "6500원")); 
		raspberry.addActionListener(e ->selectMenu("라즈베리 주스", "6500원")); 
		espresso.addActionListener(e ->selectMenu("에스프레소", "3000원")); 
		americano.addActionListener(e ->selectMenu("아메리카노", "4000원")); 
		latte.addActionListener(e ->selectMenu("라떼", "4500원")); 
		cappuccino.addActionListener(e ->selectMenu("카푸치노", "4500원")); 
		irish.addActionListener(e ->selectMenu("아이리쉬", "5000원")); 
		blacksugar.addActionListener(e ->selectMenu("흑당 버블티", "5300원")); 
		bubblegreen.addActionListener(e ->selectMenu("녹차 버블티", "5500원")); 
		bubblechoco.addActionListener(e ->selectMenu("초코 버블티", "5500원")); 
		strawberry.addActionListener(e ->selectMenu("딸기 버블티", "5500원")); 
		cake.addActionListener(e ->selectMenu("딸기 케이크", "6000원")); 
		cupcake.addActionListener(e ->selectMenu("컵케이크", "5000원")); 
		donut1.addActionListener(e ->selectMenu("초코 도넛", "3000원")); 
		donut2.addActionListener(e ->selectMenu("감귤 도넛", "3000원")); 
		muffin.addActionListener(e ->selectMenu("머핀", "3000원")); 
			
		// ----------------------------- 선택한 메뉴를 보여주는 테이블 ------------------------------------------
		String header[] = {"주문 음료", "가격"};
		DefaultTableModel model = new DefaultTableModel(header,0); // header추가, 행은 0개 지정
		table = new JTable(model);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane scrolledTable = new JScrollPane(table);
		scrolledTable.setBounds(22, 378, 480, 125);
		panel.add(scrolledTable);
		
		// ----------------------------- 주문 버튼 ------------------------------------------
		ImageIcon ORDicon = new ImageIcon(Home.class.getResource("/img/order.png"));
		Image ORDimg = ORDicon.getImage();
		Image ordImg = ORDimg.getScaledInstance(128, 64, Image.SCALE_SMOOTH);
		ImageIcon ordIcon = new ImageIcon(ordImg);
		JButton orderButton = new JButton("", ordIcon);
		orderButton.setBorderPainted(false);
		orderButton.setBackground(new Color(255, 127, 80));
		orderButton.setForeground(new Color(0,0,0));
		orderButton.setBounds(201, 506, 128, 64);
		panel.add(orderButton);
		
		orderButton.addActionListener(e -> { // 결제창 보여줌
				Pay pay = new Pay(this);
				pay.setLocationRelativeTo(null);
				pay.setVisible(true);
		});
	}
		
	// 메뉴바 버튼을 눌렀을 때, 메뉴판 전환
	public void selectMenubar(JButton b, JPanel p) {
		seasonButton.setBackground(new Color(255, 127, 80));
		coffeeButton.setBackground(new Color(255, 127, 80));
		non_coffeeButton.setBackground(new Color(255, 127, 80));
		dessertButton.setBackground(new Color(255, 127, 80));
		b.setBackground(new Color(255, 218, 185));
		seosonPanel.setVisible(false);
		coffeePanel.setVisible(false);
		noncoffeePanel.setVisible(false);
		dessertPanel.setVisible(false);
		p.setVisible(true);
	}
	// 메뉴 버튼에 메뉴 사진 추가
	public void createMenu(JPanel p, JButton b, String path) {
		ImageIcon icon = new ImageIcon(Home.class.getResource(path));
		Image img = icon.getImage();
		Image Img = img.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
		ImageIcon Icon = new ImageIcon(Img);
		b.setIcon(Icon);
		b.setBorderPainted(false);
		b.setBackground(new Color(255, 255, 255));
		b.setForeground(new Color(0,0,0));
		p.add(b);
	}
	// 메뉴를 선택했을 때 테이블에 추가
		public void selectMenu(String name, String price) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			String[] record = new String[2];
			record[0] = name;
			record[1] = price;
			model.addRow(record);
		}
}
