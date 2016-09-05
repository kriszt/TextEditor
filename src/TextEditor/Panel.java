package TextEditor;

import javax.swing.*;
import java.awt.BorderLayout;


public class Panel extends JPanel {

    private TextArea textArea;
    private MenuBar menuBar;
    private JScrollPane scrollPane;

    public Panel() {
        setLayout(new BorderLayout());
        textArea = new TextArea();
        menuBar = new MenuBar();
        scrollPane = new JScrollPane(textArea);
        add(menuBar, BorderLayout.NORTH);
        add(scrollPane,BorderLayout.CENTER);
    }

}
