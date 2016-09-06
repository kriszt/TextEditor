package TextEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;

public class MenuBar extends JMenuBar {

    JMenu file, edit;
    JMenuItem newFile, openFile, saveFile, saveFileAs, copy, cut, paste, delete;

    public MenuBar() {
        file = new JMenu("File");
        newFile = new JMenuItem(new AbstractAction("New") {
            public void actionPerformed(ActionEvent e) {
                System.out.println("new");
            }
        });
        openFile = new JMenuItem(new AbstractAction("Open") {
            public void actionPerformed(ActionEvent e) {
                System.out.println("open");
            }
        });
        saveFile = new JMenuItem(new AbstractAction("Save") {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save");
            }
        });
        saveFileAs = new JMenuItem(new AbstractAction("Save as") {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save as");
            }
        });
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);
        file.add(saveFileAs);

        edit = new JMenu("Edit");
        copy = new JMenuItem(new AbstractAction("Copy") {
            public void actionPerformed(ActionEvent e) {
                StringSelection selection = new StringSelection(Main.frame.panel.textPane.getSelectedText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, null);
            }
        });
        cut = new JMenuItem(new AbstractAction("Cut") {
            public void actionPerformed(ActionEvent e) {
                StringSelection selection = new StringSelection(Main.frame.panel.textPane.getSelectedText());
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, null);
                Main.frame.panel.textPane.replaceSelection("");
            }
        });
        paste = new JMenuItem(new AbstractAction("Paste") {
            public void actionPerformed(ActionEvent e) {
                String clipboardContent = null;
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                try {
                    clipboardContent = (String) clipboard.getData(DataFlavor.stringFlavor);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                Main.frame.panel.textPane.replaceSelection(clipboardContent);
            }
        });
        delete = new JMenuItem(new AbstractAction("Delete") {
            public void actionPerformed(ActionEvent e) {
                Main.frame.panel.textPane.replaceSelection("");
            }
        });
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(delete);

        add(file);
        add(edit);
    }

}
