import Interface.Interface;

import java.util.Date;

public abstract class Cliente implements Interface {
    String DNI;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public int getFechaComprada() {
        return fechaComprada;
    }

    public void setFechaComprada(int fechaComprada) {
        this.fechaComprada = fechaComprada;
    }

    public Cliente(String DNI, int telefono, String domicilio, int fechaComprada) {
        this.DNI = DNI;
        this.telefono = telefono;
        Domicilio = domicilio;
        this.fechaComprada = fechaComprada;
    }

    int telefono;
    String Domicilio;
    int fechaComprada;

    @Override
    public void reset(){
        System.out.println("Reseteando Cliente...");
    }

    public void estado()
    {
        System.out.println("Existe :v");
    }
}
