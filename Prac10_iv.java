// Practical No. -- 10 (iv)
// Button Click 

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prac10_iv extends JFrame {

    private JLabel label;
    private JButton button;

    public Prac10_iv() {
        // Set up the JFrame
        setTitle("Button Click Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize label and button
        label = new JLabel("Click the button to change this text.", SwingConstants.CENTER);
        label.setBounds(30, 30, 240, 30); // Position label
        add(label);

        button = new JButton("Click Me");
        button.setBounds(100, 80, 100, 30); // Position button
        add(button);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button was clicked!");
            }
        });
    }

    public static void main(String[] args) {
        // Run the program
        Prac10_iv frame = new Prac10_iv();
        frame.setVisible(true);
    }
}
