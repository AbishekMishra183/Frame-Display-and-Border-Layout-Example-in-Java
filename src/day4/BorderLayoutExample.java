package day4;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("BorderLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons for BorderLayout regions
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton centerButton = new JButton("Center");

        // East panel with GridLayout
        JPanel eastPanel = new JPanel(new GridLayout(1, 1));
        eastPanel.add(new JButton("East 1"));

        // West panel with GridLayout
        JPanel westPanel = new JPanel(new GridLayout(1, 1));
        westPanel.add(new JButton("West 1"));

        // Add components to the frame using BorderLayout
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(centerButton, BorderLayout.CENTER);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BorderLayoutExample frame = new BorderLayoutExample();
            frame.setVisible(true);
        });
    }
}
