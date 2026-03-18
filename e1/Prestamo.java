public class Prestamo {

    private int codigo;
    private String fecha;
    private Usuario Usuario;
    private Libro Libro;

    public Prestamo(int codigo, String fecha, Usuario usuario, Libro Libro) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.Usuario = usuario;
        this.Libro = Libro;
    }   

    public int getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public Libro getLibro() {
        return Libro;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUsuario(Usuario usuario) {
        Usuario = usuario;
    }

    public void setLibro(Libro libro) {
        Libro = libro;
    }


    public int calcularDuracion() {
        return 15;
    }
}
