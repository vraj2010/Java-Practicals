// Practical No. -- 10 (i)
// Demonstrate various Window Handling Events 

import javax.swing.*;
import java.awt.event.*;

public class Prac10_i extends JFrame implements WindowListener {

    public Prac10_i() {
        // Set up the JFrame
        setTitle("Window Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Add the WindowListener to the frame
        addWindowListener(this);

        // Label to display the event
        JLabel label = new JLabel("Perform a window event to see the message here.", SwingConstants.CENTER);
        add(label);
    }

    // Methods to handle each window event

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to close the window?", "Close Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            dispose();  // Close the window
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified (minimized)");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window deiconified (restored)");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }

    public static void main(String[] args) {
        // Run the program
     Prac10_i frame = new Prac10_i();
        frame.setVisible(true);
    }
}
