public class Triangulo extends Figura{

    //Campos que son los lados del triangu
    private final double a;
    private final double b;
    private final double c;

    /**
     * Costructor de la clase con tres lados cualquiera
     * @param tres doubles inicializando los campos a,b,c
     */
    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Metodo que caclcula el area del del triangulo
     * Nota: Math.sqrt es una funcion de math que permite calcular raices cubicas
     * @return: el area del triangulo de tipo double
     */
    @Override
    public double area(){
        double s = perimetro() / 2; //Se calcula el semiperimetro
        return Math.sqrt(s * (s - a) * ( s - b) * (s - c));
    }
    
    /**
     * Metodo que caclcula el perimetro del triangulo
     * @return: el perimetro del triangulo de tipo double
     */
    @Override
    public double perimetro(){
        return a + b + c;
    }
    
}

    

