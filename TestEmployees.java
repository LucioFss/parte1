

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TestEmployees {
    /**
     * Metodo estatico que crea una lista enlazada con números aleatorios
     * @param cantElementos cantidad de números aleatorios dentro del la lista enlazada
     * @return LinkedList<Integer> con numeros aleatorios dentro
     */
    public static LinkedList<Integer> randomNumbers(int cantElementos){
            //se crea la lista que contendra los elementos aleatorios
            LinkedList<Integer> listaEnlazada = new LinkedList<>();
            //se crea un objeto random
            Random r1 = new Random();
            for(int i = 0; i < cantElementos; i++){
                //se añade un numero aleatorio de entre 100 y 200
                //el primer parametro es el aleatorio minimo, mientras que el segundo es el limite
                listaEnlazada.add(r1.nextInt(100,200));
            }
            //se retorna la lista con lo numeros aleatorios dentro
            return listaEnlazada;
            
        }
    
    public static boolean pertenece(ArrayList<Integer> list, int num){
        boolean encontrado = false;
        int i = 0;
        while(!encontrado && i<list.size()){
            if(list.get(i).equals(num)){
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
    public static void bubbleSort(ArrayList<Integer> lista){
        int n = lista.size();
        int temp;
        for(int i = 1; i<n; i++){
            for(int j = 0; j<n-1;j++){
                if(lista.get(j) > lista.get(j+1)){
                    temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                }
            }
        }


    }

    public static void main(String[] args) {
        /*
        Employee emp1 = new hourlyEmployee("lucas", 8, (float) 100.8987);
        emp1.calculatePayment();
        System.out.println("El empleado1 cobra: $" + emp1.getTotalSalary());
        */
        LinkedList<Integer> lista1 = randomNumbers(10);
        System.out.println(lista1.toString());

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(7);
        lista2.add(3);
        lista2.add(5);
        lista2.add(4);
        lista2.add(10);
        lista2.add(6);
        lista2.add(9);
        lista2.add(19);
        lista2.add(14);
        lista2.add(20);

        System.out.println(lista2.toString());
        bubbleSort(lista2);
        System.out.println(lista2.toString());
        
        


        


    }
}
