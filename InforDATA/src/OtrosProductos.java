import java.util.Date;

public class OtrosProductos {
    int codigo;

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

    public int getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(int fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public OtrosProductos(int codigo, String modelo, int fechaCreada) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.fechaCreada = fechaCreada;
    }

    String modelo;
    int fechaCreada;
}
