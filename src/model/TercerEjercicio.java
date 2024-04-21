package model;

import javax.swing.*;

public class TercerEjercicio {
    private static final String TITLE = "Validar números primos";
    public int readNumber() {
        int value = 0;
        boolean tried = false;
        while (!tried){
            String num = JOptionPane.showInputDialog(null, "Digite un número", TITLE, JOptionPane.DEFAULT_OPTION);
            try {
                if (num != null) {
                    tried = true;
                    return Integer.parseInt(num);
                } else {
                    JOptionPane.showMessageDialog(null, "Sesión finalizada", TITLE, JOptionPane.ERROR_MESSAGE);
                    tried = true;
                    return 700;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Debe ingresar números", TITLE, JOptionPane.ERROR_MESSAGE);
                tried = false;
            }
        }
        return value;
    }

    public void calculateAward() {
        boolean tried = false;
        int input;
        while (!tried){
            input = readNumber();
            if (input != 700){
                if (input % 2 == 0 ){
                    JOptionPane.showMessageDialog(null, "El número es par", TITLE, JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "El número es impar", TITLE, JOptionPane.ERROR_MESSAGE);
                }
            }else {
                tried = true;
            }
        }
    }

    public static void main(String[] args) {
        TercerEjercicio primer = new TercerEjercicio();
        primer.calculateAward();
    }
}
