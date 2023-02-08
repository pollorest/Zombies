public class Zombies{
     String nombre;
     int salud;
     int fechaNacimiento;
     String tipoDeSangre;

    public Zombies (String nombre, int salud, int fechaNacimiento, String tipoDeSangre){
        this.nombre = nombre;
        this.salud = salud;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDeSangre = tipoDeSangre;
    }
    public String toString(){
        return "Nombre: "+nombre+" salud: "+salud+" fecha de nacimiento: "+fechaNacimiento+" tipo de sangre: "+tipoDeSangre;
    }

    

}