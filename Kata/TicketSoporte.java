package Kata;

import java.time.LocalDate;

public class TicketSoporte {
    static int contador;
    private int id;
    private String descripcion;
    private Estado estado;
    private LocalDate fecha;
    private Usuario usuario;
    private Tecnico tecnico;


    public TicketSoporte(String descripcion){
        contador++;
        this.descripcion=descripcion;
        this.id=contador;
        this.estado=Estado.abierto;
        this.fecha=LocalDate.now();
        System.out.println("Creación del ticket Número "+contador);
    }



    //Se sobrecarga el constructor de modo que se puede instanciar la clase con o sin usuario
    public TicketSoporte(String descripcion, Usuario usuario) {
        contador++;
        this.id =contador;
        this.descripcion = descripcion;
        this.estado = Estado.abierto;
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        System.out.println("Creación del ticket Número "+contador);
    }


    //Establecemos un estado de "en proceso" para los tickets:
    public void procesarTicket(){
        System.out.println("Ticket número "+id+" en proceso...\n\n");
        estado=Estado.en_proceso;
    }

    public void cerrarTicket(){
        System.out.println("Cerrando el ticket número "+id+"...\n\n");
        estado=Estado.cerrado;

    }

    public void asignarTecnico(Tecnico tecnico){
        System.out.println("Se asigna al técnico para estar a cargo del ticket "+id+" al técnico: "+tecnico);
        procesarTicket();
    }

    //mostrar detalle-


    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fecha='" + fecha + '\'' +
                ", usuario=" + usuario +
                ", técnico asignado=" + tecnico +
                '}';
    }
}
