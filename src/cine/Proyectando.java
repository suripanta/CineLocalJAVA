package cine;

public class Proyectando {
    int id;
    String titulo, inicio, fin, fecha;

    public Proyectando(int id, String titulo, String inicio, String fin, String fecha) {
        this.id = id;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    @Override
    public String toString() {
        return "Proyectando{" + "id=" + id + ", titulo=" + titulo + ", inicio=" + inicio + ", fin=" + fin + '}';
    }
    
    
}
