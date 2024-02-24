import domain.Contacto;
import domain.Contactos;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantos contactos quieres en tu lista de contactos");
        int numContactos = scan.nextInt();
        Contactos lista = new Contactos(numContactos);
        while(true){
            System.out.println("Bienvenido al menu de contactos");
            System.out.println("1. Crear un nuevo contacto");
            System.out.println("2. Verificar si el contacto ya existe");
            System.out.println("3. Listar tus contactos");
            System.out.println("4. Buscar un contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Verificar si completaste los contactos");
            System.out.println("7. Espacios disponibles de la lista de contactos");
            System.out.println("8. Salir");
            int opcion = scan.nextInt();
            String nombre;
            String apellido;
            int numero;
            switch(opcion){
                case 1:
                    System.out.println("Ingresa el nombre de la persona");
                    nombre = scan.next();
                    System.out.println("Ingresa el apellido de la persona");
                    apellido = scan.next();
                    System.out.println("Ingresa el numero de la persona");
                    numero = scan.nextInt();
                    Contacto persona = new Contacto(nombre,apellido,numero);
                    lista.crearContacto(persona);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre de la persona");
                    nombre = scan.next();
                    System.out.println("Ingresa el apellido de la persona");
                    apellido = scan.next();
                    System.out.println("Ingresa el numero de la persona");
                    numero = scan.nextInt();
                    Contacto personaBuscar = new Contacto(nombre,apellido,numero);
                    lista.elContactoExiste(personaBuscar);
                    break;
                case 3:
                    System.out.println("Estos son los contactos:");
                    lista.listarContactos();
                    break;
                case 4:
                    System.out.println("Ingresa los datos de la persona a buscar");
                    System.out.println("Ingresa el nombre de la persona");
                    nombre = scan.next();
                    System.out.println("Ingresa el apellido de la persona");
                    apellido = scan.next();
                    System.out.println("Ingresa el numero de la persona");
                    numero = scan.nextInt();
                    Contacto personaMostrar = new Contacto(nombre,apellido,numero);
                    lista.buscarContacto(personaMostrar);
                    break;
                case 5:
                    System.out.println("Ingresa el contacto que quieras eliminar:");
                    nombre = scan.next();
                    lista.eliminarContacto(nombre);
                    break;
                case 6:
                    System.out.println("Verifica el estado de la agenda");
                    lista.agendallena();
                    break;
                case 7:
                    System.out.println("Cuantos espacios disponibles te quedan");
                    lista.espaciosLibres();
                    break;
                case 8:
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Ingresa un valor valido");
            }
            if (opcion == 8)break;
        }
    }
}