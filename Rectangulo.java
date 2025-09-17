public class Rectangulo extends Figura{
    private final double ancho;
    private final double alto;

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    
    /**
     * Metodo que caclcula el area del Rectangulo
     * @return: el area del Rectangulo de tipo double
     */
    @Override
    public double area() {
        return ancho*alto;
    }

    /**
     * Metodo que caclcula el perimetro del Rectangulo
     * @return: el perimetro del Rectangulo de tipo double
     */
    @Override
    public double perimetro() {
        return 2*ancho + 2*alto;
    }
    
}
