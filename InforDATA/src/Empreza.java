import Interface.Interface;

public abstract class Empreza implements Interface {
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isSoporteTecnico() {
        return soporteTecnico;
    }

    public void setSoporteTecnico(boolean soporteTecnico) {
        this.soporteTecnico = soporteTecnico;
    }

    public Cliente getDetallecliente() {
        return detallecliente;
    }

    public void setDetallecliente(Cliente detallecliente) {
        this.detallecliente = detallecliente;
    }

    public Empreza(String nombre, String dirrecion, int numeroEmpleados, int precio, boolean soporteTecnico, Cliente detallecliente) {
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.numeroEmpleados = numeroEmpleados;
        this.precio = precio;
        this.soporteTecnico = soporteTecnico;
        this.detallecliente = detallecliente;
    }

    String dirrecion;
    int numeroEmpleados;
    int precio;
    boolean soporteTecnico;
    Cliente detallecliente;

    @Override
    public void reset(){
        System.out.println("Reseteando Empreza...");
    }
}
