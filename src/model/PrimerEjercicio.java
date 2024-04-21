package model;

import javax.swing.*;

public class PrimerEjercicio {
    private static final String TITLE = "Premios al azar";
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
            }
        }
        return value;
    }

    public void calculateAward() {
        boolean tried = false;
        int input;
        while (!tried){
            input = readNumber();
            if (input == 700){
                tried = true;
            }else if (input==100){
                JOptionPane.showMessageDialog(null, "Ganaste un premio", TITLE, JOptionPane.INFORMATION_MESSAGE);
                tried = true;
            }else {
                JOptionPane.showMessageDialog(null, "Sigue participando", TITLE, JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        PrimerEjercicio primer = new PrimerEjercicio();
        primer.calculateAward();
    }
}
