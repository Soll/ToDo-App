package ui;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ItemTableModel extends AbstractTableModel {

    private List itemList;

    public int getRowCount() {
        return itemList.size();
    }

    public int getColumnCount() {
        return 1;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return itemList.get(rowIndex);
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        itemList.set(rowIndex, value);
    }

    public void setItemList(List itemList) {
        this.itemList = itemList;
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public String getColumnName(int column) {
        return "Items";
    }

}
