package Kata;

public class Usuario {
    static int contador;
    private int id;
    private String nombre;
    private String email;
    //private ArrayList<TicketSoporte>ticketSoportes;

    public Usuario(String nombre, String email){
        contador++;
        this.id=contador;
        this.nombre=nombre;
        this.email=email;

    }

//    public void addTicket(TicketSoporte ticketSoporte){
//        if(this.ticketSoportes==null)this.ticketSoportes=new ArrayList<>();
//        this.ticketSoportes.add(ticketSoporte); // se agrega a la lista el ticket recibido por parámetro
//    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
