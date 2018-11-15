package ui.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ui.MainPanel;
import ui.buttons.ListButtonListener;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

@Component
public class MainPanelBean {

    @Bean(name = {"mainTable"}, initMethod = "init")
    public MainPanel createMainPanel(@Qualifier("itemScrollPanel") JScrollPane itemScrollPanel,
                                     @Qualifier("buttonPanel") MainPanel buttonPanel) {

        List list = Arrays.asList(itemScrollPanel, buttonPanel);

        MainPanel mainPanel = new MainPanel();
        mainPanel.setAxis(1);
        mainPanel.setComponentList(list);
        return mainPanel;
    }

    @Bean(name = {"buttonPanel"}, initMethod = "init")
    public MainPanel createButtonPanel(@Qualifier("deleteButton") ListButtonListener deleteButton,
                                       @Qualifier("addButton") ListButtonListener addButton) {

        List list = Arrays.asList(addButton, deleteButton);

        MainPanel buttonPanel = new MainPanel();
        buttonPanel.setAxis(0);
        buttonPanel.setComponentList(list);
        return buttonPanel;
    }

}
