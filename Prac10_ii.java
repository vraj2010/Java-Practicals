// Practical No. -- 10 (ii)
// Demonstrate various Mouse Handling Events 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prac10_ii extends JFrame implements MouseListener, MouseMotionListener {

    private JLabel label;

    public Prac10_ii() {
        // Set up the JFrame
        setTitle("Mouse Event Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to display event messages
        label = new JLabel("Perform a mouse event to see the message here.", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        add(label, BorderLayout.CENTER);    

        // Add MouseListener and MouseMotionListener to the frame
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // MouseListener methods

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered the window");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited the window");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
    }

    // MouseMotionListener methods

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse dragged to (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        // Run the program
        Prac10_ii frame = new Prac10_ii();
        frame.setVisible(true);
    }
}
