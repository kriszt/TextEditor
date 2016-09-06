package TextEditor;

import javax.swing.*;
import java.awt.BorderLayout;


public class Panel extends JPanel {

    TextPane textPane;
    MenuBar menuBar;
    JScrollPane scrollPane;

    public Panel() {
        setLayout(new BorderLayout());
        textPane = new TextPane();
        menuBar = new MenuBar();
        scrollPane = new JScrollPane(textPane);
        add(menuBar, BorderLayout.NORTH);
        add(scrollPane,BorderLayout.CENTER);
    }

}
