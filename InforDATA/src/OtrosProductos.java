import Interface.Interface;

import java.util.Date;

public abstract class OtrosProductos implements Interface {
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

    @Override
    public void reset(){
        System.out.println("Reseteando Otros...");
    }
}
