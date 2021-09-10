import Interface.Interface;

import java.util.Date;

public abstract class CPU implements Interface {
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

    public String getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(String memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public int getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(int fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public String getPaizDeOrigen() {
        return paizDeOrigen;
    }

    public void setPaizDeOrigen(String paizDeOrigen) {
        this.paizDeOrigen = paizDeOrigen;
    }

    public Empreza getEmpreza() {
        return empreza;
    }

    public void setEmpreza(Empreza empreza) {
        this.empreza = empreza;
    }

    public CPU(int codigo, String modelo, String memoriaPrincipal, int fechaCreada, String paizDeOrigen, Empreza empreza) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.memoriaPrincipal = memoriaPrincipal;
        this.fechaCreada = fechaCreada;
        this.paizDeOrigen = paizDeOrigen;
        this.empreza = empreza;
    }

    String memoriaPrincipal;
    int fechaCreada;
    String paizDeOrigen;
    Empreza empreza;

    @Override
    public void reset(){
        System.out.println("Reseteando CPU...");
    }

    public void estado()
    {
        System.out.println("Corriendo a 68% RAM Utilizado");
    }


}
