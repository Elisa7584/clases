public class Videojuego {

    private String titulo;
    private int horas;
    private boolean prestado;
    private String genero;
    private String compania;

    public Videojuego(){
    this.horas = 10;
    this.prestado = false;
    this.titulo = "Dark Souls";
    this.genero = "Accion, aventura";
    this.compania = "Cositas";
    }
    public Videojuego(String titulo, int horas, String genero, String compania){
    this.titulo = titulo;
    this.horas = horas;
    this.genero = genero;
    this.compania = compania;
    }
    public Videojuego(String titulo, int horas){
    this.titulo = titulo;
    this.horas = horas;
    this.prestado = false;
    this.genero = "Accion, aventura";
    this.compania = "Cositas";
    }

    public void entregar(){
    prestado = true;
    }
    public void devolver(){
    prestado = false;
    }

public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public int getHoras() {
    return horas;
}
public void setHoras(int horas) {
    this.horas = horas;
}
public boolean isprestado() {
    return prestado;
}
public void setprestado(boolean prestado) {
    this.prestado = prestado;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}
public String getCompania() {
    return compania;
}
public void setCompania(String compania) {
    this.compania = compania;
}

public String toString() {
    return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", prestado=" + prestado + ", genero=" + genero
            + ", compania=" + compania + "]";
}
public static void main(String[] args) throws Exception {
    
}
}
