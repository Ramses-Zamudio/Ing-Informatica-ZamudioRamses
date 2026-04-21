import java.awt.*;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		TestPanels frame = new TestPanels();
        frame.setTitle("The Front View of a Microwave Oven");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}
