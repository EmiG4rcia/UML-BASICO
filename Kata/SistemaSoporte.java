package Kata;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaSoporte {

    private ArrayList <TicketSoporte> ticketSoportes = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

//    String d;
//    String f;
//    int opcion;
//    do{
//        System.out.println("Ingresa una descripcion para el ticket: ");d=sc.nextLine();
//        System.out.println("Ingresa la fecha del Ticket: ");f= sc.nextLine();
//        TicketSoporte t = new TicketSoporte(d,f);
//
//        ticketSoportes.add(t);
//
//        System.out.println("Si deseas dejar de crear tickets, ingresa 0. Caso contrario, ingresa cualquier otro valor: ");opcion=sc.nextInt(); sc.nextLine();
//
//    } while (opcion!=0);


    public SistemaSoporte(ArrayList<TicketSoporte> ticketSoportes) {
        this.ticketSoportes = ticketSoportes;
    }

    public void setTicketSoportes(TicketSoporte ticketSoporte){
        if(this.ticketSoportes==null)this.ticketSoportes=new ArrayList<>();
        this.ticketSoportes.add(ticketSoporte);
    }

    public void agregarTicket(TicketSoporte ticketSoporte){
        ticketSoportes.add(ticketSoporte);
    }

    public void listarTickets(){
        for(TicketSoporte t: ticketSoportes){
            t.toString();
        }
    }

    @Override
    public String toString() {
        return "SistemaSoporte{" +
                "ticketSoportes=" + ticketSoportes +
                ", sc=" + sc +
                '}';
    }
}
