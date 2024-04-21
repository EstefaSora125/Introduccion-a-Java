package model;

import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class SeptimoEjercicio {

    private static final String TITLE = "Mostrar años cumplidos";
    private Date date;
    private LocalDate localDate;

    public SeptimoEjercicio(){
        this.date = new Date();
        this.localDate = this.date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public int showYearsCompleted() {
        int value = 0;
        boolean tried = false;
        while (!tried){
            String num = JOptionPane.showInputDialog(null, "Digite su edad", TITLE, JOptionPane.INFORMATION_MESSAGE);
            try {
                if (num != null) {
                    if (Integer.parseInt(num)<1 &&  Integer.parseInt(num)> 200){
                        JOptionPane.showMessageDialog(null, "La edad debe ser mayor a un año y menor a 100 años", TITLE, JOptionPane.ERROR_MESSAGE);
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

    public void calculateYears() {
        boolean tried = false;
        int input;
        String message = "Has cumplido años en:";
        while (!tried){
            input = showYearsCompleted();
            if (input == 700){
                tried = true;
            }else {
                for (int i = 0; i <= input; i++) {
                    int year = localDate.getYear() - i;
                    message += " " + year + "\n";
                }
                message = message.substring(0, message.length() - 1);
                JOptionPane.showMessageDialog(null, message, TITLE, JOptionPane.INFORMATION_MESSAGE);

                tried = true;
            }
        }
    }    public static void main(String[] args) {
        SeptimoEjercicio primer = new SeptimoEjercicio();
        primer.calculateYears();
    }
}
