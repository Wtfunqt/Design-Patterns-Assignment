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


public class PizzaForm {

	private JFrame frame;
	private final JRadioButton rdbtnCheesePizza = new JRadioButton("Cheese Pizza");
	private final ButtonGroup btngrpPizza = new ButtonGroup();
	private final ButtonGroup btngrpSize = new ButtonGroup();
	private final ButtonGroup btngrpDrinks = new ButtonGroup();
	private final ButtonGroup btngrpCupSize = new ButtonGroup();

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
		frame.setBounds(100, 100, 520, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("Pizza");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
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
		
		final JRadioButton rdbtnCustomPizza = new JRadioButton("Custom Pizza");
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
		
		JPanel pnlDrinks = new JPanel();
		pnlDrinks.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		final JPanel pnlCupSize = new JPanel();
		pnlCupSize.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlCupSize.setVisible(false);
		
		
		JList lstItems = new JList();
		
		JLabel lblNewLabel_2 = new JLabel("Orders");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnAdd = new JButton("Add");
		
		JButton btnRemove = new JButton("Remove");
		
		JButton btnClear = new JButton("Clear");
		
		final JPanel pnlCustom = new JPanel();
		pnlCustom.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(title, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(pnlPizza, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(pnlSize, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(pnlDrinks, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
												.addComponent(pnlCupSize, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
										.addComponent(pnlCustom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lstItems, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
										.addComponent(lblNewLabel_2)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnRemove)
									.addGap(18)
									.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(title)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lstItems, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(pnlSize, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
										.addComponent(pnlDrinks, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 117, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pnlCupSize, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
								.addComponent(pnlPizza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(pnlCustom, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnRemove)
						.addComponent(btnClear))
					.addGap(59))
		);
		
		JLabel lblNewLabel_3 = new JLabel("Toppings");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JCheckBox chckbxPepporoni = new JCheckBox("Pepperoni");
		
		JCheckBox chckbxExtraCheese = new JCheckBox("Extra Cheese");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pineapple");
		
		JCheckBox chckbxBacon = new JCheckBox("Bacon");
		
		JCheckBox chckbxMushroom = new JCheckBox("Mushroom");
		
		JCheckBox chckbxGrilledChicken = new JCheckBox("Grilled Chicken");
		GroupLayout gl_pnlCustom = new GroupLayout(pnlCustom);
		gl_pnlCustom.setHorizontalGroup(
			gl_pnlCustom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCustom.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCustom.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addGroup(gl_pnlCustom.createSequentialGroup()
							.addGroup(gl_pnlCustom.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxExtraCheese)
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxPepporoni))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnlCustom.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxMushroom)
								.addComponent(chckbxGrilledChicken)
								.addComponent(chckbxBacon))))
					.addContainerGap(127, Short.MAX_VALUE))
		);
		gl_pnlCustom.setVerticalGroup(
			gl_pnlCustom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCustom.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxPepporoni)
						.addComponent(chckbxMushroom))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnlCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxExtraCheese)
						.addComponent(chckbxBacon))
					.addPreferredGap(ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
					.addGroup(gl_pnlCustom.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox)
						.addComponent(chckbxGrilledChicken))
					.addContainerGap())
		);
		pnlCustom.setLayout(gl_pnlCustom);
		
		JLabel lblCupSize = new JLabel("Cup Size");
		lblCupSize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnLarge_1 = new JRadioButton("Large");
		btngrpCupSize.add(rdbtnLarge_1);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		btngrpCupSize.add(rdbtnMedium);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		btngrpCupSize.add(rdbtnSmall);
		GroupLayout gl_pnlCupSize = new GroupLayout(pnlCupSize);
		gl_pnlCupSize.setHorizontalGroup(
			gl_pnlCupSize.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlCupSize.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlCupSize.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlCupSize.createSequentialGroup()
							.addComponent(rdbtnLarge_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnMedium)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnSmall))
						.addComponent(lblCupSize))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_pnlCupSize.setVerticalGroup(
			gl_pnlCupSize.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlCupSize.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCupSize)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlCupSize.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnLarge_1)
						.addComponent(rdbtnMedium)
						.addComponent(rdbtnSmall))
					.addContainerGap())
		);
		pnlCupSize.setLayout(gl_pnlCupSize);
		
		JLabel lblNewLabel_1 = new JLabel("Drinks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton rdbtnBottle = new JRadioButton("Bottle");
		btngrpDrinks.add(rdbtnBottle);
		
		JRadioButton rdbtnCan = new JRadioButton("Can");
		btngrpDrinks.add(rdbtnCan);
		
		final JRadioButton rdbtnCup = new JRadioButton("Cup");
		btngrpDrinks.add(rdbtnCup);
		
		
		ActionListener cupsize = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		    	  if(rdbtnCup.isSelected()){
		  			pnlCupSize.setVisible(true);
		  		}else{
		  			pnlCupSize.setVisible(false);
		  		}
		      }
		    };
		    rdbtnCup.addActionListener(cupsize);
		GroupLayout gl_pnlDrinks = new GroupLayout(pnlDrinks);
		gl_pnlDrinks.setHorizontalGroup(
			gl_pnlDrinks.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDrinks.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDrinks.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnCup)
						.addComponent(rdbtnCan)
						.addComponent(lblNewLabel_1)
						.addComponent(rdbtnBottle))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_pnlDrinks.setVerticalGroup(
			gl_pnlDrinks.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDrinks.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnBottle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnCan)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnCup)
					.addContainerGap(8, Short.MAX_VALUE))
		);
		pnlDrinks.setLayout(gl_pnlDrinks);
		frame.getContentPane().setLayout(groupLayout);
		
		pnlCustom.setVisible(false);
		ActionListener custom = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		    	  if(rdbtnCustomPizza.isSelected()){
		  			pnlCustom.setVisible(true);
		  		}else{
		  			pnlCustom.setVisible(false);
		  		}
		      }
		    };
		    rdbtnCustomPizza.addActionListener(custom);
		
	}
}
