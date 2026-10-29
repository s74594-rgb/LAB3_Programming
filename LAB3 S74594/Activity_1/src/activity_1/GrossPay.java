/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_1;
import javax.swing.JOptionPane;

public class GrossPay {
    public static void main(String[] args) {
        
        String hoursStr = JOptionPane.showInputDialog("hours worked:");
        double hours = Double.parseDouble(hoursStr);

        String payRateStr = JOptionPane.showInputDialog("hourly pay rate:");
        double payRate = Double.parseDouble(payRateStr);

        
        double grossPay = hours * payRate;

        JOptionPane.showMessageDialog(null, "Gross Pay: RM " + grossPay, "Gross Pay Result", JOptionPane.INFORMATION_MESSAGE);
    }
}