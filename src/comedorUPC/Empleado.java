package comedorUPC;
public class Empleado {
private String nombre;
private String identidad;
private int sueldo;
private int prima;
private String tipoEmpleado;

    public Empleado(String nombre, String identidad, int sueldo, int prima, String tipoEmpleado) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.sueldo = sueldo;
        this.prima = prima;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPrima() {
        return prima;
    }

    public void setPrima(int prima) {
        this.prima = prima;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

}
