package CandyMachineClasses;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CandieMachineWB extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CashInsert;
	private JTextField NumberofItems; 
	static CashRegister cashRegister = new CashRegister();
	static Dispenser candy = new Dispenser(100, 50);
	static Dispenser chips = new Dispenser(100, 65);
	static Dispenser gum = new Dispenser(75, 45);
	static Dispenser cookies = new Dispenser(100, 85);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CandieMachineWB frame = new CandieMachineWB();
					frame.setVisible(true);
						
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void sellProduct(Dispenser product, CashRegister cRegister) {
		int price;
		int coinsInserted;
		int coinsRequired;
		
		Scanner input = new Scanner(System.in);

		if (product.getCount() > 0) {
			price = product.getProductCost();
			coinsRequired = price;
			coinsInserted = 0;
			
			while (coinsRequired > 0) {
				System.out.print("Please deposit " + coinsRequired + " cents: ");	
				coinsInserted += input.nextInt();
				coinsRequired = price - coinsInserted;
			}
			
			System.out.println();
			cRegister.acceptAmount(coinsInserted);
			product.makeSale();
			System.out.println("Collect your item at the bottom and enjoy.\n");
		}
		else
			System.out.println("Sorry this item is sold out.\n");
	}

	/**
	 * Create the frame.
	 */
	public CandieMachineWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel TitlePanel = new JPanel();
		contentPane.add(TitlePanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("CANDY MACHINE");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		TitlePanel.add(lblNewLabel);
		
		JPanel VisualizerPanel = new JPanel();
		contentPane.add(VisualizerPanel, BorderLayout.CENTER);
		VisualizerPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel Visulbl = new JLabel("___________________________________________");
		Visulbl.setForeground(new Color(255, 0, 0));
		Visulbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		VisualizerPanel.add(Visulbl);
		
		JPanel ChoisePanel = new JPanel();
		contentPane.add(ChoisePanel, BorderLayout.WEST);
		ChoisePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel Choicelbl = new JLabel("Choice Product");
		Choicelbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		ChoisePanel.add(Choicelbl);
		
		JCheckBox CandyCB = new JCheckBox("Candy");
		CandyCB.setFont(new Font("Tahoma", Font.BOLD, 10));
		ChoisePanel.add(CandyCB);
		
		JCheckBox ChipsCB = new JCheckBox("Chips");
		ChipsCB.setFont(new Font("Tahoma", Font.BOLD, 10));
		ChoisePanel.add(ChipsCB);
		
		JCheckBox GumCB = new JCheckBox("Gum");
		GumCB.setFont(new Font("Tahoma", Font.BOLD, 10));
		ChoisePanel.add(GumCB);
		
		JCheckBox CoockiesCB = new JCheckBox("Cookies");
		CoockiesCB.setFont(new Font("Tahoma", Font.BOLD, 10));
		ChoisePanel.add(CoockiesCB);
		
		JLabel AmountLabel = new JLabel("Mount of items");
		ChoisePanel.add(AmountLabel);
		AmountLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		NumberofItems = new JTextField();
		ChoisePanel.add(NumberofItems);
		NumberofItems.setColumns(10);
		
		JPanel CashPanel = new JPanel();
		contentPane.add(CashPanel, BorderLayout.SOUTH);
		CashPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel MInsterlbl = new JLabel("Mount Insert:");
		MInsterlbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		CashPanel.add(MInsterlbl);
		
		CashInsert = new JTextField();
		CashPanel.add(CashInsert);
		CashInsert.setColumns(10);
		
		JButton AcceptCash = new JButton("Accept Cash");
		AcceptCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = Integer.parseInt(CashInsert.getText());
				cashRegister.acceptAmount(amount);
				Visulbl.setText("EL DINERO SE AGREGO CON EXITO");
			}
		});
		AcceptCash.setFont(new Font("Tahoma", Font.PLAIN, 14));
		CashPanel.add(AcceptCash);
		
		JButton BuyButton = new JButton("BUY");
		BuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//*
				try {
				    int itemAmount = Integer.parseInt(NumberofItems.getText());	
				    int selectedCount = 0;
				    int selectedIndex = -1;
				    
				    if (CandyCB.isSelected()) {
				        selectedCount++;
				        selectedIndex = 0;
				    }
				    if (ChipsCB.isSelected()) {
				        selectedCount++;
				        selectedIndex = 1;
				    }
				    if (GumCB.isSelected()) {
				        selectedCount++;
				        selectedIndex = 2;
				    }
				    if (CoockiesCB.isSelected()) {
				        selectedCount++;
				        selectedIndex = 3;
				    }
				    
				    if (selectedCount == 0) {
				        throw new Exception("No seleccionaste ningún producto...");
				    }

				    if (selectedCount > 1) {
				        throw new Exception("Selecciona solo un producto...");
				    }

				    if (itemAmount <= 0) {
				        throw new Exception("Cantidad inválida");
				    }

				    switch (selectedIndex) {
				        case 0:
				            if ((itemAmount * candy.getProductCost()) <= cashRegister.currentBalance()) {
				                Visulbl.setText("You Bought " + itemAmount + " Candies");
				                for (int i = 0; i < itemAmount; i++) {
				                    candy.makeSale();
				                }
				            } else {
				                throw new Exception("Not enough funds");
				            }
				            break;

				        case 1:
				            if ((itemAmount * chips.getProductCost()) <= cashRegister.currentBalance()) {
				                Visulbl.setText("You Bought " + itemAmount + " Chips");
				                for (int i = 0; i < itemAmount; i++) {
				                    chips.makeSale();
				                }
				            } else {
				                throw new Exception("Not enough funds");
				            }
				            break;

				        case 2:
				            if ((itemAmount * gum.getProductCost()) <= cashRegister.currentBalance()) {
				                Visulbl.setText("You Bought " + itemAmount + " Gums");
				                for (int i = 0; i < itemAmount; i++) {
				                    gum.makeSale();
				                }
				            } else {
				                throw new Exception("Not enough funds");
				            }
				            break;

				        case 3:
				            if ((itemAmount * cookies.getProductCost()) <= cashRegister.currentBalance()) {
				                Visulbl.setText("You Bought " + itemAmount + " Cookies");
				                for (int i = 0; i < itemAmount; i++) {
				                    cookies.makeSale();
				                }
				            } else {
				                throw new Exception("Not enough funds");
				            }
				            break;
				    }

				} catch (NumberFormatException a) {
				    Visulbl.setText("Ingresa un número válido");
				} catch (Exception a) {
				    Visulbl.setText(a.getMessage());
				}				//*/
			}
		});
		BuyButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		BuyButton.setForeground(new Color(255, 0, 128));
		VisualizerPanel.add(BuyButton);

	}

}
