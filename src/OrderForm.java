import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPanel;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class OrderForm {

	private JFrame frame;
	private final ButtonGroup btngrpSize = new ButtonGroup();
	private final ButtonGroup btngrpCupSize = new ButtonGroup();
	private final ButtonGroup btngrpChoices = new ButtonGroup();
	private final ButtonGroup btngrpBurger = new ButtonGroup();
	private final ButtonGroup btngrpMeals = new ButtonGroup();
	Order order = new Order();
	Checkout check = new Checkout();

	MealBuilder mealBuilder = new MealBuilder();

	ItemFactory itemFactory = new ItemFactory();

	BurgerMakerFacade burgerMaker = new BurgerMakerFacade();

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
		frame.setBounds(100, 100, 700, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel title = new JLabel("Jan's Food Place");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.PLAIN, 48));

		JButton btnAdd = new JButton("Add");

		JButton btnRemove = new JButton("Remove");

		JButton btnClear = new JButton("Clear");

		JButton btnCheckOut = new JButton("Check out");

		final JPanel pnlPizzaOption = new JPanel();
		pnlPizzaOption.setBorder(new TitledBorder(null, "",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel pnlChoices = new JPanel();

		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));

		final JPanel pnlBurger = new JPanel();
		pnlBurger.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		final JPanel pnlMeals = new JPanel();
		pnlMeals.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		final JTextArea lstItems = new JTextArea();

		final JPanel pnlDrinksOption = new JPanel();
		pnlDrinksOption.setBorder(new TitledBorder(null, "",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));

		final JLabel lblPrice = new JLabel("");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addContainerGap(4, Short.MAX_VALUE)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(35)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				pnlBurger,
																																				GroupLayout.PREFERRED_SIZE,
																																				212,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addGap(18)
																																		.addComponent(
																																				pnlMeals,
																																				GroupLayout.PREFERRED_SIZE,
																																				218,
																																				GroupLayout.PREFERRED_SIZE))
																														.addGroup(
																																groupLayout
																																		.createSequentialGroup()
																																		.addComponent(
																																				pnlPizzaOption,
																																				GroupLayout.PREFERRED_SIZE,
																																				155,
																																				GroupLayout.PREFERRED_SIZE)
																																		.addGap(47)
																																		.addComponent(
																																				pnlDrinksOption,
																																				GroupLayout.PREFERRED_SIZE,
																																				145,
																																				GroupLayout.PREFERRED_SIZE))))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(32)
																										.addComponent(
																												pnlChoices,
																												GroupLayout.PREFERRED_SIZE,
																												382,
																												GroupLayout.PREFERRED_SIZE)))
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addGap(18)
																										.addComponent(
																												lblOrders,
																												GroupLayout.PREFERRED_SIZE,
																												57,
																												GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								groupLayout
																										.createSequentialGroup()
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED)
																										.addGroup(
																												groupLayout
																														.createParallelGroup(
																																Alignment.LEADING,
																																false)
																														.addComponent(
																																lblPrice,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE)
																														.addComponent(
																																lstItems,
																																GroupLayout.DEFAULT_SIZE,
																																177,
																																Short.MAX_VALUE)))))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(135)
																		.addComponent(
																				title,
																				GroupLayout.PREFERRED_SIZE,
																				434,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGap(146)
																		.addComponent(
																				btnAdd,
																				GroupLayout.PREFERRED_SIZE,
																				72,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(
																				btnRemove)
																		.addGap(18)
																		.addComponent(
																				btnClear,
																				GroupLayout.PREFERRED_SIZE,
																				69,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(
																				btnCheckOut)))
										.addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout
										.createSequentialGroup()
										.addGap(21)
										.addComponent(title)
										.addGap(18)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																pnlChoices,
																GroupLayout.PREFERRED_SIZE,
																38,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblOrders,
																GroupLayout.PREFERRED_SIZE,
																31,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								pnlPizzaOption,
																								GroupLayout.PREFERRED_SIZE,
																								169,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								pnlDrinksOption,
																								GroupLayout.PREFERRED_SIZE,
																								168,
																								GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								pnlMeals,
																								GroupLayout.PREFERRED_SIZE,
																								120,
																								GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								pnlBurger,
																								GroupLayout.PREFERRED_SIZE,
																								100,
																								GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				64,
																				Short.MAX_VALUE)
																		.addGroup(
																				groupLayout
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								btnClear)
																						.addComponent(
																								btnCheckOut)
																						.addComponent(
																								btnRemove)
																						.addComponent(
																								btnAdd))
																		.addGap(54))
														.addGroup(
																groupLayout
																		.createSequentialGroup()
																		.addComponent(
																				lstItems,
																				GroupLayout.PREFERRED_SIZE,
																				291,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				lblPrice,
																				GroupLayout.PREFERRED_SIZE,
																				44,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));

		final JRadioButton rdbtnMediumDrink = new JRadioButton("Medium");
		btngrpCupSize.add(rdbtnMediumDrink);

		final JRadioButton rdbtnSmallDrink = new JRadioButton("Small");
		btngrpCupSize.add(rdbtnSmallDrink);

		final JRadioButton rdbtnLargeDrink = new JRadioButton("Large");
		btngrpCupSize.add(rdbtnLargeDrink);

		JLabel lblCupSize = new JLabel("Cup Size");
		lblCupSize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_pnlDrinksOption = new GroupLayout(pnlDrinksOption);
		gl_pnlDrinksOption.setHorizontalGroup(gl_pnlDrinksOption
				.createParallelGroup(Alignment.LEADING).addGroup(
						gl_pnlDrinksOption
								.createSequentialGroup()
								.addGap(23)
								.addGroup(
										gl_pnlDrinksOption
												.createParallelGroup(
														Alignment.LEADING)
												.addComponent(lblCupSize)
												.addComponent(rdbtnSmallDrink)
												.addComponent(rdbtnMediumDrink)
												.addComponent(rdbtnLargeDrink))
								.addContainerGap(61, Short.MAX_VALUE)));
		gl_pnlDrinksOption.setVerticalGroup(gl_pnlDrinksOption
				.createParallelGroup(Alignment.LEADING).addGroup(
						gl_pnlDrinksOption.createSequentialGroup().addGap(30)
								.addComponent(lblCupSize)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(rdbtnLargeDrink)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnMediumDrink)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnSmallDrink)
								.addContainerGap(48, Short.MAX_VALUE)));
		pnlDrinksOption.setLayout(gl_pnlDrinksOption);

		final JRadioButton rdbtnAngusBurgerWith = new JRadioButton(
				"Angus Burger With Drinks");
		btngrpMeals.add(rdbtnAngusBurgerWith);

		final JRadioButton rdbtnCheeseBurgerWith = new JRadioButton(
				"Cheese Burger with Drinks");
		btngrpMeals.add(rdbtnCheeseBurgerWith);

		JLabel lblMeals = new JLabel("Meals");
		lblMeals.setFont(new Font("Tahoma", Font.PLAIN, 15));

		final JRadioButton rdbtnPizzaSliceWith = new JRadioButton(
				"Pizza Slice with Drinks");
		btngrpMeals.add(rdbtnPizzaSliceWith);
		GroupLayout gl_pnlMeals = new GroupLayout(pnlMeals);
		gl_pnlMeals.setHorizontalGroup(gl_pnlMeals.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_pnlMeals
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								gl_pnlMeals
										.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnPizzaSliceWith)
										.addComponent(rdbtnAngusBurgerWith)
										.addComponent(rdbtnCheeseBurgerWith)
										.addComponent(lblMeals))
						.addContainerGap(57, Short.MAX_VALUE)));
		gl_pnlMeals.setVerticalGroup(gl_pnlMeals.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_pnlMeals.createSequentialGroup().addGap(9)
						.addComponent(lblMeals)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(rdbtnAngusBurgerWith)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rdbtnCheeseBurgerWith)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rdbtnPizzaSliceWith)
						.addContainerGap(16, Short.MAX_VALUE)));
		pnlMeals.setLayout(gl_pnlMeals);

		final JRadioButton rdbtnAngus = new JRadioButton("Angus Burger");
		btngrpBurger.add(rdbtnAngus);

		JLabel lblBurger = new JLabel("Burger");
		lblBurger.setFont(new Font("Tahoma", Font.PLAIN, 15));

		final JRadioButton rdbtnCheese = new JRadioButton("Cheese Burger");
		btngrpBurger.add(rdbtnCheese);
		GroupLayout gl_pnlBurger = new GroupLayout(pnlBurger);
		gl_pnlBurger.setHorizontalGroup(gl_pnlBurger.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_pnlBurger
						.createSequentialGroup()
						.addGap(15)
						.addGroup(
								gl_pnlBurger
										.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnCheese)
										.addComponent(lblBurger)
										.addComponent(rdbtnAngus))
						.addContainerGap(84, Short.MAX_VALUE)));
		gl_pnlBurger.setVerticalGroup(gl_pnlBurger.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_pnlBurger.createSequentialGroup().addGap(12)
						.addComponent(lblBurger)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rdbtnAngus)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rdbtnCheese)
						.addContainerGap(16, Short.MAX_VALUE)));
		pnlBurger.setLayout(gl_pnlBurger);

		final JRadioButton rdbtnPizza = new JRadioButton("Pizza");
		btngrpChoices.add(rdbtnPizza);

		final JRadioButton rdbtnMeals = new JRadioButton("Meals");
		btngrpChoices.add(rdbtnMeals);

		JLabel lblNewLabel_2 = new JLabel("Food Option");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		final JRadioButton rdbtnDrink = new JRadioButton("Drinks");
		btngrpChoices.add(rdbtnDrink);

		final JRadioButton rdbtnBurgers = new JRadioButton("Burgers");
		btngrpChoices.add(rdbtnBurgers);
		GroupLayout gl_pnlChoices = new GroupLayout(pnlChoices);
		gl_pnlChoices.setHorizontalGroup(gl_pnlChoices.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_pnlChoices.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel_2)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(rdbtnPizza)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rdbtnBurgers)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(rdbtnDrink)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(rdbtnMeals)
						.addContainerGap(65, Short.MAX_VALUE)));
		gl_pnlChoices.setVerticalGroup(gl_pnlChoices.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						gl_pnlChoices
								.createSequentialGroup()
								.addGap(5)
								.addGroup(
										gl_pnlChoices
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(lblNewLabel_2)
												.addComponent(rdbtnPizza)
												.addComponent(rdbtnBurgers)
												.addComponent(rdbtnDrink)
												.addComponent(rdbtnMeals))));
		pnlChoices.setLayout(gl_pnlChoices);

		JPanel pnlSize = new JPanel();
		pnlSize.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		final JRadioButton rdbtnLarge = new JRadioButton("Large");
		btngrpSize.add(rdbtnLarge);

		JLabel lblSize = new JLabel("Pizza Size");
		lblSize.setFont(new Font("Tahoma", Font.PLAIN, 15));

		final JRadioButton rdbtnMedium = new JRadioButton("Medium");
		btngrpSize.add(rdbtnMedium);

		final JRadioButton rdbtnSmall = new JRadioButton("Small");
		btngrpSize.add(rdbtnSmall);

		JPanel panel = new JPanel();
		GroupLayout gl_pnlSize = new GroupLayout(pnlSize);
		gl_pnlSize.setHorizontalGroup(gl_pnlSize.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_pnlSize
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								gl_pnlSize
										.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnSmall)
										.addComponent(rdbtnMedium)
										.addComponent(rdbtnLarge)
										.addComponent(lblSize))
						.addGap(122)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 109,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(35, Short.MAX_VALUE)));
		gl_pnlSize.setVerticalGroup(gl_pnlSize
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_pnlSize.createSequentialGroup().addContainerGap()
								.addComponent(lblSize)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnLarge)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(rdbtnMedium)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(rdbtnSmall)
								.addContainerGap(126, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 233,
						Short.MAX_VALUE));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGap(0, 93, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGap(0, 233, Short.MAX_VALUE));
		panel.setLayout(gl_panel);
		pnlSize.setLayout(gl_pnlSize);
		GroupLayout gl_pnlPizzaOption = new GroupLayout(pnlPizzaOption);
		gl_pnlPizzaOption.setHorizontalGroup(gl_pnlPizzaOption
				.createParallelGroup(Alignment.LEADING).addGroup(
						gl_pnlPizzaOption
								.createSequentialGroup()
								.addGap(20)
								.addComponent(pnlSize,
										GroupLayout.PREFERRED_SIZE, 104,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(114, Short.MAX_VALUE)));
		gl_pnlPizzaOption.setVerticalGroup(gl_pnlPizzaOption
				.createParallelGroup(Alignment.LEADING).addGroup(
						gl_pnlPizzaOption
								.createSequentialGroup()
								.addGap(21)
								.addComponent(pnlSize,
										GroupLayout.PREFERRED_SIZE, 117,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(26, Short.MAX_VALUE)));
		pnlPizzaOption.setLayout(gl_pnlPizzaOption);
		pnlPizzaOption.setVisible(false);
		pnlBurger.setVisible(false);
		pnlMeals.setVisible(false);
		pnlDrinksOption.setVisible(false);
		frame.getContentPane().setLayout(groupLayout);

		ActionListener pizza = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (rdbtnPizza.isSelected()) {
					pnlPizzaOption.setVisible(true);
					pnlDrinksOption.setVisible(false);
					pnlBurger.setVisible(false);
					pnlMeals.setVisible(false);
				}
			}
		};
		rdbtnPizza.addActionListener(pizza);

		ActionListener burger = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (rdbtnBurgers.isSelected()) {
					pnlDrinksOption.setVisible(false);
					pnlPizzaOption.setVisible(false);
					pnlBurger.setVisible(true);
					pnlMeals.setVisible(false);
				}

			}
		};
		rdbtnBurgers.addActionListener(burger);
		ActionListener meals = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (rdbtnMeals.isSelected()) {
					pnlDrinksOption.setVisible(false);
					pnlPizzaOption.setVisible(false);
					pnlBurger.setVisible(false);
					pnlMeals.setVisible(true);
				}

			}
		};
		ActionListener drink = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (rdbtnDrink.isSelected()) {
					pnlDrinksOption.setVisible(true);
					pnlPizzaOption.setVisible(false);
					pnlBurger.setVisible(false);
					pnlMeals.setVisible(false);
				}

			}
		};
		rdbtnDrink.addActionListener(drink);
		rdbtnMeals.addActionListener(meals);
		lstItems.setLineWrap(true);
		lstItems.setWrapStyleWord(true);
		lstItems.setEditable(false);

		ActionListener add = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {

				if (rdbtnPizza.isSelected()) {
					if (rdbtnLarge.isSelected()) {
						order.addItem(itemFactory.getItem("large size pizza"));
						lstItems.setText(order.showItems());
					} else if (rdbtnMedium.isSelected()) {
						order.addItem(itemFactory.getItem("medium size pizza"));
						lstItems.setText(order.showItems());
					} else if (rdbtnSmall.isSelected()) {
						order.addItem(itemFactory.getItem("small size pizza"));
						lstItems.setText(order.showItems());
					} else {
						order.addItem(new Pizza());
						lstItems.setText(order.showItems());
					}
				} else if (rdbtnDrink.isSelected()) {
					if (rdbtnLargeDrink.isSelected()) {
						order.addItem(itemFactory.getItem("large size drink"));
						lstItems.setText(order.showItems());
					} else if (rdbtnMediumDrink.isSelected()) {
						order.addItem(itemFactory.getItem("medium size drink"));
						lstItems.setText(order.showItems());
					} else if (rdbtnSmallDrink.isSelected()) {
						order.addItem(itemFactory.getItem("small size drink"));
						lstItems.setText(order.showItems());
					} else {
						order.addItem(new Drink());
						lstItems.setText(order.showItems());
					}
				} else if (rdbtnBurgers.isSelected()) {
					if (rdbtnAngus.isSelected()) {
						order.addItem(burgerMaker.getAngusBurger());
						lstItems.setText(order.showItems());
					} else if (rdbtnCheese.isSelected()) {
						order.addItem(burgerMaker.getCheeseBurger());
						lstItems.setText(order.showItems());
					} else {
						JOptionPane.showMessageDialog(null,
								"Please select one of the items!");
					}
				} else if (rdbtnMeals.isSelected()) {
					if (rdbtnAngusBurgerWith.isSelected()) {
						mealBuilder.angusMeal();
						check.lblTotal.setText(String.valueOf(mealBuilder
								.total()));
						OrderForm.this.frame.setVisible(false);
						check.setVisible(true);
					} else if (rdbtnCheeseBurgerWith.isSelected()) {
						mealBuilder.cheeseMeal();
						check.lblTotal.setText(String.valueOf(mealBuilder
								.total()));
						OrderForm.this.frame.setVisible(false);
						check.setVisible(true);
					} else if (rdbtnPizzaSliceWith.isSelected()) {
						mealBuilder.signatureMeal();
						check.lblTotal.setText(String.valueOf(mealBuilder
								.total()));
						OrderForm.this.frame.setVisible(false);
						check.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null,
								"Please select one of the items!");
					}
				} else {
					JOptionPane
							.showMessageDialog(null, "Please select one of the items!");
				}
				lblPrice.setText((String.valueOf(order.getTotal())));
			}
		};
		btnAdd.addActionListener(add);

		ActionListener clear = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (!lstItems.getText().toString().equals("")) {
					order.removeAll();
					lstItems.setText(order.showItems());
					lblPrice.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Order is Cleared!");
				}
			}
		};
		btnClear.addActionListener(clear);

		ActionListener remove = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (!lstItems.getText().toString().equals("")) {
					order.removeItem();
					lstItems.setText(order.showItems());
					lblPrice.setText((String.valueOf(order.getTotal())));
				} else {
					JOptionPane.showMessageDialog(null,
							"No item in the order list!");
				}
			}
		};
		btnRemove.addActionListener(remove);

		ActionListener checkout = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (!lstItems.getText().equals("")) {
					check.lblTotal.setText(String.valueOf(order.getTotal()));
					OrderForm.this.frame.setVisible(false);
					check.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,
							"No item in the order list!");
				}

			}
		};
		btnCheckOut.addActionListener(checkout);

	}
}
