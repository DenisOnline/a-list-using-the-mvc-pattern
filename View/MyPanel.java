package View;

import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanel extends JPanel {
    Controller controller;
    
    public MyPanel() {
        JButton buttonStack = new JButton("Stack");
        JButton buttonQueue = new JButton("Queue");
        JButton buttonInput = new JButton("Вставить");
        JButton buttonAnswer = new JButton("Вывести");
        JTextField inputLine = new JTextField(5);
        JTextField lineAnswer = new JTextField(10);
        
        buttonStack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setStack();
            }
        });
        buttonQueue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setQueue();
            }
        });
        buttonInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.pushList(Integer.parseInt(inputLine.getText()));
                inputLine.setText("");
            }
        });
        buttonAnswer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lineAnswer.setText(controller.listToString());
            }
        });
        
        add(buttonStack);
        add(buttonQueue);
        add(inputLine);
        add(buttonInput);
        add(lineAnswer);
        add(buttonAnswer);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}