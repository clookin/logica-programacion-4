package domain;

import java.util.ArrayList;
import java.util.Arrays;

public class Contactos {
    private Contacto persona[];
    private int contadorPersonas;
    private int maxContactos;

    public Contactos(int maximoContactos) {
        this.maxContactos = maximoContactos;
        this.persona = new Contacto[this.maxContactos];
    }
    public Contacto[] getPersona() {
        return this.persona;

    }

    public void setPersona(Contacto[] persona) {
        this.persona = persona;
    }
    public void crearContacto(Contacto persona) {
        boolean contactoExiste = elContactoExiste(persona);
//        agregar funcionalidad para agregar el contacto al array
        if(contadorPersonas < maxContactos && contactoExiste){
//            contadorPersonas verifica si es menor o igual a maxContactos, para saber hasta cuando agregar
           this.persona[contadorPersonas++] = persona;
//           Este selecciona la posicion del array para agregar a la persona
            System.out.println("Se agrego el contacto");
        } else {
            System.out.println("No se puede agregar el contacto");
        }
    }


    public boolean elContactoExiste(Contacto persona) {
        for (Contacto contacto : this.persona) {
//            ciclo para entrar al array y recorrerlo
//            condicional para saber si la persona que se ingresa se encuentra repetida, validando el numero
            if (contacto != null && persona.getTelefono() == contacto.getTelefono()) {
//                condicional para verificar el numero y si no es null, de serlo retornara falso para que podamos usar el metodo en otro lugar
                return false;
            }
//           El usuario no se encontro entonces retornamos True
        }
        return true;
    }
    public void listarContactos(){

        for (int i = 0; i < maxContactos; i++) {
            if (this.persona[i] != null) {
                System.out.println(i + " " + this.persona[i]);
            }
        }
    }
    public String buscarContacto(Contacto persona){
        String contactoExiste = "";
        for (Contacto contacto: this.persona){
            if (contacto != null && persona.getTelefono() == contacto.getTelefono()){
                System.out.println("El contacto se encontro "+ "Nombre: " + contacto.getNombre() + " Apellido: " + contacto.getApellido()+ " Telefono: "+contacto.getTelefono());
                contactoExiste = persona.getNombre();
            }
        }
        return contactoExiste;
    }
    public void eliminarContacto (String nombre) {
        for (int i = 0; i < this.persona.length; i++) {
//            String nombreContacto = this.persona[i].getNombre();
            if (this.persona[i]!=null) {
                if (this.persona[i].getNombre().equalsIgnoreCase(nombre)) {
                    this.persona[i] = null;
                    return;
                }
            }
        }
    }
    public boolean agendallena () {
        if(contadorPersonas == maxContactos){
//            verificar si contador personas tiene la misma cantidad
            System.out.println("La agenda esta llena");
            return true;
        } else{
            System.out.println("La agenda no esta llena");
            return false;
        }
    }
    public void espaciosLibres (){
        int contador =0;
        for (int i = 0; i < maxContactos; i++) {
            if (this.persona[i] == null){
                contador++;
            }
        }
        System.out.println("Quedan " + contador + " espacios libres.");
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contactos{");
        sb.append("persona=").append(Arrays.toString(persona));
        sb.append(", contadorPersonas=").append(contadorPersonas);
        sb.append('}');
        return sb.toString();
    }
}
