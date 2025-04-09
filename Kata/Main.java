package Kata;

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


        Usuario u1 = new Usuario("Emi","gajallorhn@gmail.com");
        TicketSoporte t1 = new TicketSoporte("Primer Ticket","11/03/2025",u1);


        t1.asignarTecnico("Matias");
        System.out.println(t1.toString());



    }
}
