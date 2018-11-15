package ui.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ui.buttons.AddButton;
import ui.buttons.DeleteButton;
import ui.buttons.ListButtonListener;

import javax.swing.*;
import java.util.List;

@Component
public class CreateButtonBeans {

    @Bean(name = "deleteButtonListener")
    public DeleteButton createDeleteButtonListener(JTable table, List list) {
        DeleteButton deleteButtonListener = new DeleteButton();
        deleteButtonListener.setTable(table);
        deleteButtonListener.setList(list);

        return deleteButtonListener;
    }

    @Bean(name = {"deleteButton"}, initMethod = "init")
    public ListButtonListener createDeleteButton(DeleteButton deleteButtonListener) {

        ListButtonListener deleteButton = new ListButtonListener();
        deleteButton.setText("Delete Button");
        deleteButton.addActionListener(deleteButtonListener);

        return deleteButton;
    }

    @Bean(name = "addButtonListener")
    public AddButton createAddButtonListener(JTable table, List list) {
        AddButton addButtonListener = new AddButton();
        addButtonListener.setTable(table);
        addButtonListener.setList(list);

        return addButtonListener;
    }

    @Bean(name = {"addButton"}, initMethod = "init")
    public ListButtonListener createAddButton(AddButton addButtonListener) {

        ListButtonListener addButton = new ListButtonListener();
        addButton.setText("Add Button");
        addButton.addActionListener(addButtonListener);

        return addButton;
    }

}
