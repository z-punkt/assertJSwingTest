package de.webnexus;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

import static javax.swing.SwingUtilities.invokeAndWait;

/**
 * Simple application with just one button and a text field.
 *
 */
public class App extends JFrame
{
    private JPanel panelMain;
    private JTextField textField1;
    private JButton OKButton;

    public static final String MESSAGE = "Well, that escalated quickly!";

    public App() {
        OKButton.addActionListener(actionEvent -> textField1.setText(MESSAGE));
        setContentPane(panelMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args ) throws InvocationTargetException, InterruptedException {
        invokeAndWait(() -> new App());
    }
}
