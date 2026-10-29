/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_5;
import javax.swing.JOptionPane;

public class BMICalculator {
    public static void main(String[] args) {
        String weightStr = JOptionPane.showInputDialog("weight (in kg):");
        double weight = Double.parseDouble(weightStr);

        String heightStr = JOptionPane.showInputDialog("height (in meter, example: 1.75):");
        double height = Double.parseDouble(heightStr);

        double bmi = weight / (height * height);

        String resultMessage = String.format("weight: %.2f kg\nheight: %.2f m\nyour BMI: %.2f", weight, height, bmi);
        JOptionPane.showMessageDialog(null, resultMessage, "BMI result", JOptionPane.INFORMATION_MESSAGE);
    }
}