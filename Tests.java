
import java.util.ArrayList;

public class Tests {
    public static void main(String[] args) {
        Persona p1 = new Persona(47321320,"Lucio","FF");
        Persona p2 = new Persona(377373773,"Lucas","LL");

        Estudiante est1 = new Estudiante(36363663, "Fabricio", "molar", false);
        Estudiante est2 = new Estudiante(36363663, "Sara", "molar", true);

        /* 
        Persona[] persons = new Persona[10];//Arreglo que contendra tanto Personas, como Estudiantes.
    
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = est1;
        persons[3] = est2;

        for(Persona person : persons) {
            person.allInfo();
        }
        */

        //Caja que guarda Persona y muestra su informacion con un metodo propio de persona
        Caja<Persona> c1 = new Caja<>();
        //El agregar la parametrizacion osea <tipo> es bueno para evitar errores, como en las listas y conjuntos
        c1.guardar(p1);
        c1.obtener().allInfo();

        //Caja que guarda un entero y lo muestra
        Caja<Integer> c2 = new Caja<>();
        c2.guardar(12);
        c2.mostrarInfo();

        //Caja que contiene un String y lo muestra en consola
        Caja<String> c3 = new Caja<>();
        c3.guardar("item");
        c3.mostrarInfo();

        ArrayList<Caja<?>> listaCaja = new ArrayList<>();
        listaCaja.add(c1);
        listaCaja.add(c2);
        listaCaja.add(c3);

        for(Caja<?> item: listaCaja){
            item.mostrarInfo();
        }
    }

}
