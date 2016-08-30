import javax.swing.*;

public class MenuBar extends JMenuBar {

    private JMenu file, edit;
    private JMenuItem newFile, openFile, saveFile, saveFileAs, copy, cut, paste, delete;

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

        edit = new JMenu("Edit");
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        delete = new JMenuItem("Delete");
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(delete);

        add(file);
        add(edit);
    }

}
