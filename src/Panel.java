import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private TextArea textArea = null;
    private MenuBar menuBar = null;

    public Panel() {
        setLayout(new BorderLayout());
        textArea = new TextArea();
        menuBar = new MenuBar();
        add(menuBar, BorderLayout.NORTH);
        add(textArea, BorderLayout.CENTER);
    }

}
