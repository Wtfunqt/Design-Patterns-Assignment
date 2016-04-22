import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JCheckBox;

public class OrderForm {

	private JFrame frame;
	private final JRadioButton rdbtnCheesePizza = new JRadioButton("Cheese Pizza");
	private final ButtonGroup btngrpPizza = new ButtonGroup();
	private final ButtonGroup btngrpSize = new ButtonGroup();
	private final ButtonGroup btngrpDrinks = new ButtonGroup();
	private final ButtonGroup btngrpCupSize = new ButtonGroup();
	private final ButtonGroup btngrpChoices = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderForm window = new OrderForm();
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
	public OrderForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 746, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel title = new JLabel("Fast Food");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.PLAIN, 48));

		JButton btnAdd = new JButton("Add");

		JButton btnRemove = new JButton("Remove");

		JButton btnClear = new JButton("Clear");

		JButton btnCheckOut = new JButton("Check out");

		final JPanel pnlPizzaOption = new JPanel();
		pnlPizzaOption.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		final JPanel pnlDrinksOption = new JPanel();
		pnlDrinksOption.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel pnlChoices = new JPanel();

		JList lstItems = new JList();

		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(32)
									.addComponent(pnlChoices, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pnlPizzaOption, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pnlDrinksOption, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(44)
									.addComponent(lblOrders, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(23)
									.addComponent(lstItems, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(135)
							.addComponent(title, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(185)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnRemove)
							.addGap(18)
							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnCheckOut)))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(title)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblOrders, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlChoices, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlDrinksOption, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
						.addComponent(pnlPizzaOption, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)
						.addComponent(lstItems, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClear)
						.addComponent(btnCheckOut)
						.addComponent(btnRemove)
						.addComponent(btnAdd))
					.addGap(32))
		);

		final JRadioButton rdbtnPizza = new JRadioButton("Pizza");
		btngrpChoices.add(rdbtnPizza);

		JRadioButton rdbtnMeals = new JRadioButton("Meals");
		btngrpChoices.add(rdbtnMeals);

		JLabel lblNewLabel_2 = new JLabel("Food Option");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		final JRadioButton rdbtnDrinks = new JRadioButton("Drinks");
		btngrpChoices.add(rdbtnDrinks);

		JRadioButton rdbtnBurgers = new JRadioButton("Burgers");
		btngrpChoices.add(rdbtnBurgers);
		GroupLayout gl_pnlChoices = new GroupLayout(pnlChoices);
		gl_pnlChoices.setHorizontalGroup(
			gl_pnlChoices.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlChoices.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnPizza)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnBurgers)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnDrinks)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnMeals)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		gl_pnlChoices.setVerticalGroup(
			gl_pnlChoices.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlChoices.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_pnlChoices.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(rdbtnPizza)
						.addComponent(rdbtnBurgers)
						.addComponent(rdbtnDrinks)
						.addComponent(rdbtnMeals)))
		);
		pnlChoices.setLayout(gl_pnlChoices);

		JPanel pnlDrinks = new JPanel();
		pnlDrinks.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblNewLabel_1 = new JLabel("Drinks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnBottle = new JRadioButton("Bottle");
		btngrpDrinks.add(rdbtnBottle);

		JRadioButton rdbtnCan = new JRadioButton("Can");
		btngrpDrinks.add(rdbtnCan);

		final JRadioButton rdbtnCup = new JRadioButton("Cup");
		btngrpDrinks.add(rdbtnCup);

		GroupLayout gl_pnlDrinks = new GroupLayout(pnlDrinks);
		gl_pnlDrinks.setHorizontalGroup(gl_pnlDrinks.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDrinks.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlDrinks.createParallelGroup(Alignment.LEADING).addComponent(rdbtnCup)
								.addComponent(rdbtnCan).addComponent(lblNewLabel_1).addComponent(rdbtnBottle))
						.addContainerGap(23, Short.MAX_VALUE)));
		gl_pnlDrinks.setVerticalGroup(gl_pnlDrinks.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDrinks.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_1)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnBottle)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnCan)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rdbtnCup)
						.addContainerGap(8, Short.MAX_VALUE)));
		pnlDrinks.setLayout(gl_pnlDrinks);

		final JPanel pnlCupSize = new JPanel();
		pnlCupSize.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCupSize.setVisible(false);

		JLabel lblCupSize = new JLabel("Cup Size");
		lblCupSize.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnLarge_1 = new JRadioButton("Large");
		btngrpCupSize.add(rdbtnLarge_1);

		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		btngrpCupSize.add(rdbtnMedium);

		JRadioButton rdbtnSmall = new JRadioButton("Small");
		btngrpCupSize.add(rdbtnSmall);
		GroupLayout gl_pnlCupSize = new GroupLayout(pnlCupSize);
		gl_pnlCupSize.setHorizontalGroup(gl_pnlCupSize.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCupSize.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlCupSize.createParallelGroup(Alignment.LEADING).addComponent(rdbtnSmall)
								.addComponent(rdbtnLarge_1).addComponent(lblCupSize))
						.addContainerGap(118, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_pnlCupSize.createSequentialGroup().addContainerGap(9, Short.MAX_VALUE)
						.addComponent(rdbtnMedium).addContainerGap()));
		gl_pnlCupSize.setVerticalGroup(gl_pnlCupSize.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlCupSize.createSequentialGroup().addContainerGap().addComponent(lblCupSize)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rdbtnLarge_1)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnMedium).addGap(6)
						.addComponent(rdbtnSmall).addGap(67)));
		pnlCupSize.setLayout(gl_pnlCupSize);
		GroupLayout gl_pnlDrinksOption = new GroupLayout(pnlDrinksOption);
		gl_pnlDrinksOption.setHorizontalGroup(gl_pnlDrinksOption.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDrinksOption.createSequentialGroup().addContainerGap()
						.addComponent(pnlDrinks, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(pnlCupSize, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
						.addContainerGap()));
		gl_pnlDrinksOption.setVerticalGroup(gl_pnlDrinksOption.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDrinksOption.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlDrinksOption.createParallelGroup(Alignment.LEADING)
								.addComponent(pnlCupSize, Alignment.TRAILING, 0, 0, Short.MAX_VALUE).addComponent(
										pnlDrinks, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(264)));
		pnlDrinksOption.setLayout(gl_pnlDrinksOption);

		JPanel pnlPizza = new JPanel();
		pnlPizza.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblNewLabel = new JLabel("Choose Pizza");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnPepporoni = new JRadioButton("Pepperoni");
		btngrpPizza.add(rdbtnPepporoni);

		JRadioButton rdbtnBaconPiiza = new JRadioButton("Bacon Pizza");
		btngrpPizza.add(rdbtnBaconPiiza);
		btngrpPizza.add(rdbtnCheesePizza);

		JRadioButton rdbtnVeggiePizza = new JRadioButton("Veggie Pizza");
		btngrpPizza.add(rdbtnVeggiePizza);

		GroupLayout gl_pnlPizza = new GroupLayout(pnlPizza);
		gl_pnlPizza.setHorizontalGroup(gl_pnlPizza.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPizza.createSequentialGroup().addGap(10).addComponent(lblNewLabel))
				.addGroup(gl_pnlPizza.createSequentialGroup().addGap(6).addComponent(rdbtnPepporoni,
						GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_pnlPizza.createSequentialGroup().addGap(6).addComponent(rdbtnBaconPiiza,
						GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_pnlPizza.createSequentialGroup().addGap(6).addComponent(rdbtnCheesePizza))
				.addGroup(gl_pnlPizza.createSequentialGroup().addGap(6).addComponent(rdbtnVeggiePizza,
						GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)));
		gl_pnlPizza.setVerticalGroup(gl_pnlPizza.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPizza.createSequentialGroup().addGap(11).addComponent(lblNewLabel).addGap(2)
						.addComponent(rdbtnPepporoni).addGap(3).addComponent(rdbtnBaconPiiza).addGap(3)
						.addComponent(rdbtnCheesePizza).addGap(3).addComponent(rdbtnVeggiePizza).addGap(26)));
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
		gl_pnlSize.setHorizontalGroup(gl_pnlSize.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSize.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlSize.createParallelGroup(Alignment.LEADING).addComponent(rdbtnNewRadioButton_1)
								.addComponent(rdbtnNewRadioButton).addComponent(rdbtnLarge).addComponent(lblSize))
						.addGap(122).addComponent(panel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(35, Short.MAX_VALUE)));
		gl_pnlSize.setVerticalGroup(gl_pnlSize.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlSize.createSequentialGroup().addContainerGap().addComponent(lblSize)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(rdbtnLarge)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rdbtnNewRadioButton)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(rdbtnNewRadioButton_1)
						.addContainerGap(126, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGap(0, 93, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGap(0, 233, Short.MAX_VALUE));
		panel.setLayout(gl_panel);
		pnlSize.setLayout(gl_pnlSize);
		GroupLayout gl_pnlPizzaOption = new GroupLayout(pnlPizzaOption);
		gl_pnlPizzaOption.setHorizontalGroup(gl_pnlPizzaOption.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPizzaOption.createSequentialGroup().addContainerGap()
						.addComponent(pnlPizza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnlSize, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(11, Short.MAX_VALUE)));
		gl_pnlPizzaOption.setVerticalGroup(gl_pnlPizzaOption.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlPizzaOption.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlPizzaOption.createParallelGroup(Alignment.LEADING)
								.addComponent(pnlPizza, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
								.addComponent(pnlSize, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(28, Short.MAX_VALUE)));
		pnlPizzaOption.setLayout(gl_pnlPizzaOption);
		pnlPizzaOption.setVisible(false);

		frame.getContentPane().setLayout(groupLayout);

		ActionListener cupsize = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (rdbtnCup.isSelected()) {
					pnlCupSize.setVisible(true);
				} else {
					pnlCupSize.setVisible(false);
				}
			}
		};
		rdbtnCup.addActionListener(cupsize);

		ActionListener pizza = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (rdbtnPizza.isSelected()) {
					pnlPizzaOption.setVisible(true);
					pnlDrinksOption.setVisible(false);
				}
			}
		};
		rdbtnPizza.addActionListener(pizza);
		pnlDrinksOption.setVisible(false);
		ActionListener drink = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (rdbtnDrinks.isSelected()) {
					pnlDrinksOption.setVisible(true);
					pnlPizzaOption.setVisible(false);
				}
				
			}
		};
		rdbtnDrinks.addActionListener(drink);
	}
}
