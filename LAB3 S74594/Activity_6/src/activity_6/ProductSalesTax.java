/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_6;
import javax.swing.JOptionPane;

public class ProductSalesTax {
    public static void main(String[] args) {
        String priceStr = JOptionPane.showInputDialog("Masukkan harga produk (RM):");
        double productPrice = Double.parseDouble(priceStr);

        double salesTax = productPrice * 0.06;
        double totalPrice = productPrice + salesTax;

        String output = String.format("Harga Asal: RM %.2f\nCukai Jualan (6%%): RM %.2f\nJumlah Keseluruhan: RM %.2f", 
                productPrice, salesTax, totalPrice);
        
        JOptionPane.showMessageDialog(null, output, "Pengiraan Jumlah Harga", JOptionPane.INFORMATION_MESSAGE);
    }
}
