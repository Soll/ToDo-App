package ui.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ui.ItemTableModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

@Component
public class CreatePanelBeans {

    @Bean(name = {"itemScrollPanel"})
    public JScrollPane createItemScrollPanel(JTable itemTable) {
        return new JScrollPane(itemTable);
    }

    @Bean(name = {"itemTable"})
    public JTable createItemTable(ItemTableModel itemTableModel) {
        return new JTable(itemTableModel);
    }

    @Bean(name = {"itemTableModel"})
    public ItemTableModel createItemTableModel(ArrayList<String> itemList) {
        ItemTableModel itm = new ItemTableModel();
        itm.setItemList(itemList);
        return itm;
    }

    @Bean(name = {"itemList"})
    public ArrayList<String> createItemList() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Item 1", "Item 2", "Item 3"));
        return list;
    }

}
