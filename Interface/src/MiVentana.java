import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana {
	
	public MiVentana() {
		
		JFrame mi_ventana=new JFrame();
		

		//FlowLayout layout_simple=new FlowLayout(FlowLayout.CENTER );
		GridLayout layoutGrid = new GridLayout(3,2,5,5);
		BorderLayout layoutBorder = new BorderLayout();
		
		Color green = new Color(0,127,0);
		Color red = new Color(127,0,0);
		
		mi_ventana.setSize(600,300);
		mi_ventana.setVisible(true);
		mi_ventana.setLocationRelativeTo(null);
		mi_ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mi_ventana.setLayout(layoutBorder);
		
		// BOTONES
		
		JButton buttonOk=new JButton("Ok");
		buttonOk.setForeground(Color.CYAN);
		JButton buttonCancel=new JButton("Cancel");
		buttonCancel.setForeground(red);

		//mi_ventana.add(buttonOk);
		//mi_ventana.add(buttonCancel);
		
		JLabel labelName = new JLabel("Name: ");
		JLabel labelLastName = new JLabel("Lastname: ");
		JLabel labelCURP = new JLabel("El CURP: ");
		
		JTextField txtName = new JTextField(6);
		JTextField txtLastName = new JTextField(20);
		JTextField txtCURP = new JTextField(20);
		
		JPanel panel_data = new JPanel();
		JPanel panel_buttons = new JPanel();
		panel_data.setLayout(layoutGrid);
		panel_buttons.setLayout(layoutGrid);
		
		panel_data.add(labelName);
		panel_data.add(txtName);
		panel_data.add(labelLastName);
		panel_data.add(txtLastName);
		panel_data.add(labelCURP);
		panel_data.add(txtCURP);
		
		panel_buttons.add(buttonOk);
		panel_buttons.add(buttonCancel);
		
		mi_ventana.add(panel_data,BorderLayout.CENTER);
		mi_ventana.add(panel_buttons,BorderLayout.SOUTH);
		
		buttonOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nameS = txtName.getText();
				String lastNameS = txtLastName.getText();
				String CURPS = txtCURP.getText();
				System.out.println(nameS);
				System.out.println(lastNameS);
				System.out.println(CURPS);
				
			}});
		buttonCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se pulso el boton Cancel");
				
			}});
		
		
		/*mi_ventana.add(labelName);
		mi_ventana.add(txtName);
		
		mi_ventana.add(labelLastName);
		mi_ventana.add(txtLastName);
		
		mi_ventana.add(labelCURP);
		mi_ventana.add(txtCURP);*/
		

	}

}
