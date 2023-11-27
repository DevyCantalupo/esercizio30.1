public class esercizio30di1 {
    public static void main(String[] args) {

        Punto p1 = new Punto(9.9, 3.3);

        System.out.println("x: " + p1.x());

        Punto p2 = new Punto(3.0, 9.0);
        System.out.println("p2 = p1 " + p2.equals(p1));
    }
}
