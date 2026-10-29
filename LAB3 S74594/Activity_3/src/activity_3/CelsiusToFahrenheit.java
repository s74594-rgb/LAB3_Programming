/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_3;

import javax.swing.JOptionPane;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        String inputStr = JOptionPane.showInputDialog(null, "Enter the temp in celcius:", "Celsius to Fahrenheit Converter", 
                JOptionPane.QUESTION_MESSAGE);
        double celsius = Double.parseDouble(inputStr);

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        String message = String.format("%.2f °C = %.2f °F", celsius, fahrenheit);
        JOptionPane.showMessageDialog(null, message, "Result after convert", JOptionPane.INFORMATION_MESSAGE);
    }
}