import java.util.Scanner;

public class Pruebas {
    
    public static void Menu (){
        while(true){
            System.out.println("Ingrese un numero de acuerdo a lo que quiera hacer " +"\n"+ "0: Detener la ejecucion del programa"+"\n" + "1: Ingresar datos del zombie "+"\n"
            + "2: Ver la informacion de los zombies almacenados "+"\n"+ "3: Ver la cantidad de zombies almacenados "+"\n"+ "4: Ver informacion de los zombies con tipo de sange O+ o AB+" 
            + "\n"+ "5: Ver informacion de los zombies que nacieron luego del 2000 "+"\n"+ "6: Disminuir a la mitad la salud de todos los zombies "+"\n"+ 
             "7: Ingresar nombre de la ubicacion, distancia a Alexandria y cantidad de Zombies de tal ubicación "+"\n"+ "8: Ver la informacion de todas las ubicaciones "+"\n"
            + "9: Ver la ciudad mas segura (La ciudad con menos zombies) "+"\n"+ "10: Ver las ubicaciones organizadas por la mas cercana a la mas lejana "+"\n"+ "11: Frase sobre zombies "+"\n"
            + "12: Asesinar Zombies"+"\n");
            Scanner t = new Scanner(System.in);
            int opcion = t.nextInt();
            if (opcion == 0){
                break;
            }
            switch (opcion){
                case 1: caseOne();
                break;
                case 2: caseTwo();
                break;
                case 3: caseThree();
                break;
                case 4: caseFour();
                break;
                case 5: caseFive();
                break;
                case 6: caseSix();
                break;
                case 7: caseSeven();
                break;
                case 8: caseEight();
                break;
                case 9: caseNine();
                break;
                case 10: caseTen();
                break;
                case 11: caseEleven();
                break;
                case 12: caseTwelve();
                break;
            }
        }
    }
    public static void caseOne(){
        Scanner t = new Scanner(System.in);
        
            System.out.print("Ingrese Nombre: ");
            String nombreZombie = t.next();
            System.out.print("Ingrese Salud: ");
            int saludZombie = t.nextInt();
            System.out.print("Ingrese año de nacimiento: ");
            int nacimientoZombie = t.nextInt();
            System.out.print("Ingrese tipo de sangre: ");
            String tipoSangreZombie = t.next();
            System.out.println("");
            Zombies z = new Zombies(nombreZombie, saludZombie, nacimientoZombie, tipoSangreZombie);
            BaseDeDatos.agregarZombie(z);
            
    }
    public static void caseTwo(){
        System.out.println("\n");
        BaseDeDatos.verBaseDatos();
    }
    public static void caseThree(){
        System.out.println("La cantidad de zombies registrados es : "+BaseDeDatos.cantidad()+"");
    }
    public static void caseFour(){
        BaseDeDatos.SoloSangre();
    }
    public static void caseFive(){
        BaseDeDatos.NacidosMasDosMil();
    }    
    public static void caseSix(){
        BaseDeDatos.mitadVida();
    }
    public static void caseSeven(){
        BaseDeDatos.ubicaciones();
    }
    public static void caseEight(){
        BaseDeDatos.MostarUbicaciones();
    }
    public static void caseNine(){
        BaseDeDatos.masSegura();

    }
    public static void caseTen(){
        BaseDeDatos.ubicacionesOrden();
    }
    public static void caseEleven(){
        BaseDeDatos.fraseAleatoria();
    }
    public static void caseTwelve(){
        BaseDeDatos.maquinaAsesina();
    }
}

