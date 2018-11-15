package ui.buttons;

import java.awt.event.ActionEvent;

public class AddButton extends AbstractButtonListener {
    public void actionPerformed(ActionEvent e) {
        list.add("New Item");
        table.revalidate();
    }
}
