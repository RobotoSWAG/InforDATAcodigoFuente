import Interface.Interface;

public class Provedores implements Interface {
    String NIF;

    public Provedores(String NIF, String dirrecion, int fecha, int cantidad) {
        this.NIF = NIF;
        this.dirrecion = dirrecion;
        Fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public int getFecha() {
        return Fecha;
    }

    public void setFecha(int fecha) {
        Fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    String dirrecion;
    int Fecha;
    int cantidad;

    @Override
    public void reset(){
        System.out.println("Resetando Provedores...");
    }
}
