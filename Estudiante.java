public class Estudiante extends Persona{
    private boolean esRegular;
    private float promedio;
    private int cantidadMateriasAprobadas;

    public Estudiante(int dni, String nombre, String apellido, boolean esRegular){
        super(dni, nombre, apellido);
        this.esRegular = esRegular;
        this.promedio = 0;

    }       

    public boolean isEsRegular() {
        return esRegular;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setEsRegular(boolean esRegular) {
        this.esRegular = esRegular;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void aproboMateria(int nota){
        cantidadMateriasAprobadas++;
        promedio = nota/cantidadMateriasAprobadas;
    }
    
    @Override
    public void allInfo(){
        super.allInfo();
        System.out.println("Es regular?: " + esRegular);
        System.out.println("Promedio: " + promedio);
        System.out.println("Materias aprobadas: " + cantidadMateriasAprobadas);

    }
}
