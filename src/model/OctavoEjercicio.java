package model;

import javax.swing.*;

public class OctavoEjercicio {

    private static final String TITLE = "Mostrar calificación";


    public String readCalification() {
        String value = "";
        boolean tried = false;
        while (!tried){
            String qualification = JOptionPane.showInputDialog(null, "Digite una calificación", TITLE, JOptionPane.DEFAULT_OPTION);
            try {
                if (qualification != null) {
                    tried = true;
                    return qualification.toUpperCase();

                } else {
                    JOptionPane.showMessageDialog(null, "Sesión finalizada", TITLE, JOptionPane.ERROR_MESSAGE);
                    tried = true;
                    return "Fin";
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Debe ingresar números", TITLE, JOptionPane.ERROR_MESSAGE);
            }
        }
        return value;
    }

    public void calculateCalification() {
        boolean tried = false;
        String input;
        while (!tried){
            input = readCalification();
            switch (input){
                case "A":
                    JOptionPane.showMessageDialog(null, "Exelente", TITLE, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "B":
                    JOptionPane.showMessageDialog(null, "Muy bien", TITLE, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "C":
                    JOptionPane.showMessageDialog(null, "Bien", TITLE, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "D":
                    JOptionPane.showMessageDialog(null, "Aprobado", TITLE, JOptionPane.INFORMATION_MESSAGE);

                    break;
                case "E":
                    JOptionPane.showMessageDialog(null, "Reprobado", TITLE, JOptionPane.INFORMATION_MESSAGE);

                    break;
                case "F":
                    JOptionPane.showMessageDialog(null, "Súper reprobado", TITLE, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "Fin":
                    tried= true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Calificación no válida", TITLE, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }    public static void main(String[] args) {
        OctavoEjercicio primer = new OctavoEjercicio();
        primer.calculateCalification();
    }
}
