package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JButton btnNew;
    private JButton btnDelete;
    private JPanel rootPanel;
    private JTable table1;

    public MainForm(){
        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width/2, dim.height / 2 - getSize().height/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setListeners();
    }
    private void setListeners()
    {
       btnNew.addActionListener(
           new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent actionEvent) {
                    new ContactForm();
                    dispose();
               }
           }
       );
    }
}
