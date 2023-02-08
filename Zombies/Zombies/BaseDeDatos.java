import java.util.ArrayList;
import java.util.Scanner;
public class BaseDeDatos {
    static ArrayList <Zombies>listaDeZombies= new ArrayList<Zombies>();
    static ArrayList <Ubicacion>ListaDeUbicaciones= new ArrayList<Ubicacion>();
    
    public BaseDeDatos(){
        listaDeZombies= new ArrayList<Zombies>();
    }
    public static void agregarZombie(Zombies item){
        listaDeZombies.add(item);
        
    }
    
    public static void agregarUbicacion(Ubicacion item){
        ListaDeUbicaciones.add(item);
    }
    public static int cantidad(){
        int cant = listaDeZombies.size();
        return cant;
    }
    public static void verBaseDatos(){
        for(int i =0; i<listaDeZombies.size(); i++){
            System.out.println("Zombie["+(i+1)+"] : " + listaDeZombies.get(i).toString());
        }
    }
    public static void SoloSangre(){
        for(int i = 0; i<listaDeZombies.size();i++){
            if(listaDeZombies.get(1).tipoDeSangre.equals("o+") || listaDeZombies.get(1).tipoDeSangre.equals("ab+") );
            System.out.println("Zombie["+(i+1)+"] : " + listaDeZombies.get(i).toString());
        }
    }
    public static void NacidosMasDosMil(){
        for(int i = 0; i<listaDeZombies.size();i++){
            if(listaDeZombies.get(i).fechaNacimiento>=2000){
                System.out.println("Zombie["+(i+1)+"] : " + listaDeZombies.get(i).toString());
            }
        }
    }
    public static void mitadVida(){
        for(int i = 0; i<listaDeZombies.size();i++){
            int mitad = listaDeZombies.get(i).salud;
            int saludNueva = mitad/2;
        }
        for(int i =0; i<listaDeZombies.size(); i++){
            System.out.println("Zombie["+(i+1)+"] : " + listaDeZombies.get(i).toString());
        }
    }
    public static void ubicaciones(){
        Scanner u = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la ubicacion: ");
        String ubic = u.next();
        System.out.println("ingrese la distancia hasta alejandria: ");
        float dist = u.nextFloat();
        System.out.println("ingrese la cantiad de Zombies que hay: ");
        int cant = u.nextInt();

        Ubicacion ubica = new Ubicacion(ubic, dist, cant);
        ListaDeUbicaciones.add(ubica);
    }

    public static void MostarUbicaciones(){
        for(int i =0; i<ListaDeUbicaciones.size(); i++){
            System.out.println("Ubicacion["+(i+1)+"] : " + ListaDeUbicaciones.get(i).toString());
        }
    }
    public static void masSegura(){
        Ubicacion menor = ListaDeUbicaciones.get(0);
        for(int i = 1; i<ListaDeUbicaciones.size(); i++){
            if(ListaDeUbicaciones.get(i).getCantidadZ() <= menor.getCantidadZ()){
                menor = ListaDeUbicaciones.get(i);   
            }
        }
        System.out.println("La ubicacion mas segura es: "+ menor.toString());
    }

    public static void ubicacionesOrden(){
        Ubicacion[] lista = new Ubicacion[ListaDeUbicaciones.size()]; 
        int temp=0;
                for(int n=0;n<ListaDeUbicaciones.size();n++){
                            lista[n]=ListaDeUbicaciones.get(n);
                }
                for(int l=0;l<ListaDeUbicaciones.size();l++){
                    temp = 1;
                    Ubicacion primera=lista[l];
                    Ubicacion segunda = lista[l];
                    for(int m=l+1;m<lista.length;m++){
                    if(lista[m].getDistancia()<lista[l].getDistancia()){
                        primera=lista[m];
                        temp=m;
                    }
                    }
                    lista[temp]=segunda;
                    lista[l]=primera;
                }
        System.out.println("Las ubicaciones orden de cercania son:");
        System.out.println();
                for(int p=0;p<lista.length;p++){
                    System.out.println("Ubicacion "+(p+1)+": "+lista[p].toString());
                }  
    }

    public static void fraseAleatoria(){
        int numAleatorio = (int) (Math.random()*5);
        switch(numAleatorio){
            case 0: System.out.println("¡Siempre viviremos!");
            break;
            case 1: System.out.println("ODIO A LAS MOMIAS");
            break;
            case 2: System.out.println("Por mucho que corras no podrás escapar...");
            break;
            case 3: System.out.println("Soy vegano, lo mas cercano que como a los cerebros es coliflor");
            break;
            case 4: System.out.println("¿Los zombies zombielingües?");
            break;
        }
    }
    public static void maquinaAsesina(){
        System.out.println(listaDeZombies.size());
        System.out.println("¿Cuantos zombies desea asesinar?: ");
        Scanner c = new Scanner(System.in);
        int cuantos = c.nextInt();
               
        for(int i=0; i<cuantos; i++){
            int zombieMatar = (int)Math.random()*(listaDeZombies.size());
           listaDeZombies.remove(zombieMatar);
        }
        for(int i =0; i<listaDeZombies.size(); i++){
            System.out.println("Sobreviviente["+(i+1)+"] : " + listaDeZombies.get(i).toString());
        }

        
    }
}
