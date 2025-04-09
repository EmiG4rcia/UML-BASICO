package Kata;

public class TicketSoporte {
    static int contador;
    private int id;
    private String descripcion;
    private Estado estado;
    private String fecha;
    private Usuario usuario;


    public TicketSoporte(String descripcion,String fecha){
        contador++;
        this.descripcion=descripcion;
        this.id=contador;
        this.estado=Estado.abierto;
        this.fecha=fecha;
    }



    //Se sobrecarga el constructor de modo que se puede instanciar la clase con o sin usuario
    public TicketSoporte(String descripcion, String fecha, Usuario usuario) {
        contador++;
        this.id =contador;
        this.descripcion = descripcion;
        this.estado = Estado.abierto;
        this.fecha = fecha;
        this.usuario = usuario;
    }


    //Establecemos un estado de "en proceso" para los tickets:
    public void procesarTicket(){
        System.out.println("Ticket en proceso...");
        estado=Estado.en_proceso;
    }

    public void cerrarTicket(){
        System.out.println("Cerrando el ticket...");
        estado=Estado.cerrado;

    }

    public void asignarTecnico(String tecnico){
        System.out.println("Se asigna al técnico "+tecnico+" para el ticket : "+id);
        procesarTicket();
    }

    //mostrar detalle


    @Override
    public String toString() {
        return "TicketSoporte{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                ", fecha='" + fecha + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
