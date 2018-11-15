package ui.buttons;

import java.awt.event.ActionEvent;

public class DeleteButton extends AbstractButtonListener {
    public void actionPerformed(ActionEvent e) {
        int rowIndex = table.getSelectedRow();

        if (rowIndex == -1) {
            return;
        }

        if (table.isEditing()) {
            return;
        }

        list.remove(rowIndex);
        table.revalidate();
    }
}
