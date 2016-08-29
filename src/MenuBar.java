import javax.swing.*;

public class MenuBar extends JMenuBar {

    private JMenu file = null;
    private JMenuItem newFile = null, openFile = null, saveFile = null, saveFileAs = null;

    public MenuBar() {
        file = new JMenu("File");
        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        saveFileAs = new JMenuItem("Save as");
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(saveFileAs);
        add(file);
    }

}
