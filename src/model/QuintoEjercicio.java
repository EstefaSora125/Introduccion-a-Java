package model;

public class QuintoEjercicio {
    public void additionNumbers() {
        int count = 0;
        for (int i = 100; i <= 200; i++) {
            count += i;
            System.out.println("Suma = "  + count);
        }
    }

    public static void main(String[] args) {
        QuintoEjercicio primer = new QuintoEjercicio();
        primer.additionNumbers();
    }
}
