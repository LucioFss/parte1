

public class Circulo extends Figura{
    private final double radio;
    private final double diametro;

    /*
     * skskksks
     */
    public Circulo(double radio){
        super();
        this.radio = radio;
        this.diametro = 2*radio;
    }

    /**
     * Metodo que caclcula el area del Circulo
     * @return el area del Circulo de tipo double
     */
    @Override
    public double area(){
        return ((radio*radio)*Math.PI);
    }
    /**
     * Metodo que caclcula el perimetro del Circulo
     * @return: el perimetro del Circulo de tipo double
     */
    @Override
    public double perimetro(){
        return Math.PI*diametro;
    }
}
