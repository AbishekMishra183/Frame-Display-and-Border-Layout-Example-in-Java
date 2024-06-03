package day4;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame {
	public BorderLayoutExample() {
		 
		// Create components
		JButton northButton = new JButton("North");
		JButton southButton = new JButton("South");
		JButton eastButton = new JButton("East");
		JButton westButton = new JButton("West");
		JButton centerButton = new JButton("Center");

        // Add components to the layout
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);
        
        JPanel eastPanel = new JPanel(new GridLayout(1, 1));
        JButton eastButton1 = new JButton("East 1");
        
        
        
        eastPanel.add(eastButton1);
     
        
        JPanel westPanel = new JPanel(new GridLayout(1, 1)); // 1 rows, 1 column
        JButton westButton1 = new JButton("west");
       // Button b= new Button("click");
        //add(b);
      
        westPanel.add(westButton1);
		
		  // Create panels for East and West regions
        
        
        
      
    
    
        
        // Set layout manager for main panel
        JPanel mainPanel = new JPanel(new GridLayout(1, 2)); // 1 row, 1 columns
        mainPanel.add(westPanel);
        mainPanel.add(eastPanel);
        // Add main panel to the frame
        add(mainPanel);


        
    }
	 public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                BorderLayoutExample frame = new BorderLayoutExample();
	                frame.setVisible(true);
	            }
	        });

	}

}
