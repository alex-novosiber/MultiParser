package console;


import javax.swing.*;
import java.awt.*;


// Поместим в наше окно элемент ТекстовоеПоле и наполним его значенем:  
public class MessageConsole extends JFrame {
    static JTextArea textArea;

    public void MyWindow() throws HeadlessException {
        setTitle("hello");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        add(textArea);
        textArea.setText("Hello, Java Dive!\n");
        for (int i = 0; i < 20; i++) {
            textArea.setText(textArea.getText() + "ho ho ho Super\n");
        }
        setVisible(true);
    }
}