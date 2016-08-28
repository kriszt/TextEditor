import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private JPanel panel = null;
    private JMenuBar menuBar = null;
    private JTextArea textArea = null;

    public Frame() {
        setTitle("Text Editor - Untitled");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        initComponents();

        setVisible(true);

    }

    private void initComponents() {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        textArea = new JTextArea();

        menuBar = new JMenuBar();
        //build menu

        panel.add(menuBar, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);

        add(panel);
    }

}
