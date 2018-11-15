package ui;

import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.List;

public class MainPanel extends JPanel {

    private int axis;
    private List componentList;

    public void setAxis(int axis) {
        this.axis = axis;
    }

    public void setComponentList(List componentList) {
        this.componentList = componentList;
    }

    public void init() {
        setLayout(new BoxLayout(this, axis));

        for (Iterator iterator = componentList.iterator(); ((Iterator) iterator).hasNext(); ) {
            Component component = (Component) iterator.next();
            add(component);
        }
    }

}
