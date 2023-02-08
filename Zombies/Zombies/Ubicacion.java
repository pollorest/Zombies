public class Ubicacion {
    

     private String nombre;
     private float distancia;
     private int cantidadZ;

    public Ubicacion (String nombre, float distancia, int cantidad){
        this.nombre = nombre;
        this.distancia = distancia;
        this.cantidadZ = cantidad;
    }

    public String toString(){
        return "Nombre de la Ubicacion: "+nombre+"  Distancia a alejandria: "+distancia+" Cantidad de zombies: "+cantidadZ+"";
    }

    public int getCantidadZ() {
        return cantidadZ;
    }

    public void setCantidadZ(int cantidadZ) {
        this.cantidadZ = cantidadZ;
    }

    public float getDistancia(){
        return distancia;
    }

    public void setDistancia(){
        this.distancia = distancia;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    

}
