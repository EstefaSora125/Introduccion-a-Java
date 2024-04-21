package model;

import javax.swing.*;

public class NovenoEjercicio {


    private static final String TITLE = "Realizar factura de sillas";
    private int PRICE = 40000;
    public int readQuantityChair() {
        int value = 0;
        boolean tried = false;
        while (!tried){
            String num = JOptionPane.showInputDialog(null, "Digite la cantidad de sillas", TITLE, JOptionPane.INFORMATION_MESSAGE);
            try {
                if (num != null) {
                    if (Integer.parseInt(num)<=0 ){
                        JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero", TITLE, JOptionPane.ERROR_MESSAGE);
                        tried = false;
                    }else{
                        tried = true;
                        return Integer.parseInt(num);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Sesión finalizada", TITLE, JOptionPane.ERROR_MESSAGE);
                    tried = true;
                    return 700;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Debe ingresar números", TITLE, JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }

    public void calculateSalesCheck() {
        boolean tried = false;
        int input;
        while (!tried){
            input = readQuantityChair();
            double total = PRICE * input;
            if (input == 700){
                tried = true;
            }else {
                if (input >= 40){
                    total = total * 0.70;
                } else if (input >= 12) {
                    total = total * 0.80;
                } else if (input>=5) {
                    total = total * 0.90;
                }
                JOptionPane.showMessageDialog(null, "El precio a apgar es: " + total, TITLE, JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }    public static void main(String[] args) {
        NovenoEjercicio primer = new NovenoEjercicio();
        primer.calculateSalesCheck();
    }
}
