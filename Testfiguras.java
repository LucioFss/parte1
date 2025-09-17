

public class Testfiguras{
    public static void main(String[] args) {
        Figura cir1 = new Circulo(20);
        System.out.println("El area del circulo es: " + cir1.area() + " " +
                            "El perimetro del circulo es: " + cir1.perimetro());

        Figura f2 = new Triangulo(10,10,10);
        System.out.println("El area del triangulo es: " + f2.area() + " " +
                            "El perimetro del triangulo es: " + f2.perimetro());
    }
}