package ui.buttons;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ListButtonListener extends JButton {

    ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }
}
