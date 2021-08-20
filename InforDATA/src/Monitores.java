import java.util.Date;

public class Monitores {
    int codigo;
    String modelo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDefinicionMaxima() {
        return definicionMaxima;
    }

    public void setDefinicionMaxima(String definicionMaxima) {
        this.definicionMaxima = definicionMaxima;
    }

    public int getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(int fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public String getPiazDeOrigen() {
        return piazDeOrigen;
    }

    public void setPiazDeOrigen(String piazDeOrigen) {
        this.piazDeOrigen = piazDeOrigen;
    }

    public Empreza getEmpreza() {
        return empreza;
    }

    public void setEmpreza(Empreza empreza) {
        this.empreza = empreza;
    }

    public Monitores(int codigo, String modelo, String definicionMaxima, int fechaCreada, String piazDeOrigen, Empreza empreza) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.definicionMaxima = definicionMaxima;
        this.fechaCreada = fechaCreada;
        this.piazDeOrigen = piazDeOrigen;
        this.empreza = empreza;
    }

    String definicionMaxima;
    int fechaCreada;
    String piazDeOrigen;
    Empreza empreza;
}
