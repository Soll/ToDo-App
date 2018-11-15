package ui.buttons;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public abstract class AbstractButtonListener implements ActionListener {

    protected JTable table;
    protected List list;

    public void setTable(JTable table) {
        this.table = table;
    }

    public void setList(List list) {
        this.list = list;
    }
}
