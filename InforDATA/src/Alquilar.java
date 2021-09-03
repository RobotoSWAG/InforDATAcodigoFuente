import Interface.Interface;

import java.sql.Time;

public class Alquilar implements Interface {
    int codigo;
    int tiempoDeAlquiler;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTiempoDeAlquiler() {
        return tiempoDeAlquiler;
    }

    public void setTiempoDeAlquiler(int tiempoDeAlquiler) {
        this.tiempoDeAlquiler = tiempoDeAlquiler;
    }

    public Monitores getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(Monitores resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    public CPU getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(CPU memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public Alquilar(int codigo, int tiempoDeAlquiler, Monitores resolucionMaxima, CPU memoriaPrincipal) {
        this.codigo = codigo;
        this.tiempoDeAlquiler = tiempoDeAlquiler;
        this.resolucionMaxima = resolucionMaxima;
        this.memoriaPrincipal = memoriaPrincipal;
    }

    Monitores resolucionMaxima;
    CPU memoriaPrincipal;

    @Override
    public void reset(){
        System.out.println("Reseteando Alquiler...");
    }
}
