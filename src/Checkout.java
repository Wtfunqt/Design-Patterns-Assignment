import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class Checkout extends JFrame {

	private JPanel contentPane;
	Order order = new Order();
	private JTextField txtName;
	private JTextField txtCode;
	private JTextField txtDate;
	private JTextField txtNumber;
	private JTextField txtBalance;
	private JLabel lblName;
	private JLabel lblCardNumber;
	private JLabel lblExpirationDate;
	private JLabel lblSecurityCode;
	private JLabel lblBalance;
	private JLabel lblCheckOut;
	public JLabel lblTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkout frame = new Checkout();
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
	public Checkout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		
		txtCode = new JTextField();
		txtCode.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		
		txtBalance = new JTextField();
		txtBalance.setColumns(10);
		
		JLabel label = new JLabel("Total :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lblTotal = new JLabel("0.0");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnPay = new JButton("Pay");
		
		JButton btnClear = new JButton("Clear");
		
		JButton btnExit = new JButton("Exit");
		
		lblName = new JLabel("Name");
		
		lblCardNumber = new JLabel("Card Number");
		
		lblExpirationDate = new JLabel("Expiration Date");
		
		lblSecurityCode = new JLabel("Security Code");
		
		lblBalance = new JLabel("Balance");
		
		lblCheckOut = new JLabel("Check Out");
		lblCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 48));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblName)
						.addComponent(lblCardNumber)
						.addComponent(lblExpirationDate)
						.addComponent(lblSecurityCode)
						.addComponent(lblBalance))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblTotal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDate, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCode, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBalance, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(btnPay, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(36))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(lblCheckOut)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCheckOut)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCardNumber)
						.addComponent(txtNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblExpirationDate)
						.addComponent(txtDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSecurityCode)
						.addComponent(txtCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBalance)
						.addComponent(txtBalance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPay)
						.addComponent(btnClear)
						.addComponent(btnExit))
					.addGap(15))
		);
		contentPane.setLayout(gl_contentPane);
		ActionListener pay = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if(!txtName.getText().toString().equals("") && !txtCode.getText().toString().equals("") && !txtNumber.getText().toString().equals("") && !txtDate.getText().toString().equals("") && !txtBalance.getText().toString().equals("")){
				CreditCardTemplate card = new VisaCredit(txtName.getText().toString(), txtNumber.getText().toString(), txtDate.getText().toString(), txtCode.getText().toString(), Double.parseDouble(txtBalance.getText().toString()));
				card.validation();
				if (card.pay(Double.parseDouble(lblTotal.getText().toString())) == true && card.validation() == true)
				JOptionPane.showMessageDialog(null,"Purchase was sucessful");
				order.removeAll();
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect or missing credentials, please enter correct credentials");
				}
			}
		};
		btnPay.addActionListener(pay);
		
		ActionListener clear = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				order.removeAll();
				txtName.setText("");
				txtNumber.setText("");
				txtDate.setText("");
				txtCode.setText("");
				txtBalance.setText("");
			}
		};
		btnClear.addActionListener(clear);
		
		ActionListener exit = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				dispose();
			}
		};
		btnExit.addActionListener(exit);
		
	}

}
