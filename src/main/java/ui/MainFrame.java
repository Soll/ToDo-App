package ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {

    @Autowired
    @Qualifier("mainTable")
    private Container contentPane;

    public void init() {
        setSize(new Dimension(600, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setState(Frame.NORMAL);
        setContentPane(contentPane);
        setTitle("My TODO App");
        setVisible(true);

    }

}
