public class Caja<T>{
    private T item;

    public Caja(){
        this.item = null;

    }
    
    public void guardar(T item){
        this.item = item;
    }

    /*
     * 
     */
    public T obtener(){
        return item;
    }

    public void mostrarInfo(){
        System.out.println(item.toString());
    }
}