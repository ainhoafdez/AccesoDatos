package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Incidencia {

    private int id;
    private String usuario;
    private String excepcion;
    private LocalDate fecha;
    private LocalTime hora;

    public Incidencia(int id, String usuario, String excepcion, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.usuario = usuario;
        this.excepcion = excepcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", excepcion='" + excepcion + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(String excepcion) {
        this.excepcion = excepcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}