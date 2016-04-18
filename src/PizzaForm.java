import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JButton;


public class PizzaForm {

	private JFrame frame;
	private final JRadioButton rdbtnCheesePizza = new JRadioButton("Cheese Pizza");
	private final ButtonGroup btngrpPizza = new ButtonGroup();
	private final ButtonGroup btngrpSize = new ButtonGroup();
	private final ButtonGroup btngrpDrinks = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaForm window = new PizzaForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PizzaForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("Pizza");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		JPanel pnlPizza = new JPanel();
		pnlPizza.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNewLabel = new JLabel("Choose Pizza");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnPepporoni = new JRadioButton("Pepporoni");
		btngrpPizza.add(rdbtnPepporoni);
		
		JRadioButton rdbtnBaconPiiza = new JRadioButton("Bacon Pizza");
		btngrpPizza.add(rdbtnBaconPiiza);
		btngrpPizza.add(rdbtnCheesePizza);
		
		JRadioButton rdbtnVeggiePizza = new JRadioButton("Veggie Pizza");
		btngrpPizza.add(rdbtnVeggiePizza);
		
		JRadioButton rdbtnCustomPizza = new JRadioButton("Custom Pizza");
		btngrpPizza.add(rdbtnCustomPizza);
		GroupLayout gl_pnlPizza = new GroupLayout(pnlPizza);
		gl_pnlPizza.setHorizontalGroup(
			gl_pnlPizza.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPizza.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel))
				.addGroup(gl_pnlPizza.createSequentialGroup()
					.addGap(6)
					.addComponent(rdbtnPepporoni, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_pnlPizza.createSequentialGroup()
					.addGap(6)
					.addComponent(rdbtnBaconPiiza, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_pnlPizza.createSequentialGroup()
					.addGap(6)
					.addComponent(rdbtnCheesePizza))
				.addGroup(gl_pnlPizza.createSequentialGroup()
					.addGap(6)
					.addComponent(rdbtnVeggiePizza, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_pnlPizza.createSequentialGroup()
					.addGap(6)
					.addComponent(rdbtnCustomPizza))
		);
		gl_pnlPizza.setVerticalGroup(
			gl_pnlPizza.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPizza.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel)
					.addGap(2)
					.addComponent(rdbtnPepporoni)
					.addGap(3)
					.addComponent(rdbtnBaconPiiza)
					.addGap(3)
					.addComponent(rdbtnCheesePizza)
					.addGap(3)
					.addComponent(rdbtnVeggiePizza)
					.addGap(3)
					.addComponent(rdbtnCustomPizza))
		);
		pnlPizza.setLayout(gl_pnlPizza);
		
		JPanel pnlSize = new JPanel();
		pnlSize.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		btngrpSize.add(rdbtnLarge);
		
		JLabel lblSize = new JLabel("Pizza Size");
		lblSize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Medium");
		btngrpSize.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Small");
		btngrpSize.add(rdbtnNewRadioButton_1);
		
		JPanel panel = new JPanel();
		GroupLayout gl_pnlSize = new GroupLayout(pnlSize);
		gl_pnlSize.setHorizontalGroup(
			gl_pnlSize.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSize.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlSize.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnLarge)
						.addComponent(lblSize))
					.addGap(122)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_pnlSize.setVerticalGroup(
			gl_pnlSize.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSize.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSize)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnLarge)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnNewRadioButton_1)
					.addContainerGap(126, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 93, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 233, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		pnlSize.setLayout(gl_pnlSize);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JList list = new JList();
		
		JLabel lblNewLabel_2 = new JLabel("Orders");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAdd = new JButton("Add");
		
		JButton btnRemove = new JButton("Remove");
		
		JButton btnClear = new JButton("Clear");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(title, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(pnlPizza, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(27)
									.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(pnlSize, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
									.addGap(18))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnRemove)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
									.addGap(45)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(list, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(title)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
							.addGap(9))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(pnlSize, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pnlPizza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnClear)
								.addComponent(btnRemove)
								.addComponent(btnAdd))))
					.addGap(50))
		);
		
		JLabel lblCupSize = new JLabel("Cup Size");
		lblCupSize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnLarge_1 = new JRadioButton("Large");
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCupSize)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(rdbtnLarge_1)
							.addGap(2)
							.addComponent(rdbtnMedium)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnSmall)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCupSize)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnLarge_1)
						.addComponent(rdbtnMedium)
						.addComponent(rdbtnSmall))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Drinks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnBottle = new JRadioButton("Bottle");
		btngrpDrinks.add(rdbtnBottle);
		
		JRadioButton rdbtnCan = new JRadioButton("Can");
		btngrpDrinks.add(rdbtnCan);
		
		JRadioButton rdbtnCup = new JRadioButton("Cup");
		btngrpDrinks.add(rdbtnCup);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(rdbtnBottle))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(rdbtnCan))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(rdbtnCup)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnBottle)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnCan)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnCup)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		frame.getContentPane().setLayout(groupLayout);
	}
}
