import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.io.IOException;
import java.io.RandomAccessFile;

public class PData extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField namefld;
    private JTextField streetfld;
    private JTextField cityfld;
    private JTextField statefld;
    private JTextField zipfld;

    private RandomAccessFile file;

    // Tamaño fijo de campos
    final int NAME_SIZE = 32;
    final int STREET_SIZE = 32;
    final int CITY_SIZE = 20;
    final int STATE_SIZE = 10;
    final int ZIP_SIZE = 10;

    final int RECORD_SIZE =
            2 * (NAME_SIZE + STREET_SIZE + CITY_SIZE + STATE_SIZE + ZIP_SIZE);

    private long currentRecord = 0;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PData frame = new PData();
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
    public PData() {

        try {
            file = new RandomAccessFile("address.dat", "rw");
        } catch (IOException e) {
            e.printStackTrace();
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 250);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(2, 4, 5, 5));

        JLabel namelbl = new JLabel("Name");
        namelbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(namelbl);

        namefld = new JTextField();
        panel.add(namefld);

        JLabel streetlbl = new JLabel("Street");
        streetlbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(streetlbl);

        streetfld = new JTextField();
        panel.add(streetfld);

        JPanel centerPanel = new JPanel();
        contentPane.add(centerPanel, BorderLayout.CENTER);

        JLabel citylbl = new JLabel("City");
        citylbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        centerPanel.add(citylbl);

        cityfld = new JTextField(10);
        centerPanel.add(cityfld);

        JLabel statelbl = new JLabel("State");
        statelbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        centerPanel.add(statelbl);

        statefld = new JTextField(10);
        centerPanel.add(statefld);

        JLabel ziplbl = new JLabel("Zip");
        ziplbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
        centerPanel.add(ziplbl);

        zipfld = new JTextField(10);
        centerPanel.add(zipfld);

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        JButton add = new JButton("Add");
        JButton first = new JButton("First");
        JButton next = new JButton("Next");
        JButton previous = new JButton("Previous");
        JButton last = new JButton("Last");
        JButton update = new JButton("Update");

        buttonPanel.add(add);
        buttonPanel.add(first);
        buttonPanel.add(next);
        buttonPanel.add(previous);
        buttonPanel.add(last);
        buttonPanel.add(update);

        // BOTON ADD
        add.addActionListener(e -> {
            try {
                file.seek(file.length());

                writeFixedString(namefld.getText(), NAME_SIZE);
                writeFixedString(streetfld.getText(), STREET_SIZE);
                writeFixedString(cityfld.getText(), CITY_SIZE);
                writeFixedString(statefld.getText(), STATE_SIZE);
                writeFixedString(zipfld.getText(), ZIP_SIZE);

                currentRecord = (file.length() / RECORD_SIZE) - 1;

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // FIRST
        first.addActionListener(e -> {
            try {
                if (file.length() > 0) {
                    currentRecord = 0;
                    readRecord(currentRecord);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // NEXT
        next.addActionListener(e -> {
            try {
                if ((currentRecord + 1) * RECORD_SIZE < file.length()) {
                    currentRecord++;
                    readRecord(currentRecord);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // PREVIOUS
        previous.addActionListener(e -> {
            try {
                if (currentRecord > 0) {
                    currentRecord--;
                    readRecord(currentRecord);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // LAST
        last.addActionListener(e -> {
            try {
                if (file.length() > 0) {
                    currentRecord = (file.length() / RECORD_SIZE) - 1;
                    readRecord(currentRecord);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // UPDATE
        update.addActionListener(e -> {
            try {

                file.seek(currentRecord * RECORD_SIZE);

                writeFixedString(namefld.getText(), NAME_SIZE);
                writeFixedString(streetfld.getText(), STREET_SIZE);
                writeFixedString(cityfld.getText(), CITY_SIZE);
                writeFixedString(statefld.getText(), STATE_SIZE);
                writeFixedString(zipfld.getText(), ZIP_SIZE);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    // LEER REGISTRO
    private void readRecord(long recordNumber) throws IOException {

        file.seek(recordNumber * RECORD_SIZE);

        namefld.setText(readFixedString(NAME_SIZE).trim());
        streetfld.setText(readFixedString(STREET_SIZE).trim());
        cityfld.setText(readFixedString(CITY_SIZE).trim());
        statefld.setText(readFixedString(STATE_SIZE).trim());
        zipfld.setText(readFixedString(ZIP_SIZE).trim());
    }

    // ESCRIBIR STRING FIJO
    private void writeFixedString(String s, int size) throws IOException {

        StringBuilder sb = new StringBuilder(s);

        if (sb.length() > size)
            sb.setLength(size);
        else {
            while (sb.length() < size) {
                sb.append(' ');
            }
        }

        file.writeChars(sb.toString());
    }

    // LEER STRING FIJO
    private String readFixedString(int size) throws IOException {

        char[] chars = new char[size];

        for (int i = 0; i < size; i++) {
            chars[i] = file.readChar();
        }

        return new String(chars);
    }
}