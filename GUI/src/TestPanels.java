import java.awt.*;
import javax.swing.*;

public class TestPanels extends JFrame {
	
	public TestPanels() {
    // Panel p1: botones (4x3)
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(4, 3, 5, 5));

    // Botones del 1 al 9
    for (int i = 1; i <= 9; i++) {
        p1.add(new JButton(String.valueOf(i)));
    }

    // Botones 0, Start y Stop
    p1.add(new JButton("0"));
    p1.add(new JButton("Start"));
    p1.add(new JButton("Stop"));

    // Panel p2: campo de texto + p1
    JPanel p2 = new JPanel(new BorderLayout(5, 5));

    JTextField textField = new JTextField("Time to be displayed here");
    p2.add(textField, BorderLayout.NORTH);

    p2.add(p1, BorderLayout.CENTER);

    // Agregar p2 al lado derecho
    add(p2, BorderLayout.EAST);

    // Botón central
    add(new JButton("Food to be placed here"), BorderLayout.CENTER);

}
}
