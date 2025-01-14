
package assignment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Fahrenheit to Celsius Conversion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel fahrenheitLabel = new JLabel("Enter Fahrenheit temperature:");
        JLabel celsiusLabel = new JLabel("Temperature in Celsius:");
        
        JTextField fahrenheitTextField = new JTextField();
        JTextField celsiusTextField = new JTextField();
        celsiusTextField.setEditable(false);
        
        JButton convertButton = new JButton("Convert!");
        
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    celsiusTextField.setText(String.format("%.2f", celsius));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(fahrenheitLabel);
        frame.add(fahrenheitTextField);
        frame.add(celsiusLabel);
        frame.add(celsiusTextField);
        frame.add(new JLabel()); 
        frame.add(convertButton);

        frame.setVisible(true);
    }
    
}
