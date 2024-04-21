package model;

public class CuartoEjercicio {
    public void showNumbers() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
}

    public static void main(String[] args) {
        CuartoEjercicio primer = new CuartoEjercicio();
        primer.showNumbers();
    }
}
