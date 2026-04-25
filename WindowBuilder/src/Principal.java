import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NoField;
	private JTextField ApellidosField;
	private JTextField NombreField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel DataPanel = new JPanel();
		contentPane.add(DataPanel, BorderLayout.CENTER);
		DataPanel.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel NoLabel = new JLabel("Numero de Reserva");
		NoLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		DataPanel.add(NoLabel);
		
		NoField = new JTextField();
		DataPanel.add(NoField);
		NoField.setColumns(10);
		
		JLabel ApellidosLabel = new JLabel("Apellidos");
		ApellidosLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		DataPanel.add(ApellidosLabel);
		
		ApellidosField = new JTextField();
		DataPanel.add(ApellidosField);
		ApellidosField.setColumns(10);
		
		JLabel NombreLabel = new JLabel("Nombre");
		DataPanel.add(NombreLabel);
		NombreLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		NombreField = new JTextField();
		DataPanel.add(NombreField);
		NombreField.setColumns(10);
		
		JPanel ButtonPanel = new JPanel();
		contentPane.add(ButtonPanel, BorderLayout.SOUTH);
		
		JButton OK = new JButton("OK");
		OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se presiono el boton Ok");
			}
		});
		OK.setFont(new Font("Tahoma", Font.BOLD, 10));
		OK.setForeground(new Color(255, 255, 255));
		OK.setBackground(new Color(0, 128, 64));
		ButtonPanel.add(OK);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se presiono el boton Cancel");
			}
		});
		CancelButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		CancelButton.setBackground(new Color(255, 0, 0));
		CancelButton.setForeground(new Color(255, 255, 255));
		ButtonPanel.add(CancelButton);

	}

}
