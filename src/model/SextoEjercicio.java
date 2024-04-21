package model;

public class SextoEjercicio {
    public void countNumbers() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SextoEjercicio primer = new SextoEjercicio();
        primer.countNumbers();
    }
}