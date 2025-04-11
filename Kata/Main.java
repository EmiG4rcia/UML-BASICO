package Kata;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int opcion;
//        String nombre;
//        String email;
//        while (true){
//            System.out.println("¿Deseas crear un nuevo Usuario?\nSi = 1\nNo = 0"); opcion=sc.nextInt();        sc.next();
//
//            if(opcion==1){
//                System.out.println("Ingresa el nombre del nuevo usuario: ");nombre=sc.next();
//                System.out.println("Ingresa el email del nuevo usuario: ");email= sc.next();
//
//                Usuario
//            }
//        }


        ArrayList<TicketSoporte>tickets=new ArrayList<>();


        //Inicializamos 3 tickets
        TicketSoporte t1= new TicketSoporte("Problema de inicio de Sesion", new Usuario("Emi","emi.almagro.2001@gmail.com") ); tickets.add(t1);
        TicketSoporte t2= new TicketSoporte("No se puede recibir el Token",new Usuario("Francis","francis2001@gmail.com"));tickets.add(t2);
        TicketSoporte t3= new TicketSoporte("Error desconocido",null);

        // Los agregamos a un Sistema de Soportes

        //Agregamos los primeros 2 tickets usando el constructor
        SistemaSoporte sistema1 = new SistemaSoporte(tickets);

        //Agregamos el tercer ticket mediante el metodo set correspondiente
        sistema1.setTicketSoportes(t3);

        //Asignamos un técnico a 2 de los tickets

        t1.asignarTecnico(new Tecnico(1,"Matias","Reestablecimiento de contraseñas"));
        t3.asignarTecnico(new Tecnico(2,"Rebeca","Ciberseguridad"));
        t1.cerrarTicket();

        System.out.println(sistema1.toString());



    }
}
