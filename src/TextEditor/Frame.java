package TextEditor;

import javax.swing.*;

public class Frame extends JFrame {

    private Panel panel;

    public Frame() {
        setTitle("Text Editor - Untitled");
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel = new Panel();
        add(panel);
        setVisible(true);
    }

}
