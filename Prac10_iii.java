// Practical No. -- 10 (iii)
// Demonstrate various Keyboard Handling Events 

import javax.swing.*;
import java.awt.event.*;

public class Prac10_iii extends JFrame implements KeyListener {

    private JLabel label;

    public Prac10_iii() {
        // Set up the JFrame
        setTitle("Keyboard Event Demo");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label to display key event messages
        label = new JLabel("Press any key to see the event here.", SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(16f));
        add(label);

        // Add KeyListener to the frame
        addKeyListener(this);

        // Make sure the frame is focusable to capture key events
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    // KeyListener methods

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        // Run the program
        Prac10_iii frame = new Prac10_iii();
        frame.setVisible(true);
    }
}
