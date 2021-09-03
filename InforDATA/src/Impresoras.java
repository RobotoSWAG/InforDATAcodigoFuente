import Interface.Interface;

import java.util.Date;

public class Impresoras implements Interface {
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

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(int fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public Impresoras(int codigo, String modelo, String velocidad, int fechaCreada) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.fechaCreada = fechaCreada;
    }

    String velocidad;
    int fechaCreada;

    @Override
    public void reset(){
        System.out.println("Reseteando Impresora...");
    }
}
